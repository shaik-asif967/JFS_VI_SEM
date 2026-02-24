import java.util.Arrays;
public class Marks{
	public static void main(String args[]){
		int[][] arr = {
			{30, 50},
			{11, 21},
			{79, 19},
			{35, 65},
			{21, 4},
			{45, 55},
			{39, 40}
		};
		Arrays.sort(
				arr, (a, b) -> Integer.compare(a[0]+a[1], b[0]+b[1])
			);
		for (int[] row : arr) {
			System.out.println(row[0]+" , "+row[1]);
			//System.out.println(Arrays.toString(row));
		}
	}
}

/*
		String names[] = {"Chaithanya",
							"Kalyan",
							"Lokesh",
							"Praneeth",
							"Charan",
							"Preethi",
							"Archana"
		};
*/