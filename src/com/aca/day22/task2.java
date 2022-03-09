package com.aca.day22;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        DefaultStack stack=new DefaultStack();
         int variant;
         int value;
        while (true){
            System.out.println("1.Pop");
            System.out.println("2.Push");
            System.out.println("3.Stat");
            variant=scanner.nextInt();
            switch (variant) {
                case 1 -> System.out.println(stack.pop());
                case 2 -> {
                    System.out.println("Input value");
                    value = scanner.nextInt();
                    stack.push(value);
                }
                case 3 -> stack.printStack();
                default -> System.out.println("Error input");
            }
        }
    }
}
