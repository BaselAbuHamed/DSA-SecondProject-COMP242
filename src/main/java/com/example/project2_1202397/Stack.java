package com.example.project2_1202397;

import javafx.scene.control.Alert;

//LIFO: last in first out
public class Stack<T extends Comparable<T>> implements CursorInterface<T> {

    //create object from cursor
    private final Cursor<T> cStack = new Cursor<>(20);
    private final int l = cStack.createList();


    private static final String operators = "%-+/*^!#$&L√Neπ";
    private static final String operands = "0123456789";

    //constructor stack
    public Stack(int length) {
    }

    //empty constructor
    public Stack() {

    }

    @Override
    public void push(T data) {
        if (!cStack.insertAtHead(data, l))
            System.out.println("Stack Over Flow");
    }

    @Override
    public Comparable<T> pop() {
        return cStack.deleteFirst(l);

    }

    @Override
    public Comparable<T> peek() {
        return cStack.getFirst(l);
    }

    @Override
    public boolean isEmpty() {
        return cStack.isEmpty(l);
    }

    @Override
    public void clear() {
        cStack.clear(l);
    }

    public int prec(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    //Returns a numeric value in which the arithmetic sequence and priority are arranged
    private double getPrecedence(char operator) {
        double ret = 0;
        if (operator == '-' || operator == '+')
            ret = 1;
        else if (operator == '*' || operator == '/'|| operator == '%')
            ret = 2;
        else if (operator=='^'||operator=='!'||operator=='#'||operator=='$'||operator=='&'
                ||operator=='L'||operator=='√'||operator=='N'||operator=='e'||operator=='π')
            ret = 3;

        return ret;
    }

    private boolean operatorGreaterOrEqual(char op1, char op2) {
        return getPrecedence(op1) >= getPrecedence(op2);
    }

    //method for convert infix expression to postfix expression
    public String convert2Postfix(String infixExpr) {

        infixExpr=infixExpr.replace("cos","#");
        infixExpr=infixExpr.replace("sin","$");
        infixExpr=infixExpr.replace("tan","&");
        infixExpr=infixExpr.replace("LOG","L");
        infixExpr=infixExpr.replace("LN","N");

        char[] chars = infixExpr.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder out = new StringBuilder(infixExpr.length());

        for (char c : chars)
        {
            if (isOperator(c)) {
                while (!stack.isEmpty() && !stack.peek().equals('(') )
                    if (operatorGreaterOrEqual((Character) stack.peek(), c))
                        out.append(stack.pop());
                    else
                        break;
                stack.push(c);
            }

            else if (c == '(')
                stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty() && !stack.peek().equals('('))
                    out.append(stack.pop());
                if (!stack.isEmpty())
                    stack.pop();
            }

            else if (isOperand(c))
                out.append(c);
        }

        while (!stack.isEmpty())
            out.append(stack.pop());

        String result=out.toString();
        result=result.replace("#","cos");
        result=result.replace("$","sin");
        result=result.replace("&","tan");
        result=result.replace("L","LOG");
        result=result.replace("N","LN");

        return result;
    }

    //check if the bracts closed or not and if return false
    public boolean balancedParentheses (String exp){

        Stack stack = new Stack<>(exp.length());

        for (int i = 0 ; i < exp.length();i++){
            if (exp.charAt(i) == '(' || exp.charAt(i) == '{'|| exp.charAt(i) == '['){
                char c = exp.charAt(i);
                stack.push(c);
            }
            else {
                if (exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']'){
                    char ch = (char) stack.pop();
                    if(ch != '('){
                        System.out.println("Error");
                        break;
                    }
                }
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }

    //check if character operator or not
    private boolean isOperator(char val) {
        return operators.indexOf(val) >= 0;
    }

    //check if character operand or not
    private boolean isOperand(char val){
        return operands.indexOf(val) >= 0;
    }

    //find value for equation from postfix expression
    public double evaluatePostfix(String postfixExpr) {

        boolean v =balancedParentheses(postfixExpr);
        if(v==true){
            postfixExpr=postfixExpr.replace("cos","#");
            postfixExpr=postfixExpr.replace("sin","$");
            postfixExpr=postfixExpr.replace("tan","&");
            postfixExpr=postfixExpr.replace("LOG","L");
            postfixExpr=postfixExpr.replace("LN","N");

            char[] chars = postfixExpr.toCharArray();
            Stack<Double> stack = new Stack<>();

            for (char c : chars) {
                if (isOperand(c))
                    stack.push((double) (c - '0')); // convert char to int val

                else if (c=='*' ||c=='/'||c=='+'||c=='^'||c=='-'||c=='%') {
                    double op1 = (double) stack.pop();
                    double op2 = (double) stack.pop();
                    double result;
                    switch (c) {
                        case '*' -> {
                            result = op1 * op2;
                            stack.push(result);
                        }
                        case '/' -> {
                            if(op1==0){
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setContentText("Error: It cannot be divided by zero");
                                alert.show();
                                return 0;
                            }else
                            {
                                result = op2 / op1;
                                stack.push(result);
                            }
                        }
                        case '+' -> {
                            result = op1 + op2;
                            stack.push(result);
                        }
                        case '-' -> {
                            result = op2 - op1;
                            stack.push(result);
                        }
                        case '^' -> {
                            result = Math.pow(op2, op1);
                            stack.push(result);
                        }
                        case '%' -> {
                            result = op2 % op1;
                            stack.push(result);
                        }
                    }
                }

                else{
                    double op1 = (double) stack.pop();
                    double result;
                    switch (c) {
                        case '!' -> {
                            int i, fact = 1;
                            for (i = 1; i <= op1; i++) {
                                fact = fact * i;
                            }
                            stack.push((double) fact);
                        }
                        case '#' -> {
                            result=Math.cos(op1);
                            stack.push(result);
                        }
                        case '$' -> {
                            result=Math.sin(op1);
                            stack.push(result);
                        }
                        case '&' -> {
                            result=Math.tan(op1);
                            stack.push(result);
                        }
                        case 'L' -> {
                            result=Math.log10(op1);
                            stack.push(result);
                        }
                        case '√' -> {
                            result=Math.sqrt(op1);
                            stack.push(result);
                        }
                        case 'N' -> {
                            result=Math.log(op1);
                            stack.push(result);
                        }

                        case 'e' -> {
                            result=Math.exp(op1);
                            stack.push(result);
                        }
                        case 'π' -> {
                            result=op1*3.14;
                            stack.push(result);
                        }
                    }
                }
            }
            return (double) stack.pop();
        }
    else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error: Missing parentheses");
            alert.show();
        return 0;}
    }

    public int size() {
        return l + 1; // returns number of elements inside stack
    }

}
