package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    Product produs1 = new Product("lapte", 10, "JLC");
        Product produs2 = new Product("zahar", 24.13, "domnita");
        Product produs3 = new Product("paine", 7, "franzeluta");
        Product produs4 = new Product("unt", 16.43, "JLC");
        Product produs5 = new Product("ciocolata", 29.52, "milka");


        System.out.println("\tMENU");
        System.out.println("1.Product info");
        System.out.println("2.Total price");
        System.out.println("3.EXIT");
        int menu = sc.nextInt();
        switch (menu) {
            case 1: System.out.print("\tNumarul produsului: ");
                    int prod = sc.nextInt();
                    switch (prod) {
                        case 1: System.out.println("Denumire:" + produs1.denumire);
                                System.out.println("Pret:" + produs1.pret);
                                System.out.println("Producator:" + produs1.producator);
                                break;
                        case 2: System.out.println("Denumire:" + produs2.denumire);
                                System.out.println("Pret:" + produs2.pret);
                                System.out.println("Producator:" + produs2.producator);
                                break;
                        case 3: System.out.println("Denumire:" + produs3.denumire);
                                System.out.println("Pret:" + produs3.pret);
                                System.out.println("Producator:" + produs3.producator);
                                break;
                        case 4: System.out.println("Denumire:" + produs4.denumire);
                                System.out.println("Pret:" + produs4.pret);
                                System.out.println("Producator:" + produs4.producator);
                                break;
                        case 5: System.out.println("Denumire:" + produs5.denumire);
                                System.out.println("Pret:" + produs5.pret);
                                System.out.println("Producator:" + produs5.producator);
                                break;
                        default: System.out.println("Nu exista asa produs");
                    }
                    break;
            case 2: double total = produs1.pret + produs2.pret + produs3.pret + produs4.pret + produs5.pret;
                    System.out.println("Pret total: " + total);
                    break;
            case 3: System.exit(0); break;
            default: System.out.println("Ati introdus o optiune incorecta. INCERCATI DIN NOU!"); break;
        }



    }
}
