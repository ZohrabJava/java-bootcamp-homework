package com.aca.day18;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    public Person(String firstName,String lastName, String passportId, int age, String gender, String nationality) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPassportId(passportId);
        this.setAge(age);
        this.setGender(gender);
        this.setNationality(nationality);
    }

    public Person() {
        this.firstName="Xcho";
        this.lastName = "Karapetyan";
        this.passportId = "AN025122";
        this.age = 20;
        this.gender = "Male";
        this.nationality = "Armenia";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(testRangeName(firstName,3,15)){
            this.firstName = firstName;
            return;
        }
        System.out.println("Wrong first Name "+firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(testRangeName(lastName,6,20)){
            this.lastName = lastName;
            return;
        }
        System.out.println("Wrong last name "+lastName);
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        if(passportId==null || !(passportId.length()==8 &&( (passportId.substring(0,2).equals("AN")) && isNum(passportId.substring(2))))){
            System.out.println("Wrong Passport Id "+passportId);
            return;
        }
        this.passportId = passportId;
    }
    public boolean isNum(String str){{
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18 ||age>99){
            System.out.println("Wrong age "+age);
            return;
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender==null || (gender.compareToIgnoreCase("male") !=0 &&
                gender.compareToIgnoreCase("female") !=0) ){
            System.out.println("Wrong gender "+ gender);
            return;
        }
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public boolean testRangeName(String name, int start,int end){
        return name==null ||( name.length() >= start && name.length() <= end);
    }
    public void display(){
        System.out.println("First name is "+firstName +",Last name is "+lastName+",Passport id is " +passportId+
                ",Age is "+age+",Gender is "+gender+",Nationality is "+nationality);
    }

    public static void main(String[] args) {
        Person an=new Person("Ando","Hovhannisyan","AN123456",20,"MALE","Russia");
        an.display();
    }
}
