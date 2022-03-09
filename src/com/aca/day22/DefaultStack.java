package com.aca.day22;

public class DefaultStack implements Stack {
    private final int[] nums;
    private int index;
    private static final int MAX_SIZE = 5;

    public DefaultStack() {
        this.nums = new int[MAX_SIZE];
    }
    public void printStack(){
        System.out.print("[ ");
        for (int i = 0; i <this.index ; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }

    @Override
    public int pop() {
        index--;
        if (index < 0) {
            throw new EmptyStackException("Stack is empty");
        }
        return nums[index] ;
    }

    @Override
    public void push(int val) {
        if (index == MAX_SIZE) {
            throw new StackIndexOutOfBoundsException("Out of Bound");
        }
        nums[index++] = val;
    }
}
