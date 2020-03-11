// Runtime: 6 ms, faster than 90.15% of Java online submissions for Fizz Buzz Multithreaded.
// Memory Usage: 39.4 MB, less than 100.00% of Java online submissions for Fizz Buzz Multithreaded.

class FizzBuzz {
    
    private int n;
    private Semaphore fizz;
    private Semaphore buzz;
    private Semaphore both;
    private Semaphore numb;

    public FizzBuzz(int n) {
        this.n = n;
        this.fizz = new Semaphore(0);
        this.buzz = new Semaphore(0);
        this.both = new Semaphore(0);
        this.numb = new Semaphore(1);
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 || i % 5 == 0) {
                continue;
            } else {
                fizz.acquire();
                printFizz.run();
                // the next cannot be "fizzbuzz"
                if ((i+1) % 5 == 0) buzz.release(); // next is "fizz"
                else numb.release(); // next is number
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 5 != 0 || i % 3 == 0) {
                continue;
            } else {
                buzz.acquire();
                printBuzz.run();
                // the next cannot be "fizzbuzz"
                if ((i+1) % 3 == 0) fizz.release(); // next is "buzz"
                else numb.release(); // next is number
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 5 != 0 || i % 3 != 0) {
                continue;
            } else {
                both.acquire();
                printFizzBuzz.run();
                // the next cannot be "fizz" or "buzz"
                numb.release(); // next is number for sure
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                continue;
            } else {
                numb.acquire();
                printNumber.accept(i);
                // the next cannot be "fizzbuzz"
                if ((i+1) % 3 == 0 && (i+1) % 5 == 0) both.release();
                else if ((i+1) % 3 == 0) fizz.release();
                else if ((i+1) % 5 == 0) buzz.release();
                else numb.release();
            }
        }
    }
}