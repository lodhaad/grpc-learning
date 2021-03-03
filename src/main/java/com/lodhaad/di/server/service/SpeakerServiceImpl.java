package com.lodhaad.di.server.service;

import com.lodhaad.di.server.dm.Speaker;
import com.lodhaad.di.server.repo.SpeakerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepo repo ;

    public SpeakerServiceImpl (SpeakerRepo repo) {
        this.repo = repo ;
    }

    public void setRepo(SpeakerRepo repo) {

        this.repo = repo;
    }

    @Override
    public List<Speaker> findAllSpeakers(){

        return repo.findAll();
    }
}
