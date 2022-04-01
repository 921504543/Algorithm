package UMLsession;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Scanner reader =new Scanner(System.in);
            int num1=reader.nextInt();
            char operator =reader.next().charAt(0);
            int num2=reader.nextInt();
            double result=0;
            switch (operator){
                case '+' :
                    Add add=new Add();
                    result=add.reckon(num1,num2);
                    break;
                case '-':
                    Subtract subtract=new Subtract();
                    result=subtract.reckon(num1,num2);
                    break;
                case '*':
                    Multiply multiply=new Multiply();
                    result=multiply.reckon(num1,num2);
                    break;
                case '/':
                    Divide divide=new Divide();
                    result=divide.reckon(num1,num2);
                    break;
                case '%':
                    Remainder remainder=new Remainder();
                    result=remainder.reckon(num1,num2);
                    break;
            }
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Something is error");
            e.printStackTrace();
        }
        }
}
class Add{
    double reckon(int a,int b){
        return a+b;
    }
}
class Subtract{
    double reckon(int a,int b){
        return a-b;
    }
}
class Multiply{
    double reckon(int a,int b){
        return a*b;
    }
}
class Divide{
    double reckon(int a,int b){
        return a/b;
    }
}
class Remainder{
    double reckon(int a,int b){
        return a%b;
    }
}