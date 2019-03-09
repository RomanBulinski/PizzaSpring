import Connfig.Config;
import Implementation.IOrder;
import Implementation.Order;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {

//        IOrder order1 = new Order( new PizzaDrwala( 18, "PizzaDrwala" ));
//        order1.printOrder();
//
//        IOrder order2= new Order( new PizzaExotix( 22, "PizzaExotic" ));
//        order2.printOrder();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//1
//        IOrder order = (IOrder)context.getBean("inna");
//2
        IOrder order = context.getBean(Order.class);
        order.printOrder();

    }


}



