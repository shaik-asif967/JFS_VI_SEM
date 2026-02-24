import java.util.*;
public class FizzBuzz {
    public List<String> fizzbuzz(int n){
        List<String> answer = new ArrayList<>();

        for(int i = 1;i<=n;i++){

            if(i %3 == 0 && i%5 == 0){
                answer.add("FizzBuzz");
            }
            else if(i%3 == 0){
                answer.add("Fizz");

            }
            else if(i%5 == 0){
                answer.add("Buzz");
            }
            else{
                answer.add(Integer.toString(i));
            }


        }
        return answer;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FizzBuzz obj = new FizzBuzz();
        List<String> res = obj.fizzbuzz(n);
        System.out.print(res);

    }
}
