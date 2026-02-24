// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

import java.util.*;
public class Two_Sum{
    public static int []twosum(int[]arr,int target){
    HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            map.put(arr[i],i);

        }
        return new int[]{};
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the size of the array: ");
        
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.print("Enter the array Elements: ");

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");

        int target = sc.nextInt();

        int[] result = twosum(arr,target);

        System.out.print("[ ");

        for(int res:result){
            
            System.out.print(res+" ");
        }
        System.out.print("]");



    }
}