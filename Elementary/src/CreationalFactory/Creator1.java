package CreationalFactory;

public class Creator1 extends Creator {
    private String name;

    public Creator1(String name){
        this.name = name;
    }

    @Override
    public Product factoryMethod(String name) {
        return new Product1(name);
    }
}
