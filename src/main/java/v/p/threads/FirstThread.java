package v.p.threads;

import java.math.BigInteger;

public class FirstThread implements Runnable {

    private BigInteger i;

    public void setI(BigInteger i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (i.intValue() != 100) {
            System.out.println(Thread.currentThread().getName() + ", i = " + i);
            i = i.add(BigInteger.ONE);
        }
    }
}
