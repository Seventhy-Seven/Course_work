package com.Stack;

public class Stack_Example {
    private int maxSize;
    private long[] stackArray;
    private int topElement;

    public Stack_Example(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        topElement = -1;
    }

    public void push(long inputElement){
        stackArray[++topElement] = inputElement;
    }

    public long pop(){
        return stackArray[topElement--];
    }

    public long peek(){
        return stackArray[topElement];
    }

    public boolean isEmpty(){
        return (topElement == -1);
    }

    public boolean isFull(){
        return (topElement == maxSize-1);
    }

}
