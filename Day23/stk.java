package Day23;

import java.util.Stack;

public class stk {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        System.out.println(stk.empty());
        
        // Adding elements
        stk.push(1);
        stk.push(2); // addElement is not recommended, use push()
        stk.push(3);

        // Search for an element
        System.out.println(stk.search(1)); // Returns the 1-based position of 1

        // The capacity() method is not part of Stack, it's from Vector
        // so if you need to check the size, use size()
        System.out.println(stk.size());
    }
}