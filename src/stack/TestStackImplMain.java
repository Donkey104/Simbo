package stack;

import java.util.Optional;

public class TestStackImplMain {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(20);
        stack.push(-100);
        stack.push(90);

        System.out.println("==== push =====");
        System.out.println("stack size : " + stack.getStack().size());
        System.out.println("stack : " + stack.getStack());

        System.out.println("==== pop =====");
        stack.pop();
        System.out.println("stack size : " + stack.getStack().size());
        System.out.println("stack : " + stack.getStack());

        System.out.println("==== get top =====");
        Optional<Integer> top = stack.top();
        System.out.println("top element : " + (top.isPresent() ? (int)top.get() : -1));

        System.out.println("==== get max =====");
        Optional<Integer> max = stack.getMax();
        System.out.println("max element : " + (max.isPresent() ? (int)max.get() : -1));
    }
}
