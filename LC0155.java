// Runtime: 3 ms, faster than 100.00% of Java online submissions for Min Stack.
// Memory Usage: 41.4 MB, less than 10.15% of Java online submissions for Min Stack.
// Runtime: 4 ms, faster than 99.60% of Java online submissions for Min Stack.
// Memory Usage: 41.4 MB, less than 10.15% of Java online submissions for Min Stack.
// Runtime: 5 ms, faster than 68.42% of Java online submissions for Min Stack.
// Memory Usage: 41.6 MB, less than 10.15% of Java online submissions for Min Stack.
// Runtime: 4 ms, faster than 99.60% of Java online submissions for Min Stack.
// Memory Usage: 41.4 MB, less than 10.15% of Java online submissions for Min Stack.

class MinStack {
    StackNode head;
    
    /** initialize your data structure here. */
    public MinStack() {
        this.head = null;
    }
    
    public void push(int x) {
        if (this.isEmpty()) {
            this.head = new StackNode(x);
        } else {
            StackNode new_head = new StackNode(x, this.head);
            this.head = new_head;
        }
    }
    
    public void pop() {
        this.head = this.head.next;
    }
    
    public int top() {
        return this.head.val;
    }
    
    public int getMin() {
        return this.head.min;
    }
    
    private boolean isEmpty() {
        return (this.head == null);
    }
}

class StackNode {
    int val;
    int min;
    StackNode next;
    public StackNode(int val) {
        this.val = val;
        this.min = val;
        this.next = null;
    } 
    public StackNode(int val, StackNode next) {
        this.val = val;
        this.next = next;
        if (next == null) {
            this.min = val;
        } else {
            this.min = (next.min <= val) ? next.min : val;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */