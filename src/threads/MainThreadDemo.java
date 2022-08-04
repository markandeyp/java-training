package threads;

public class MainThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.printf("Current thread is : %s\n", main.getName());

        System.out.println("Sleeping for 5 seconds");

        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Thread is awake now");
    }
}
