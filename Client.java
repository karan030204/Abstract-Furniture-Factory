package DesignPattern.Abstract_Factory;

import com.sun.security.jgss.GSSUtil;

public class Client {
    public static void main(String[] args) {

        System.out.println("---------------------ARTSTYLE FACTORY------------------");

        System.out.println();

        //ArtStyle Factory
        Abstract_Furtniture_Factory factory1  = new ArtStyleFactory();

        Chairs artStyleChair = factory1.createChair();
        Table artStyleTable = factory1.createTable();
        Sofa artStyleSofa = factory1.createSofa();


        //For ArtStyle Chairs
        System.out.println("Design of the Artstyle Chair : "+artStyleChair.Design());
        System.out.println("No. of ArtStyle Chairs: "+artStyleChair.No_Of_Chairs());
        System.out.println("Price Of ArtStyleChair : "+artStyleChair.Price());
        System.out.println();
        //For ArtStyle Sofa
        System.out.println("Design of the Artstyle Sofa : "+artStyleSofa.Design());
        System.out.println("Seat of ArtStyle Sofa: "+artStyleSofa.Seat());
        System.out.println("Price Of ArtStyle Sofa : "+artStyleSofa.Price());

        System.out.println();
        //For ArtStyle Table
        System.out.println("Design of the Artstyle Table : "+artStyleTable.Design());
        System.out.println("Seat of ArtStyle Table : "+artStyleTable.Seat());
        System.out.println("Price Of ArtStyle Table : "+artStyleTable.Price());

        System.out.println();
        System.out.println("-------------------OFFICE FACTORY------------------");
        System.out.println();

        //Office Factory
        Abstract_Furtniture_Factory factory2 = new OfficeFactory();
        Chairs officeChair = factory2.createChair();
        Table officeTable = factory2.createTable();
        Sofa officeSofa = factory2.createSofa();

        //for Office Chair
        System.out.println("Price of The Office Chair : "+officeChair.Price());
        System.out.println("Design of The Office Chair : "+officeChair.Design());
        System.out.println("Number of The Office Chair : "+officeChair.No_Of_Chairs());

        System.out.println( );

        //for Office Table
        System.out.println("Price of The Office Table : "+officeTable.Price());
        System.out.println("Design of The Office Table : "+officeTable.Design());
        System.out.println("Num of Seats of The Office Table : "+officeTable.Seat());

        System.out.println();
        //for Office Sofa
        System.out.println("Price of The Office Sofa : "+officeSofa.Price());
        System.out.println("Design of The Office Sofa : "+officeSofa.Design());
        System.out.println("Num of Seats of The Office Sofa : "+officeSofa.Seat());

    }
}
