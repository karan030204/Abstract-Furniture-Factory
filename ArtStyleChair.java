package DesignPattern.Abstract_Factory;

public class ArtStyleChair implements Chairs{

    @Override
    public int Price() {
        return 500;
    }

    @Override
    public String Design() {
        return "ArtStyle Chair";
    }

    @Override
    public int No_Of_Chairs() {
        return 10;
    }

}
