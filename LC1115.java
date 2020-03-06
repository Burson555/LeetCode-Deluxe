// Runtime: 16 ms, faster than 96.39% of Java online submissions for Print FooBar Alternately.
// Memory Usage: 39.9 MB, less than 100.00% of Java online submissions for Print FooBar Alternately.
// Runtime: 17 ms, faster than 44.84% of Java online submissions for Print FooBar Alternately.
// Memory Usage: 40.7 MB, less than 100.00% of Java online submissions for Print FooBar Alternately.

import java.util.concurrent.Semaphore;

class FooBar {
    
    private Semaphore smf;
    private Semaphore smb;
    private int n;

    public FooBar(int n) {
        this.n = n;
        this.smf = new Semaphore(0);
        this.smb = new Semaphore(1);
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            smb.acquire();
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            smf.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            smf.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            smb.release();
        }
    }
}