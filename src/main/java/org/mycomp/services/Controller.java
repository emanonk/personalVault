/*
 * Copyright Camelot Global. All rights reserved
 */
package org.mycomp.services;

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import org.mycomp.model.ArgsTypeEnum;
import org.mycomp.model.CommandEnum;
import org.mycomp.view.ConsolePrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

/**
 *
 * @author mmkamm
 */
@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private ApplicationArguments applicationArguments;


    public static void print(String text) {
        System.out.print(text);
    }

    public static void println(String text) {
        System.out.println(text);
    }

    public static String commandExecution(String line) {
        CommandTokenizer commandTokenizer = new CommandTokenizer();
        Map<String, Object> commandTokenizer1 = commandTokenizer.commandTokenizer(line);
        String command = (String) commandTokenizer1.get(ArgsTypeEnum.COMMAND.getType());

        if (command.toLowerCase().equals(CommandEnum.FIND.getName())) {

        } else if (command.toLowerCase().equals(CommandEnum.ADD.getName())) {
            //Add.gatherInfoForNewPass(args);
        } else if (command.toLowerCase().equals(CommandEnum.UPDATE.getName())) {

        } else if (command.toLowerCase().equals(CommandEnum.DELETE.getName())) {

        } else if (command.toLowerCase().equals(CommandEnum.HELP.getName())) {
            ConsolePrint.printHelp();
        } else if (command.toLowerCase().equals(CommandEnum.EXPORT.getName())) {

        } else if (command.toLowerCase().equals(CommandEnum.EXIT.getName())) {

        } else {

        }

        return "";
    }

    public void mainMenuLoop(File file) {
        System.out.println(Arrays.toString(applicationArguments.getSourceArgs()));

        String command = null;
        Scanner scan = new Scanner(System.in);
        while (!CommandEnum.EXIT.getName().equalsIgnoreCase(command)) {
            ConsolePrint.printMenu(file);

            command = scan.nextLine();

            commandExecution(command);
            
        }
    }

}
