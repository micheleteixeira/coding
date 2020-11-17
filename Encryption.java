package encryption;

 
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * * @author Michele Silva
 */

public class Encryption {
    //method to to return the string 
        
        public String encrypt(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        
        String chosen_password = password;
        
        // Hashing
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] password_hash = digest.digest((chosen_password).getBytes("UTF-8"));

        // Convert the hash from binary to hexadecimal
        String hex_hashed_password = javax.xml.bind.DatatypeConverter.printHexBinary(password_hash);

        // Return the hashed password:
         return hex_hashed_password;
            
 
        }
        
}
