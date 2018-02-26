package com.matskiv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullName {
    String pattern = ("([a-zA-Z}]{1,30}[\']{0,1}\\s{0,2}[a-zA-Z]{1,30}\\s{0,2}[a-zA-Z]{1,30})|(\\w\\s\\{0,2}\\.\\w\\s\\{0,2}\\.[a-zA-Z]{1,30})|([a-zA-Z]{1,30}\\w\\.\\w\\.)");

    Pattern p = Pattern.compile(pattern);

    //(^[A-Za-z]+)(^[A-Za-z]+)
    //+\w\v|\s\t"

    public void doMatch(String word) {
        Matcher M = p.matcher(word);
        System.out.println(("Validation for" +" "+ word +" "+ (M.matches() ? "passed" : "not passed")));


    }
}

