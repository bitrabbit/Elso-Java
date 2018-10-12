package szoft1012;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mertani_Sorozat {
	static Scanner beolvas = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			System.out.print("1) szám: ");
			int szam1 = beolvas.nextInt();
			System.out.print("2) szám: ");
			int szam2 = beolvas.nextInt();
			System.out.print("3) szám: ");
			int szam3 = beolvas.nextInt();
			System.out.print("4) szám: ");
			int szam4 = beolvas.nextInt();
			System.out.print("5) szám: ");
			int szam5 = beolvas.nextInt();
			
			double hanyados = (double) szam2 / szam1;
			
			if(szam3/szam2 == hanyados && szam4/szam3 == hanyados && szam5/szam4 == hanyados) 
			{
				System.out.println("Mértani sorozat");
			}else {
				System.out.println("Nem mértani sorozat");
			}
			
		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
		}catch (Exception e) {
			System.err.println("Hiba történt a programban!");
		}

	}

}
