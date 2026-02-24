import java.util.*;
public class ReversePolishNotation {
    public int elavuate(String[]tokens){
        Stack<Integer> stack = new Stack<>();

        for(String token:tokens){

            if(token.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }
            else if(token.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }
            else if(token.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            }
            else if(token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
            
        }
        return stack.pop();
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().split(" ");
        // String [] token = input.split(" ");
        ReversePolishNotation obj = new ReversePolishNotation();
        int res = obj.elavuate(input);
        System.out.print(res);


        







    }
}
