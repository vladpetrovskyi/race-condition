package v.p;

import java.math.BigInteger;
import v.p.threads.FirstThread;
import v.p.threads.SecondThread;

public class Main {

    private volatile static Integer I = 0;

    public static void main(String[] args) {
        FirstThread runnable = new FirstThread();
        Thread thread1 = new Thread(runnable);
        SecondThread thread2 = new SecondThread();

        BigInteger integer = new BigInteger("0");
        runnable.setI(integer);
        thread2.setI(integer);

        thread1.start();
        thread2.start();
    }
}
