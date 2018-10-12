package szoft1012;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
	static Scanner beolvas = new Scanner(System.in);
	public static void main(String[] args) {
		int szam = 0;
		int szamlalo =0;
		
		try {
			while(szam != 11) 
			{
				System.out.println("Adj meg egy számot:");
				szam = beolvas.nextInt();
				szamlalo++;
			}
			System.out.println("A 11- es a(z) " + szamlalo + ". volt");
		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
			return;
		}catch (Exception e) {
			System.err.println("Hiba történt a programba!");
		}

	}

}
