import java.util.Random;
import java.util.Scanner;

public class С {

	public static void main(String[] args) {

		// Scanner read = new Scanner(System.in);
		boolean isEmpty = true;
		Random r = new Random();
		int n = r.nextInt(8) + 1;
		String[] input = new String[n];
		System.out.println("Generated " + n + " groups");
		int[] cabStatus = new int[7];
		for (int i = 0; i < n; i++) {
			input[i] = "";
			for (int j = 0; j < 7; j++) { // ген расписания групп
				int newInt = 1 - r.nextInt(2);
				input[i] += newInt;
				cabStatus[j] += Integer.parseInt(input[i].charAt(j) + "");
			}
			System.out.println(input[i]);
		}
		int min = 0;
		
		for (int i = 0; i < cabStatus.length; i++) {
			if (cabStatus[i] >= min)
				min = cabStatus[i];
			if ((isEmpty) && (cabStatus[i] != 0))
				isEmpty = false;
		}
		if (isEmpty)

			System.out.println("Today is weekend");
		else
			System.out.println("Need " + min + " cabs.");
	}

}
