package DesignPattern.Abstract_Factory;

public class OfficeChair implements Chairs {
    @Override
    public int Price() {
        return 1500;
    }

    @Override
    public String Design() {
        return "Office Chair";
    }

    @Override
    public int No_Of_Chairs() {
        return 5;
    }
}
