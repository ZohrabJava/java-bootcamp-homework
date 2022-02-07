package com.aca.day5;

public class TestEmployee {
    public static void main(String[] args) {
        Employee ani=new Employee(1,"Ani","EPH",22,'f');
        Employee qiso=new Employee(2,"Qiso","AUA",21,'f');
        Employee ando=new Employee(3,"Ando","AUA",20,'m');
        Employee gexam=new Employee(4,"Gexam","EPH",24,'m');
        Employee abo=new Employee(5,"Abo","AUA",19,'m');
        ani.print();
        qiso.print();
        ando.print();
        gexam.print();
        abo.print();
    }
}
