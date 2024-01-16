public class GenericStack<T> {
    private Object[] stackArray;
    private int top;
    private static final int MAX_SIZE = 10;

    public GenericStack() {
        stackArray = new Object[MAX_SIZE];
        top = -1;
    }

    public void push(T element) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = element;
            System.out.println("Pushed: " + element);
        } else {
            System.out.println("Stack is full. Cannot push more elements.");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            @SuppressWarnings("unchecked")
            T element = (T) stackArray[top--];
            System.out.println("Popped: " + element);
            return element;
        } else {
            System.out.println("Stack is empty. Cannot pop elements.");
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        GenericStack<Integer> integerStack = new GenericStack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.pop();

        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(1.5);
        doubleStack.push(2.5);
        doubleStack.push(3.5);
        doubleStack.pop();
    }
}
