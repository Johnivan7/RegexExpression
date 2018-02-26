package com.matskiv;

import java.io.*;

public class FileTraining {

    public String readFromFile(String fileName) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null){
            stringBuilder.append(line);
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}
