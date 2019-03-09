package Implementation;


public class Order implements  IOrder{

    private IPizza pizza;

    public Order(IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println( "Zamowienie : "+pizza.getName()+" - cena : " + pizza.getPrice() + "zl." );

    }

}
