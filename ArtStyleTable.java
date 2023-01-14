package DesignPattern.Abstract_Factory;

public class ArtStyleTable implements Table{
    @Override
    public int Price() {
        return 5000;
    }

    @Override
    public String Design() {
        return "ArtStyle Table";
    }

    @Override
    public int Seat() {
        return 4;
    }
}
