package Implementation;

public class PizzaDrwala implements IPizza{

    private int price;
    private String name;

    public PizzaDrwala(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }



}
