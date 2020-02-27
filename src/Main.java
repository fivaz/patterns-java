import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello World!");

        Singleton instance = Singleton.getInstance();
        System.out.println(instance.getNbInstances());
        System.out.println(instance.getCreationDate());

        TimeUnit.SECONDS.sleep(3);

        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2.getNbInstances());
        System.out.println(instance2.getCreationDate());
    }
}
