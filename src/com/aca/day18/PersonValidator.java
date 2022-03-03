package com.aca.day18;

public class PersonValidator {
    private PersonValidator() {
    }
    public static boolean testRangeName(String name, int start, int end){
        return name!=null && ( name.length() >= start && name.length() <= end);
    }
    public static boolean passportIdValidator (String passportId ){
        return passportId != null && (passportId.length() == 8 && ((passportId.substring(0, 2).equals("AN")) && isNum(passportId.substring(2))));
    }
    public static boolean ageValidator(int age){
        return age > 18 && age < 99;
    }
    public static boolean genderValidator(String gender){
       return !(gender == null || (gender.compareToIgnoreCase("male") != 0 &&
                gender.compareToIgnoreCase("female") != 0));
    }
    private static boolean isNum(String str) {
        {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }

    }
}
