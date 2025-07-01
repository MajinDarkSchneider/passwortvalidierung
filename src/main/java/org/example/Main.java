package org.example;

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
}