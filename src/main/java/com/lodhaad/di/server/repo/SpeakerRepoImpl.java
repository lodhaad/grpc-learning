package com.lodhaad.di.server.repo;

import com.lodhaad.di.server.dm.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepo")
public class SpeakerRepoImpl implements SpeakerRepo {

    @Override
    public List<Speaker> findAll() {

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker1 = new Speaker();
        speaker1.setFirstName("Aditya");
        speaker1.setLastName("Lodha");

        Speaker speaker2 = new Speaker();
        speaker2.setFirstName("Kabir");
        speaker2.setLastName("Lodha");

        speakers.add(speaker1);
        speakers.add(speaker2);

        return speakers;
    }


}
