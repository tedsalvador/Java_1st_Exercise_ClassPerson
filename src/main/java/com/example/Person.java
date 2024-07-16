package com.example;

public class Person {
    //Part_1
    private String name;
    private String firstName;
    private String numberDocument;
    private int yearBirth;
    //Part_2
    private String countryBirth;
    private char personGenere;

    public Person(String name, String firstName, String numberDocument, int yearBirth, String countryBirth, char personGenere) {
        this.name = name;
        this.firstName = firstName;
        this.numberDocument = numberDocument;
        this.yearBirth = yearBirth;
        //Part_2
        this.countryBirth = countryBirth;
        this.personGenere = personGenere;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    //Part_2
    public String getCountryBirth() {
        return countryBirth;
    }

    public char getPersonGenere() {
        return personGenere;
    }

    /*  Método que imprime en pantalla los datos de una persona */
    public void printData() {
    System.out.println("Nombre = " + name);
    System.out.println("Apellido = " + firstName);
    System.out.println("Número de documento de identidad = " + numberDocument);
    System.out.println("Año de nacimiento = " + yearBirth);
    //Part_2
    System.out.println("Pais de Nacimiento = " + countryBirth);
    System.out.println("Genero Persona = " + personGenere);
    System.out.println();
    }

/*     public static void main(String args[]) {
        Persona p1 = new Persona("Pedro","Pérez","1053121010",1998);
        Persona p2 = new Persona("Luis","León","1053223344",2001);
        p1.imprimir();
        p2.imprimir();
        } */
}
