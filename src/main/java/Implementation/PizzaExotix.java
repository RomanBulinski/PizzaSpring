package Implementation;

public class PizzaExotix implements IPizza {

    private int price;
    private String name;

    public PizzaExotix(int price, String name) {
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
