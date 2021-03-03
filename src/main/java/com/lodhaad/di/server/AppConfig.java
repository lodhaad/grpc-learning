package com.lodhaad.di.server;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.lodhaad"})
public class AppConfig {

    /*
    @Bean (name = "speakerRepo")
    @Scope (value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerRepo getSpeakerRepo() {

        System.out.println("calling speaker Repo");
        return new SpeakerRepoImpl();
    }

    @Bean (name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        System.out.println("calling speaker service");
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepo());
        //service.setRepo(getSpeakerRepo());

        return service;
    }


     */
}
