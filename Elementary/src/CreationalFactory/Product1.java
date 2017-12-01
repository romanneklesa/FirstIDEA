package CreationalFactory;

public class Product1 implements Product{
    private String name;

    public Product1(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
