// Runtime: 10 ms, faster than 55.49% of Java online submissions for Print in Order.
// Memory Usage: 39 MB, less than 100.00% of Java online submissions for Print in Order.
// Runtime: 9 ms, faster than 87.52% of Java online submissions for Print in Order.
// Memory Usage: 38.7 MB, less than 100.00% of Java online submissions for Print in Order.
// Runtime: 9 ms, faster than 87.52% of Java online submissions for Print in Order.
// Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Print in Order.

import java.util.concurrent.Semaphore;

class Foo {
    
    private Semaphore sm1;
    private Semaphore sm2;

    public Foo() {
        sm1 = new Semaphore(0);
        sm2 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        sm1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        sm1.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        sm2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        sm2.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}


// // Runtime: 10 ms, faster than 55.49% of Java online submissions for Print in Order.
// // Memory Usage: 39.3 MB, less than 100.00% of Java online submissions for Print in Order.
// // Runtime: 9 ms, faster than 87.52% of Java online submissions for Print in Order.
// // Memory Usage: 38.9 MB, less than 100.00% of Java online submissions for Print in Order.

// import java.util.concurrent.Phaser;

// class Foo {

//     Phaser ph1;
//     Phaser ph2;
    
//     public Foo() {
//         ph1 = new Phaser(1);
//         ph2 = new Phaser(1);
//     }

//     public void first(Runnable printFirst) throws InterruptedException {
        
//         // printFirst.run() outputs "first". Do not change or remove this line.
//         printFirst.run();
//         ph1.arrive();
//     }

//     public void second(Runnable printSecond) throws InterruptedException {
//         ph1.awaitAdvance(0);
//         // printSecond.run() outputs "second". Do not change or remove this line.
//         printSecond.run();
//         ph2.arrive();
//     }

//     public void third(Runnable printThird) throws InterruptedException {
//         ph2.awaitAdvance(0);
//         // printThird.run() outputs "third". Do not change or remove this line.
//         printThird.run();
//     }
// }