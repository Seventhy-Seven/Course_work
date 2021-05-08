package com.Stack;

public class Reverse_Letters {
    private String input;
    private String output;

    public Reverse_Letters(String in){
        this.input = in;
    }

    public String doRevers(){
        int stackSize = input.length();
        Stack_Example ThreeStack = new Stack_Example(stackSize);

        for (int i = 0; i<input.length(); i++){
            char ch = input.charAt(i);
            ThreeStack.push(ch);
        }
        output = " ";
        while (!ThreeStack.isEmpty()){
            char ch = (char) ThreeStack.pop();
            output = output+ ch;
        }
        return output;
    }

}


