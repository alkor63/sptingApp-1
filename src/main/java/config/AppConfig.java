package config;

import model.driver.Driver;
import model.trsnsport.Bus;
import model.trsnsport.Car;
import model.trsnsport.Pickup;
import model.trsnsport.Transport;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Car getCar() {
        return new Car("BMW","X 5",2020, 4, 280);
    }

    @Bean(name = "bus")
    public Bus getBus() {return new Bus("ПАЗ","386",2002,5.3,23);}

    @Bean(name = "pickup")
    public Pickup getPickup() {return new Pickup("Nissan","Navarra",2011, 3.2, 1500);}

    @Bean(name = "carDriver")
    public Driver getCarDriver(@Qualifier("car")Transport transport){
        return new Driver("Водила легковушки ", transport);
    }

    @Bean(name = "busDriver")
    public Driver getBusDriver(@Qualifier("bus")Transport transport){
        return new Driver("Водила автобуса ", transport);
    }
    @Bean(name = "pickupDriver")
    public Driver getPickupDriver(@Qualifier("pickup")Transport transport){
        return new Driver("Водила пикапа ", transport);
    }
}
