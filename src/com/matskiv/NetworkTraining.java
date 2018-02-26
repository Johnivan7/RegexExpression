package com.matskiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkTraining {


    public String reasWebSite(String urlAdress) throws IOException {
       StringBuilder stringBuilder = new StringBuilder();
       String line;
       URL url = new URL(urlAdress);
        InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while ((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line);
        }
        System.out.println(stringBuilder);
       return stringBuilder.toString();
    }
}
