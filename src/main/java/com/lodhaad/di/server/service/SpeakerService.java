package com.lodhaad.di.server.service;

import com.lodhaad.di.server.dm.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAllSpeakers();
}
