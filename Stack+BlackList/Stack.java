package com.company;

import java.util.Arrays;

public class Stack {

    private Object[] stack;
    private BlackList blackList;

    public Stack(BlackList blackList) {
        super();
        this.stack = new Object[0];
        this.blackList = blackList;
    }

    public Stack() {
        super();
        this.stack = new Object[0];
    }

    public Object[] getStack() {
        return stack;
    }

    public void setStack(Object[] stack) {
        this.stack = stack;
    }

    public BlackList getBlackList() {
        return blackList;
    }

    public void setBlackList(BlackList blackList) {
        this.blackList = blackList;
    }

    public void addObject(Object obj) {
        if (blackList.classInBlackList(obj)) {
            System.out.println("Not added.");
            return;
        }
        Object[] tmpStack = new Stack[stack.length + 1];
        System.arraycopy(stack, 0, tmpStack, 0, stack.length);
        tmpStack[tmpStack.length - 1] = obj;
        stack = tmpStack;
        System.out.println(obj + " was added in the stack");
    }

    public Object getFromStack() {
        Object obj = null;
        if (stack.length == 0) {
            System.out.println("Stack is empty.");
        } else
            obj = stack[stack.length - 1];

        return obj;
    }

    public Object getFromStackAndDelete() {
        Object obj = null;
        if (stack.length == 0) {
            System.out.println("Stack is empty.");
        } else {
            obj = stack[stack.length - 1];

            Object[] tmpStack = new Stack[stack.length - 1];
            System.arraycopy(stack, 0, tmpStack, 0, stack.length - 1);
            stack = tmpStack;
            System.out.println(obj + " was deleted from the stack");
        }
        return obj;
    }

    @Override
    public String toString() {
        return "Stack = " + Arrays.toString(stack);
    }
}