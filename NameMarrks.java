import java.util.*;

public class NameMarks {
    public static void main(String args[]) {

        int[][] arr = {
            {30, 50},
            {11, 21},
            {79, 19},
            {35, 65},
            {21, 4},
            {45, 55},
            {39, 40}
        };

        String[] names = {
            "Chaithanya",
            "Kalyan",
            "Lokesh",
            "Praneeth",
            "Charan",
            "Preethi",
            "Archana"
        };

        // Name as key, marks as value
        //HashMap<String, int[]> map = new HashMap<>(); // un-ordered - not follows indexing
		LinkedHashMap<String, int[]> map = new LinkedHashMap<>(); // ordered - it follows indexing
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], arr[i]);
        }

        // Print data
        for (String name : map.keySet()) {
            int[] marks = map.get(name);
            System.out.println(name + " -> " 
                + marks[0] + " , " + marks[1]);
        }
    }
}