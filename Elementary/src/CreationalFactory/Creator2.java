package CreationalFactory;

public class Creator2 extends Creator {
    private String name;

    public Creator2(String name) {
        this.name = name;
    }

    @Override
    protected Product factoryMethod(String name) {
        return new Product2(name);
    }
}
