package DesignPattern.Abstract_Factory;

public class OfficeFactory implements Abstract_Furtniture_Factory{

    @Override
    public Chairs createChair() {
        return new OfficeChair();
    }

    @Override
    public Table createTable() {
        return new OfficeTable();
    }

    @Override
    public Sofa createSofa() {
        return new OfficeSofa();
    }
}
