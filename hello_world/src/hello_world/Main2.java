package hello_world;

public class Main2 {

	public static void main(String[] args) {

		int szam1 = Integer.parseInt(args[0]);
		int szam2 = Integer.parseInt(args[1]);
		int szam3 = Integer.parseInt(args[2]);
		int szam4 = Integer.parseInt(args[3]);
		int szam5 = Integer.parseInt(args[4]);

		double atlag = (double) (szam1 + szam2 + szam3 + szam4 + szam5) / 5;
		System.out.println("Átlag: " + atlag);

	}

}
