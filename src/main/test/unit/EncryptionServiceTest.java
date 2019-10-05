package unit;

import org.junit.Before;
import org.junit.Test;
import org.mycomp.services.AdvancedEncryptionStandard;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by manoskammas on 14/11/2018.
 */
public class EncryptionServiceTest {


    AdvancedEncryptionStandard encryptionStandard;

    @Before
    void setEncryptionKey(){
        encryptionStandard = new AdvancedEncryptionStandard();
        encryptionStandard.setEncryptionKey("abcdefghijklmnop");
    }

    @Test
    public void encryptionTest() throws Exception {
        String encrypted = encryptionStandard.encrypt("hahaha");

        System.out.println(encrypted);


    }
}
