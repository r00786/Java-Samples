package zomatosearch.example.com.zomatosearch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES_Encryption {

    public static void main(String[] args) throws Exception {
        //Generating Key For Encryption
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        // Generate Key
        SecretKey key = keyGenerator.generateKey();


        byte[] IV = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(IV);


        //File to be red
        File inputFile = new File(System.getProperty("user.dir") + "/rohit.txt");
        //File to be written using cipher text
        File outputFileEnc = new File(System.getProperty("user.dir") + "/rohit_enc.txt");
        //Decrypted File
        File outputFileDec = new File(System.getProperty("user.dir") + "/rohit_dec.txt");

        //Stream to read normal file
        FileInputStream inputStream = new FileInputStream(inputFile);
        //creating byte array of same length as of file
        byte[] inputBytes = new byte[(int) inputFile.length()];
        //Putting into byteArray
        inputStream.read(inputBytes);
        //getting the cipher text
        byte[] cipherText = encrypt(inputBytes, key, IV);
        //Writing encrypted text into file
        FileOutputStream outputStream = new FileOutputStream(outputFileEnc);
        outputStream.write(cipherText);
        outputStream = new FileOutputStream(outputFileDec);
        byte[] decrypted = new byte[(int) outputFileEnc.length()];
        FileInputStream fileInputStream = new FileInputStream(outputFileEnc);
        fileInputStream.read(decrypted);
        outputStream.write(decrypt(decrypted, key, IV));
        inputStream.close();
        outputStream.close();

    }

    public static byte[] encrypt(byte[] plaintext, SecretKey key, byte[] IV) throws Exception {
        //Get Cipher Instance
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        //Create SecretKeySpec
        SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");

        //Create IvParameterSpec
        IvParameterSpec ivSpec = new IvParameterSpec(IV);

        //Initialize Cipher for ENCRYPT_MODE
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

        //Perform Encryption
        byte[] cipherText = cipher.doFinal(plaintext);

        return cipherText;
    }

    public static byte[] decrypt(byte[] cipherText, SecretKey key, byte[] IV) throws Exception {
        //Get Cipher Instance
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        //Create SecretKeySpec
        SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");

        //Create IvParameterSpec
        IvParameterSpec ivSpec = new IvParameterSpec(IV);

        //Initialize Cipher for DECRYPT_MODE
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

        //Perform Decryption
        byte[] decryptedText = cipher.doFinal(cipherText);

        return decryptedText;
    }
}