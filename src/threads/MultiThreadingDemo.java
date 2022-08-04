package threads;

class TimerThread implements Runnable {
    private int timer;

    public TimerThread(int timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        while (timer > 0) {
            System.out.println(timer);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            timer--;
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        TimerThread timer = new TimerThread(30);
        TimerThread timer2 = new TimerThread(60);

        Thread thirtySecondsTimer = new Thread(timer);
        Thread sixtySecondsTimer = new Thread(timer2);

        thirtySecondsTimer.start();
        sixtySecondsTimer.start();

        System.out.println("30 & 60 seconds timer started");
    }
}
