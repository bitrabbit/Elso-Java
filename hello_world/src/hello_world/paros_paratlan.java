package hello_world;

public class paros_paratlan {

	public static void main(String[] args) {

		// páros páratlan
		/*
		 * int i = 10;
		 * 
		 * if (i % 2 == 0) { System.out.println("A megadott szám páros"); } else {
		 * System.out.println("A megadott szám páratlan"); }
		 */

		// 2. feladat
		/*
		 * int szam = 50;
		 * 
		 * if (szam % 2 == 0) { System.out.println("Osztható 2 el"); } else {
		 * System.err.println("Nem osztható 2 vel"); }
		 * 
		 * if (szam % 3 == 0) { System.out.println("Osztható 3 al"); } else {
		 * System.err.println("Nem osztható 3 al"); }
		 * 
		 * if (szam % 5 == 0) { System.out.println("Osztható 5 el"); } else {
		 * System.err.println("Nem oszthaó 5 el"); }
		 */
		// 3. feladat
		/*
		 * int a = Integer.parseInt(args[0]); int b = Integer.parseInt(args[1]); int c =
		 * Integer.parseInt(args[2]);
		 * 
		 * if (a + b > c && b + c > a && a + c > b) {
		 * System.out.println("A háromszög megszerkeszthető"); } else {
		 * System.out.println("A száromszög nem szerkeszthető meg"); }
		 */

		// 4. feladat
		/*
		 * int number = Integer.parseInt(args[0]);
		 * 
		 * if(0 < number && number <= 1000000) { if(number > 99999) {
		 * System.out.println("6 jegyű"); }else if(number > 9999){
		 * System.out.println("5 jegyű"); }else if(number > 999) {
		 * System.out.println("4 jegyű"); }else if(number > 99) {
		 * System.out.println("3 jegyű"); }else if(number > 9) {
		 * System.out.println("2 jegyű"); }else if(number < 9) {
		 * System.out.println("1 jegyű"); } }else {
		 * System.out.println("Rossz számot adtál meg"); }
		 */
/*		
		int szam1 = 5;
		int szam2 = 16;

		if (szam1 > szam2) {
			System.out.println("Az első szám nagyobb");
		} else if (szam1 < szam2) {
			System.out.println("A második szám nagyobb");
		} else {
			System.out.println("Rossz paraméter");
		}
*/
		
		//6.feladat
		
		int szam=20;
	
		
		switch (szam) {
		case 10:
			System.out.println("10");

		case 9:
			System.out.println("9");

		case 8:
			System.out.println("8");

		case 7:
			System.out.println("7");

		case 6:
			System.out.println("6");

		case 5:
			System.out.println("5");

		case 4:
			System.out.println("4");

		case 3:
			System.out.println("3");

		case 2:
			System.out.println("2");

		case 1:
			System.out.println("1");

		case 0:
			System.out.println("0");
			break;

		default:
			if(szam>10) {
			System.out.println("A szám nagyobb mint 10");
			}
			break;
		}
	}

}
