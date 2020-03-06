// Runtime: 6 ms, faster than 80.21% of Java online submissions for Print Zero Even Odd.
// Memory Usage: 38.8 MB, less than 100.00% of Java online submissions for Print Zero Even Odd.
// Runtime: 6 ms, faster than 80.21% of Java online submissions for Print Zero Even Odd.
// Memory Usage: 39 MB, less than 100.00% of Java online submissions for Print Zero Even Odd.

import java.util.concurrent.Semaphore;

class ZeroEvenOdd {
    
    private Semaphore smz;
    private Semaphore smo;
    private Semaphore sme;
    private int n;
    
    public ZeroEvenOdd(int n) {
        this.n = n;
        this.smz = new Semaphore(0);
        this.smo = new Semaphore(0);
        this.sme = new Semaphore(0);
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            printNumber.accept(0);
            if (i % 2 == 1) smo.release();
            else sme.release();
            smz.acquire();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            sme.acquire();
            printNumber.accept(i);
            smz.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            smo.acquire();
            printNumber.accept(i);
            smz.release();
        }
    }
}