import java.util.*;
class ValidParanthesis{
    public boolean isvalid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='('||ch == '['||ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;

            
            char top = stack.pop();

            if(ch == ')' && top != '('||
            ch == ']' && top != '['||
            ch == '}' && top != '{'){
                return false;
            }
        }
        }
        return stack.isEmpty();



    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ValidParanthesis obj = new ValidParanthesis();
        boolean res = obj.isvalid(s);
        System.out.print(res);
    }
}