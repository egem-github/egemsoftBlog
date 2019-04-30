package com.egemsoft;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Ex {

    public static void main(String[] args) {

        try {
            // Basit Encode
            String encodedString = Base64.getEncoder().encodeToString("Hasan".getBytes("utf-8"));
            System.out.println("encodedString: " + encodedString);

            // Basit Decode
            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
            System.out.println("decodedString: " + new String(decodedBytes, "utf-8"));

            // URL Encode
            String urlEncodedString = Base64.getUrlEncoder()
                    .encodeToString("http://www.google.com/xhtml".getBytes("utf-8"));
            System.out.println("urlEncodedString: " + urlEncodedString);

            // Url Decode
            byte[] urlDecodedBytes = Base64.getUrlDecoder().decode(urlEncodedString);
            System.out.println("urlDecodedBytes: " + new String(urlDecodedBytes, "utf-8"));

            // MIME Encode
            String mimeEncodedString = Base64.getMimeEncoder()
                    .encodeToString("JSIDAHFAasjhdasdksıdsajdhs".getBytes("utf-8"));
            System.out.println("mimeEncodedString: " + mimeEncodedString);

            // MIME Decode
            byte[] mimeDecodedBytes = Base64.getMimeDecoder().decode(mimeEncodedString);
            System.out.println("mimeDecodedBytes: " + new String(mimeDecodedBytes, "utf-8"));

        } catch (UnsupportedEncodingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

