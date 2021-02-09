import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanFirstHW =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanSecondHW =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanFirstCat = (Cat) applicationContext.getBean("cat");
        Cat beanSecondCat = (Cat) applicationContext.getBean("cat");

        System.out.println("Пара HelloWorld: " + (beanFirstHW == beanSecondHW));
        System.out.println("Пара Cat: " + (beanFirstCat == beanSecondCat));
    }
}