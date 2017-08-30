/*
 * Copyright Camelot Global. All rights reserved
 */
package org.mycomp.services;

/**
 *
 * @author mmkamm
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.mycomp.model.Attribute;
import org.mycomp.model.Entity;
import org.mycomp.model.MandotaryDataEnum;

/**
 *
 * @author mmkamm
 */
public class AddService {

//    public static void addEntity(File file, ) {
//        Entity entity = new Entity(siteName, url, username, passwrod);
//        StaticContent.passwords.getAllPasswordsList().add(entity);
//    }
    public static Entity gatherInfoForNewPass(Map<String, String> args) throws Exception {
        String serviceName;

        List<Attribute> otherAttributes = new ArrayList();

        if (args == null) {

            Scanner scan = new Scanner(System.in);

            Controller.println("site name:");
            serviceName = scan.nextLine();

            String answer = "";
            String label, value;
            while (answer.equalsIgnoreCase("n")) {
                Controller.println("add another attribute <label,value> ? (y/n):");
                answer = scan.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    Controller.println("label");
                    label = scan.nextLine();
                    Controller.println("value");
                    value = scan.nextLine();
                    otherAttributes.add(new Attribute(label, value));

                }
            }

        } else if (!dataValidation(args)) {
            throw new Exception("SiteName is mandotary");
        } else {
            serviceName = args.get(MandotaryDataEnum.SERVICE_NAME.getValue());
        }

        return new Entity(serviceName, otherAttributes);

    }

    public static boolean dataValidation(Map<String, String> args) {
        String siteName = args.get(MandotaryDataEnum.SERVICE_NAME.getValue());
        return siteName != null;
    }
}
