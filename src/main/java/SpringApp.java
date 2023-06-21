import config.AppConfig;
import model.driver.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver = context.getBean("carDriver", Driver.class);
        driver.driverReadyToStart();

        driver = context.getBean("busDriver", Driver.class);
        driver.driverReadyToStart();

        driver = context.getBean("pickupDriver", Driver.class);
        driver.driverReadyToStart();
    }

}
