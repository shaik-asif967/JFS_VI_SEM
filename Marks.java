import java.util.*;
public class Marks {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Students: ");
        
        int n = sc.nextInt();

        System.out.print("Enter the number of Subjects: ");

        int m = sc.nextInt();
        String [] names = new String[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter the name of Student"+i+": ");
            names[i] = sc.next();
        }

        int [][] marks = new int[n][m];
        int [] total = new int[n];

        for(int i = 0;i<n;i++){
            System.out.println("Enter the marks of the student"+(i+1)+": ");
            for(int j = 0;j<m;j++){
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
        }

        int topper = 0;
        int sec_tpr = -1;
        int highest_marks = total[0];

        for(int i = 1;i<n;i++){
            if(total[i]>highest_marks){
                highest_marks = total[i];
                topper = i;
            }
        }

        for(int i =0;i<n;i++){
            if(total[i]>total[topper]){
                sec_tpr = 
            }
        }

        System.out.println("Total marks of each Student: ");

        for(int i = 0;i<n;i++){
            System.out.print("Student "+(i+1)+": "+total[i]+"\n");

        }
        
        
        System.out.println("Topper is Student " + names[topper]);

    
    System.out.println("Total Highest Marks: " + highest_marks);
        
    }
}

