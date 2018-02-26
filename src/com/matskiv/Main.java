package com.matskiv;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {
//        NetworkTraining networkTraining = new NetworkTraining();
//        try {
//            networkTraining.reasWebSite("http://football.ua");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        FileTraining fileTraining = new FileTraining();
//        String s = null;
//        try {
//            s = fileTraining.readFromFile("C:\\Users\\ivanm\\Documents\\123.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    FullName fullName = new FullName();
    fullName.doMatch("Mats' Iv'an Stepan");
//    fullName.doMatch(s);
	// write your code here
    }
}
