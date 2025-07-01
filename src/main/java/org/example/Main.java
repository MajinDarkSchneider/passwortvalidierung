package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

    }
    public static int stringLength(String password){
        return password.length();
    }
    public static boolean passwordLength(String password){
        if(stringLength(password)<8){
            return false;
        }
        return true;
    }
    public static boolean checkForNumber(String password){
        String[] splitString = password.split("");
        Pattern pattern = Pattern.compile("[0-9]");
        for (String s : splitString) {
            Matcher matcher = pattern.matcher(s);
            boolean matchFound = matcher.find();
            if(matchFound) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkForCharacterRequirement(String password){
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        Pattern lowerPattern = Pattern.compile("[a-z+]");
        Matcher lowerMatcher = lowerPattern.matcher(password);
        if(lowerMatcher.find()){
            hasLowercase = true;
        }
        Pattern upperPattern = Pattern.compile("[A-Z+]");
        Matcher upperMatcher = upperPattern.matcher(password);
        if(upperMatcher.find()){
            hasUppercase = true;
        }
        if(hasLowercase && hasUppercase){
            return true;
        }else{
            return false;
        }
    }
}