package CreationalFactory;

public class Product2 implements Product{
    private String name;

    public Product2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
