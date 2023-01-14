package DesignPattern.Abstract_Factory;

public class OfficeSofa implements Sofa {
    @Override
    public int Price() {
        return 50000;
    }

    @Override
    public int Seat() {
        return 7;
    }

    @Override
    public String Design() {
        return "Office Sofa";
    }
}
