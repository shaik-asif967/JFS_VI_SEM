import java.util.*;
public class Employee_salary{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> salaries = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            System.out.println("Enter the salary of employee "+(i+1)+": ");
            int salary = sc.nextInt();
            salaries.add(salary);

        }
        double sum = 0;
        for(int sal:salaries){
            sum += sal;
        }

        double average = sum/n;
        System.out.print("Average Salary is: "+average);



    }
}
