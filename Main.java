package com.company;

public class Main {

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Hello world");
        }
        else {
            for (int i = 0;i < args.length; i++) {
                System.out.format("Hello world %s \n", args[i]);
            }
        }
    }
}
