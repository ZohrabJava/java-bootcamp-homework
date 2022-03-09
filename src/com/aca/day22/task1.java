package com.aca.day22;

import java.util.Scanner;

public class task1 {
    public static boolean convertExaption(String input){
        Scanner scanner=new Scanner(System.in);
        int a;
        try {
            a=Integer.parseInt(input);
        }catch (NumberFormatException e){
            System.out.println("Eror");
            return true;
        }
        System.out.println(a);
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input="";
        int a;
        input=scanner.nextLine();
        while(convertExaption(input)){
            input=scanner.nextLine();
        }

    }
}
