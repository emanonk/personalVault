/*
 * Copyright Camelot Global. All rights reserved
 */
package org.mycomp.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.mycomp.model.ArgsTypeEnum;
import org.mycomp.model.Attribute;

/**
 *
 * @author mmkamm
 */
public class CommandTokenizer {

    public CommandTokenizer() {
    }

    public Map<String, Object> commandTokenizer(String line) {
        Map<String, Object> commandTokenizerMap = new HashMap();
        List<String> options = new ArrayList();
        List<String> args = new ArrayList();
        List<Attribute> finalArgs;
        StringTokenizer st = new StringTokenizer(line);

        if (st.hasMoreElements()) {
            String command = st.nextElement().toString().toLowerCase().trim();
            commandTokenizerMap.put(ArgsTypeEnum.COMMAND.getType(), command);

            while (st.hasMoreElements()) {
                String arg = st.nextElement().toString().toLowerCase().trim();
                if (arg.startsWith("-")) {
                    options.add(arg);
                } else {
                    args.add(arg);
                }
            }
        }
        commandTokenizerMap.put(ArgsTypeEnum.OPTIONS.getType(), options);

        finalArgs = argsTokenizer(args);
        commandTokenizerMap.put(ArgsTypeEnum.ARGS.getType(), finalArgs);

        return commandTokenizerMap;

    }

    public List<Attribute> argsTokenizer(List<String> attributes) {
        List<Attribute> finalAttributes = new ArrayList();

        attributes.stream().map((attribute) -> new StringTokenizer(attribute, ":")).forEach((st) -> {
            finalAttributes.add(new Attribute(st.nextElement().toString(), st.nextElement().toString()));
        });

        return finalAttributes;
    }

}
