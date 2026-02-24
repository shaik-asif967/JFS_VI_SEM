import java.util.*;

public class NameTotalMarks {
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

        LinkedHashMap<String, int[]> map = new LinkedHashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(names[i], arr[i]);
        }

        // Step 1: Convert Data to List
        List<Map.Entry<String, int[]>> list = new ArrayList<>(map.entrySet());
		
		System.out.println("\n Before sorting ");
		for (Map.Entry<String, int[]> r : map.entrySet()){
			System.out.println(r.getKey() + " -> " 
            + r.getValue()[0] + " , " 
            + r.getValue()[1]);
		}
		
        // Step 2: Sort by total marks
		System.out.println("\n after sorting ");
        list.sort((a, b) -> {
            int totalA = a.getValue()[0] + a.getValue()[1];
            int totalB = b.getValue()[0] + b.getValue()[1];
            return Integer.compare(totalA, totalB); // Ascending
        });

        // Step 3: Store in new LinkedHashMap
        LinkedHashMap<String, int[]> sortedMap =
                new LinkedHashMap<>();

        for (Map.Entry<String, int[]> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print sorted map
        for (Map.Entry<String, int[]> entry : sortedMap.entrySet()) {
            int[] marks = entry.getValue();
            int total = marks[0] + marks[1];
            System.out.println(entry.getKey() + " -> "
                    + marks[0] + " , "
                    + marks[1] + " | Total: " + total);
        }
    }
}