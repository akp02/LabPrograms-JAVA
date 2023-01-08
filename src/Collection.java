abstract class Collection {
    // An abstract method to add an element to the collection
    public abstract void add(int element);
  
    // An abstract method to remove an element from the collection
    public abstract int remove();
  
    // A method to check if the collection is empty
    public boolean isEmpty() {
      return size() == 0;
    }
  
    // An abstract method to return the number of elements in the collection
    public abstract int size();
  }
  
  class Stack extends Collection {
    // A stack is implemented using an array
    private int[] stack;
    private int top;
  
    public Stack(int capacity) {
      stack = new int[capacity];
      top = -1;
    }
  
    // Add an element to the stack
    public void add(int element) {
      stack[++top] = element;
    }
  
    // Remove the top element from the stack
    public int remove() {
      return stack[top--];
    }
  
    // Return the number of elements in the stack
    public int size() {
      return top + 1;
    }
  }
  
  class Queue extends Collection {
    // A queue is implemented using an array
    private int[] queue;
    private int front;
    private int rear;
  
    public Queue(int capacity) {
      queue = new int[capacity];
      front = 0;
      rear = -1;
    }
  
    // Add an element to the queue
    public void add(int element) {
      queue[++rear] = element;
    }
  
    // Remove the front element from the queue
    public int remove() {
      return queue[front++];
    }
  
    // Return the number of elements in the queue
    public int size() {
      return rear - front + 1;
    }
  }

class test{
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.add(1);
        stack.add(2);
        stack.add(3);

        while (!stack.isEmpty()) {
        System.out.println(stack.remove());
        }

        Queue queue = new Queue(3);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
        System.out.println(queue.remove());
        }
    }

}