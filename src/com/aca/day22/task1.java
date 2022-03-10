package com.aca.day22;

import java.util.Scanner;

public class task1 {
    public static int convertExaption(){
        Scanner scanner=new Scanner(System.in);
        int a;
        String input="";
        while(true){
            System.out.println("Input num");
            input=scanner.nextLine();
            try {
                a=Integer.parseInt(input);
                break;
            }catch (NumberFormatException e){
                System.out.println("Eror");
            }

        }
        return a;
    }
    public static void main(String[] args) {
        int a=convertExaption();
        System.out.println("Input is true "+ a);

    }
}
