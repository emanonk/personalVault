/*
 * Copyright Camelot Global. All rights reserved
 */
package org.mycomp.view;

import java.io.File;
import org.mycomp.model.CommandEnum;
import org.mycomp.services.StaticContent;

/**
 *
 * @author mmkamm
 */
public class ConsolePrint {

    public static void printMenu(File file) {
        pr("Welcome to mypasses");
        pr("");
        if (file.getName().equals(StaticContent.DEFAULT_FILE_PATH)) {
            pr("You are using default file to save your passwords");
        }
        pr("For help press 'help'");
    }

    public static void printHelp() {
        CommandEnum[] commands = CommandEnum.values();
        for (CommandEnum command : commands) {
            pr(command.getName());
        }
    }

    private static void pr(String text) {
        System.out.println(text);
    }

}
