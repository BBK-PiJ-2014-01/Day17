/**
 * Created by PierreM on 09/02/2015.
 */
public class Counter {

    private int n = 0;

    public synchronized void increase() {
        n++;
    }

    public int getCount() {
        return n;
    }
}