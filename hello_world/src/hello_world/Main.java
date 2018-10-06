
package hello_world;

public class Main {

	public static void main(String[] args) {
		
		/*int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int terfogat = a * b * c;
		int felszin = 2 * (a * b + a * c + c * b);

		System.out.println("Térfogat: " + terfogat);
		System.out.println("Felszín: " + felszin);*/
		
		//------------------------------------------
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int osszeg = a+b;
		int szorzat = a*b;
		double hanyados = a/b;
		int kulonbseg = a-b;
		
		
		System.out.println("Összeg: " + osszeg);
		System.out.println("Szorzat: " + szorzat);
		System.out.println("Hányados: " + hanyados);
		System.out.println("Különbség: " + kulonbseg);

		//commit
	}
}