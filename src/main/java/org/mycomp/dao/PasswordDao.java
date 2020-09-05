package org.mycomp.dao;

import java.util.List;

import org.mycomp.model.Credentials;

/**
 * Created by mmkamm on 21/01/2018.
 */
public interface PasswordDao {

    Credentials getCredentialsByServiceName(String serviceName);

    List<Credentials> getAllCredentials();


}
