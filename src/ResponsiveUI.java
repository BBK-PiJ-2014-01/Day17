import java.util.Scanner;

/**
 * Created by PierreM on 09/02/2015.
 */
public class ResponsiveUI implements Runnable {

    private Object lock = new Object();
    private int reference;

    public ResponsiveUI(int i) {
        this.reference = i;
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            ResponsiveUI responsiveUI = new ResponsiveUI(i);
            Thread t = new Thread(responsiveUI);
            t.start();
        }

    }

    @Override
    public void run() {
        System.out.println("Enter the duration (in ms) of task "+reference);
        synchronized (lock) {
            Scanner scanner = new Scanner(System.in);
            int time = scanner.nextInt();
        }
        System.out.println("Thread "+reference+" finished");
    }
}
