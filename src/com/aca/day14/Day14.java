package com.aca.day14;

import java.util.Locale;
import java.util.Scanner;

public class Day14 {
    //Task1
    public static int length(String str) {
        return str.length();
    }

    //Task2
    public static char indexStr(String str, int index) {
        return str.charAt(index);
    }

    //Task3
    public static void containChar(String str, char ch) {
        System.out.println(str.contains(ch + ""));
    }

    //Task4
    public static int vowelsStr(String str) {
        str = str.toUpperCase(Locale.ROOT);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                sum++;
            }
        }
        return sum;
    }

    //Task5
    public static String reverse(String str) {
        StringBuilder revers = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            revers.append(str.charAt(i));
        }
        return revers.toString();
    }

    //Task6
    public static void countVowelsDigits(String str) {
        int sumDij = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sumDij++;
            }
        }
        System.out.printf("Number of vowels: %d (%.2f%%)", vowelsStr(str), ((double) vowelsStr(str) / str.length()) * 100);
        System.out.println();
        System.out.printf("Number of digits: %d (%.2f%%)", sumDij, ((double) sumDij / str.length()) * 100);
    }

    //Task7
    public static String caesarCode(String str, int n) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) + n > 'Z') {
                newStr += (char) (str.charAt(i) + n - 26);
            } else {
                newStr += (char) (str.charAt(i) + n);
            }
        }
        return newStr;
    }

    //Task8
    public static String palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return " is not Palindrome";
            }
        }
        return " is Palindrome";
    }

    //Task9
    public static String checkBinStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return " is NOT a binary string";
            }
        }
        return " is a binary string";
    }

    //Task10
    public static String hex(String str) {
        str = str.toUpperCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            if (!((str.charAt(i) >= '0' && str.charAt(i) <= '9') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'F'))) {
                return " is NOT a hex string";
            }
        }
        return " is a hex string";
    }

    //Task11
    public static String bin2Dec(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return "error: invalid binary string " + str;
            }
        }
        int dec = 0;
        int a = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                dec += a;
            }
            a *= 2;
        }
        return "The equivalent decimal number for binary " + str + " is: " + dec;
    }

    //Task12
    public static int duplicate(String str) {
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            boolean one = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    one = true;
                    break;
                }
            }
            if (one) {
                boolean too = true;
                for (int j = 0; j < str2.length(); j++) {
                    if (str.charAt(i) == str2.charAt(j)) {
                        too = false;
                        break;
                    }
                }
                if (too) {
                    str2.append(str.charAt(i));
                }
            }
        }
        return str2.length();
    }

    //Task13
    public static char duplicateCh(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean one = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    one = true;
                }
            }
            if (!one) {
                return str.charAt(i);
            }
        }
        return ' ';
    }

    //Task14
    public static int argument(String str, char ch) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1
//        System.out.println("Input  str");
//        String str=scanner.nextLine();
//        System.out.println(length(str));
        //Task2
//        System.out.println("Input str");
//        String str= scanner.nextLine();
//        System.out.println("Input index 0 to "+ (str.length()-1));
//        int index=scanner.nextInt();
//        System.out.println(indexStr(str,index));
        //Task3
//        System.out.println("Input str");
//        String str= scanner.nextLine();
//        System.out.println("Input char");
//        char ch=scanner.nextLine().charAt(0);
//        containChar(str,ch);
        //Task4
//        System.out.println("Input str");
//        String str= scanner.nextLine();
//        System.out.println(vowelsStr(str));
        //Task5
//        System.out.print("Enter a String: ");
//        String str= scanner.nextLine();
//        System.out.println("The reverse of the String "+ str +" is " +reverse(str));
        //Task6
//        System.out.print("Enter a String: ");
//        String str = scanner.nextLine();
//        countVowelsDigits(str);
        //Task7
//        System.out.print("Enter a plaintext string: ");
//        String str = scanner.nextLine();
//        str = str.toUpperCase(Locale.ROOT);
//        System.out.print("The ciphertext string is: ");
//        System.out.println(caesarCode(str, 3));
        //Task8
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(str+palindrome(str));
        //Task9
//        System.out.print ("Input binary number ");
//        String str= scanner.nextLine();
//        System.out.println(str+checkBinStr(str));
        //Task10
//        System.out.print ("Enter a hex string: ");
//        String str= scanner.nextLine();
//        System.out.println(str+hex(str));
        //Task11
//        System.out.print("Enter a Binary string:");
//        String str=scanner.nextLine();
//        System.out.println(bin2Dec(str));
        //Task12
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(duplicate(str));
        //Task13
//        System.out.println("Input str");
//        String str = scanner.nextLine();
//        System.out.println(duplicateCh(str));
        //Task14
//        System.out.println("Input str");
//        String str = scanner.nextLine();
//        System.out.println("Input char");
//        char ch = scanner.nextLine().charAt(0);
//        System.out.println(argument(str, ch));
    }
}
