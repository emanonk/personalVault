package org.mycomp;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.mycomp.services.Controller;
import org.mycomp.services.StaticContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

//    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
//    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    @Autowired
    private Controller controller;

    private static List<String> argList;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mobile app "Title";"Category";"Username";"Password";"Website";"Comment"
        //to app otan kaneis export bgazei ta fields me mia seira kai meta oloi oi kodikoi akolouthoun auti tin seira.
        // opote egw edw tha prepei na exw ena default tropo all otan iparxoun kai alla field na uparxoun apothikeumena..kai na ginontai apply se ola ta pass
        //"fb"

//        LOG.info("Before Spring BootUp");
        new SpringApplicationBuilder(Main.class).headless(false).run(args);
        argList = Arrays.asList(args);
//        LOG.info("After Spring BootUp");

//        if (args.length == 0) {
//
//        } else {
//            //add -df -c facebook www.facebook.com username:manos password:ela12345 email:manos_kammas@hotmail.com
//            //file key:************
//            //result:added succefully
//
//            //if  I dont use default file
//            //add -f -c /home/Desktop/mypasses.xml facebook www.facebook.com username:manos password:ela12345 email:manos_kammas@hotmail.com
//            //if  I need help
//            //add -f /home/Desktop/mypasses.xml
//            //pass?
//            //sitename:
//            //url:
//            //add another attribute (y/n):
//            //label:username
//            //value:manos
//            //add another attribute (y/n):
//            //label:password
//            //value:ela12345
//            //an exw sindethei den mou zitaei password kai den mou prepei na dwsw kai arg gia arxeio giati exw dwsei otan sindethika
//            //ama exw sundethei thelw na einai etsi
//            //add -a facebook www.facebook.com username:manos password:ela12345 email:manos_kammas@hotmail.com
//            //result:added succefully
//            //service that reads args and passes to add method only args that is needed
//        }
//
//        Controller.mainMenuLoop(new File(StaticContent.DEFAULT_FILE_PATH));
    }
    @Bean
    public boolean startingTheApp(){
        controller.mainMenuLoop(new File(StaticContent.DEFAULT_FILE_PATH));
        System.out.println(argList);
        //Controller.mainMenuLoop(new File(StaticContent.DEFAULT_FILE_PATH));
        return false;
    }

}
