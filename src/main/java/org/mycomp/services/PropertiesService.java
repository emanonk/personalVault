package org.mycomp.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * Created by manoskammas on 14/11/2018.
 */
@Service
public class PropertiesService {

    @Value("#{'${encryptionKey}'}")
    private String encryptionKey;


}