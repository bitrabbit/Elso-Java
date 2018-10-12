package szoft1012;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
	static Scanner beolvas = new Scanner(System.in);
	public static void main(String[] args) {
		
		int szam = 0;
		
		try {
			System.out.println("Adj meg egy számot: ");
			szam = beolvas.nextInt();
			boolean paros = (szam%2 ==0);
			
			if(szam%3==0) {
				if(paros)
				{
					System.out.println("A szám osztható 2-vel és 3-mal");
				}else
				{
				System.out.println("A szám osztható 3 al de 2 vel nem");
				}
			}else
				{
					if(paros) 
					{
						System.out.println("A szám osztahtó 2 vel de 3 mal nem");
					}else
					{
						System.out.println("A szám nem osztható 2 vel és 3 al sem!");
					}
				}
		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
		}catch (Exception e) {
			System.err.println("Hiba történt a programba!");
		}

	}

}
