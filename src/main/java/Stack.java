import java.util.ArrayDeque;
import java.util.Deque;


//push() → add to top
//pop() → remove from top
//peek() → view top
//isEmpty() → check if stack is empty
//size() → current stack size
//Generic (<T>) to allow any type
//implement a stack using an ArrayDeque
// internally (preferred over Stack) or an array/list.
// Here’s a simple example using ArrayDeque:

public class Stack<T> {
    private Deque<T> stack;

    public Stack() {
        stack = new ArrayDeque<>();
    }

    // Push an element onto the stack
    public void push(T value) {
        stack.push(value);
    }

    // Pop an element from the stack
    public T pop() {
        return stack.pollFirst(); // returns null if empty
    }

    // Peek at the top element without removing it
    public T peek() {
        return stack.peekFirst(); // returns null if empty
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return stack.size();
    }

    // For debugging: print stack elements
    @Override
    public String toString() {
        return stack.toString();
    }

    // Demo
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);     // [30, 20, 10]
        System.out.println("Peek: " + s.peek()); // 30
        System.out.println("Pop: " + s.pop());   // 30
        System.out.println("Stack after pop: " + s); // [20, 10]
    }
}