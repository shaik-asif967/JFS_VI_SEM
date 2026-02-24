/*
Write a program to read a number and check given number is Prime or Not?

Input: number (ex. 7)
Output: True (Prime) or False (Not)
*/
import java.util.Arrays;
public class SeiveOfEratosthenes {
	public static void main(String args[]){
		int start = 10, end = 50;
		boolean status[] = new boolean[end+1];
		//Initially, declaring all numbers as prime
		/*for(int i=0; i<=end; i++){
			status[i] = true;
		}*/
		Arrays.fill(status, true);
		for(int i=2; i<=Math.sqrt(end);i++){
			if(status[i] == true){
				for(int j=i*i; j<status.length; j=j+i){
					status[j] = false;
				}
			}
		}
		int counter = 0;
		for(int i=start; i<= end; i++){
			if(status[i] == true){
				System.out.println(i);
				counter++;
			}
		}
		System.out.println("Total Prime Numbers: "+counter);
	}
}