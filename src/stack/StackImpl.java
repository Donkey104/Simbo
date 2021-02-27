package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Implement stack with ArrayList
 *
 * push(int x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMax() -- Retrieve the maximum element in the stack
 *
 */
public class StackImpl {

    private List<Integer> stack;

    public StackImpl() {
        this.stack = new ArrayList<>();
    }

    /**
     * Push element x onto stack
     *
     * @param x input number
     */
    public void push(int x) {
        stack.add(x);
    }

    /**
     * Removes the element on top of the stack
     */
    public void pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.get(stack.size() - 1));
        }
    }

    /**
     * Get the top element
     *
     * @return Optional, top element
     */
    public Optional<Integer> top() {
        if (!stack.isEmpty()) {
            return Optional.of(stack.get(stack.size() - 1));
        }
        return Optional.empty();
    }

    /**
     * Retrieve the maximum element in the stack
     *
     * @return Optional, get max element
     */
    public Optional<Integer> getMax() {
        if (!stack.isEmpty()) {
            return Optional.of(Collections.max(stack));
        }
        return Optional.empty();
    }

    public List<Integer> getStack() {
        return stack;
    }

    public void setStack(List<Integer> stack) {
        this.stack = stack;
    }
}
