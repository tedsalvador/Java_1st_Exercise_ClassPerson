package com.example;

public class App {
    private App() {
    }

    public static void main(String[] args) {

        Person p1 = new Person("Pedro","Pérez","1053121010",1998,"Brasil",'H');
        Person p2 = new Person("Luis","León","1053223344",2001,"Francia",'H');
        
        p1.printData();        
        p2.printData();
    }
}
