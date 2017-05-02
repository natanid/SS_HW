import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input real number array: ");

		String str = null;
		if (sc.hasNextLine()) {
			str = sc.nextLine();
		}

		String[] arrStr = str.split(" ");

		float[] arrFloat = new float[arrStr.length];

		for (int i = 0; i < arrStr.length; i++) {
			arrFloat[i] = new Float(arrStr[i]);
		}

		int indexOfMax = 0;
		float max = 0;
		for (int i = 0; i < arrFloat.length; i++) {
			if (arrFloat[i] > max) {
				max = arrFloat[i];
				indexOfMax = i;
			}
		}

		int indexOfMin = 0;
		float min = max;
		for (int i = 0; i < arrFloat.length; i++) {
			if (arrFloat[i] < min) {
				min = arrFloat[i];
				indexOfMin = i;
			}
		}

		arrFloat[indexOfMax] = min;
		arrFloat[indexOfMin] = max;
	}
}
