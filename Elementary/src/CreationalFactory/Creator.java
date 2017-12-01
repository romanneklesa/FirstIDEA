package CreationalFactory;

public abstract class Creator {

    protected abstract Product factoryMethod(String name);

    public Product operation(String name){
        return factoryMethod(name);
    }
}
