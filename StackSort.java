//package com.company;
import java.util.Stack;
public class Main{
    public static void StackSort(Stack<Integer> stk){
        Stack<Integer> tempStk = new Stack<>();
        int temp;
        while (!stk.isEmpty()){
            temp = stk.pop();
            while (!tempStk.isEmpty()&&tempStk.peek()>temp) {
                stk.push(tempStk.pop());

            }

            tempStk.push(temp);
        }
        System.out.println(tempStk.toString());

    }
    public static void main(String args[]) {
        //initiating stack
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(7);
        //while input stack is not empty
        //pop from input stack, store it in a temporary
        //while temp stack is not empty and temp is less than top of temp stack
            //pop from temp stack and push in input stack
        //push temp in temp stack
        //return temp stack
        StackSort(stack);
    }
}
