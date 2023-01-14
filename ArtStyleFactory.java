package DesignPattern.Abstract_Factory;

public class ArtStyleFactory implements Abstract_Furtniture_Factory{

    @Override
    public Chairs createChair() {
        return new ArtStyleChair();
    }

    @Override
    public Table createTable() {
        return new ArtStyleTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtStyleSofa();
    }
}
