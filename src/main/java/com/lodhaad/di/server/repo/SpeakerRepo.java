package com.lodhaad.di.server.repo;

import com.lodhaad.di.server.dm.Speaker;

import java.util.List;

public interface SpeakerRepo {

    List<Speaker> findAll();
}
