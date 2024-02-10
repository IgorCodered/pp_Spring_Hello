import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean_1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean_2 =
                (HelloWorld) applicationContext.getBean("helloworld");


        System.out.println(bean_1.getMessage());

        Cat cat = (Cat) applicationContext.getBean("pet");
        Cat dog = (Cat) applicationContext.getBean("pet");

        System.out.println("Sravnivaem hellowrold: " + (bean_1 == bean_2));
        System.out.println("Sravnivaem cat: " + (cat == dog));
    }
}