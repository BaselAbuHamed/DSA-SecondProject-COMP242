package com.example.project2_1202397;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(25);

        String exp = "6+6*2";

        System.out.println(stack.convert2Postfix(exp));
        System.out.println(stack.evaluatePostfix(stack.convert2Postfix(exp)));


        /*
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1. Size of stack after push operations: " +
                stack.size());
        System.out.print("2. Pop elements from stack :\n ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operations : " +
                stack.size());*/
    }
}
