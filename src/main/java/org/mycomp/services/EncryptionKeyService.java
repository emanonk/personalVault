/*
 * Copyright Camelot Global. All rights reserved
 */
package org.mycomp.services;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mmkamm
 */
public class EncryptionKeyService {

    public EncryptionKeyService() {
    }

    public boolean encryptionKeyValidation(String key) {

        final byte[] utf8Bytes;
        try {
            utf8Bytes = key.getBytes("UTF-8");

            if (utf8Bytes.length == 16) {
                return true;
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(EncryptionKeyService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
//        AdvancedEncryptionStandard aes = new AdvancedEncryptionStandard(key);
//        String encrypt;
//        try {
//            encrypt = aes.encrypt("testtest");
//        } catch (Exception ex) {
//            Logger.getLogger(EncryptionKeyService.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//
//        try {
//            aes.decrypt(encrypt);
//        } catch (Exception ex) {
//            Logger.getLogger(EncryptionKeyService.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//        return true;

    }

}
