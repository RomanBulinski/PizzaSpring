package Connfig;

import Implementation.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public IPizza pizza(){
        return  new PizzaExotix(12,"Exotic Pizza");
    }

    @Bean(name = "inna")
    public IOrder order(IPizza pizza){
        return  new Order(pizza);
    }

}
