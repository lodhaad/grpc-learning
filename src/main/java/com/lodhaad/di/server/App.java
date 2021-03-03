package com.lodhaad.di.server;

import com.lodhaad.di.server.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("app")
public class App {

    @Autowired
    SpeakerService service ;

    public void  run () {

        service.findAllSpeakers().forEach(speaker -> {
            System.out.println(speaker.getFirstName());
        });
    }

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);


        //SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        App app = appContext.getBean("app", App.class);

        app.run();
    }
}
