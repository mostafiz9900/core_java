package beSkilled;

public class NewThread2 extends Thread {

    public NewThread2() {
        super("Demo Thread");
        System.out.println("Chikd thread " + this);
        this.start();

    }
//This is the entry point for the secind thread

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread " + i);
                //La the thread sleep for a while
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child nterrupted");
        }
        System.out.println("Exit child thread.");
    }

}

class ExtendThread {

    public static void main(String[] args) {
        new NewThread2();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread  " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted ");
        }
        System.out.println("Msin thread exit ");
    }

}
