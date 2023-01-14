package DesignPattern.Abstract_Factory;

public class ArtStyleSofa implements Sofa{

    @Override
    public int Price() {
        return 1000;
    }

    @Override
    public int Seat() {
        return 9;
    }

    @Override
    public String Design() {
        return "ArtStyle Sofa";
    }
}
