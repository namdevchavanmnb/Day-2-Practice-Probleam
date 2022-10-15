package Com.bridgelabz;

public class NaturalNumbe {
	public static void naturalnumber(){
		int n = 5;
		int sum = 0;

		for (int i = 1; i<= 5; i++)
			sum = sum + i;
		System.out.println (sum);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Natural Number");
		naturalnumber();
	}

}
