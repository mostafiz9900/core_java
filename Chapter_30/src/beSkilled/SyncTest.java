package beSkilled;

public class SyncTest extends Thread {

    public static void main(String[] args) {
        SyncTest s1 = new SyncTest();
        SyncTest s2 = new SyncTest();
        s1.start();
        s2.start();

    }

    static synchronized void print() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep((long) (3000 * Math.random()));

            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

    }

    @Override
    public void run() {
        synchronized (this) {
            print();
        }

    }

}
