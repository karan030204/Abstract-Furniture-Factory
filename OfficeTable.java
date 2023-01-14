package DesignPattern.Abstract_Factory;

public class OfficeTable implements Table{

    @Override
    public int Price() {
        return 25000;
    }

    @Override
    public String Design() {
        return "Office Table";
    }

    @Override
    public int Seat() {
        return 10;
    }
}


