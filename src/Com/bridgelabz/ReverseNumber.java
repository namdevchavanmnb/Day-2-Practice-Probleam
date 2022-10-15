package Com.bridgelabz;

public class ReverseNumber {
	public static void reversenumber()
	{
		int num = 231, reverse = 0, rem;
		while (num != 0) {
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num =num/ 10;

		}
		System.out.println ("Reversed Number: " + reverse);

	}
	public static void main(String[] args) {
		reversenumber();
	}
}
