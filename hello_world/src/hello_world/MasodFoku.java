package hello_world;

public class MasodFoku {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		double diszkriminans = Math.sqrt(b * b - 4 * a * c);
		double x1 = (-b + diszkriminans) / 2 * a;
		double x2 = (-b - diszkriminans) / 2 * a;

		System.out.println("x1= " + x1);
		System.out.println("x2= " + x2);
	}

}
