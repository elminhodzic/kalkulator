package kalkulatorVjezbaGit;

import java.util.Scanner;

public class KalkulatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kalkulator kalkulator = new Kalkulator();

		Scanner unos = new Scanner(System.in);

		int opcija = 1;
		double a, b;

		while (opcija != 0) {

			System.out.println(
					"Odaberite jednu opciju:\n1. Sabiranje\n2. Oduzimanje\n3. Mnozenje\n4. Djeljenje\n5. Kvadriranje\n6. Korjenovanje\n0. Izlaz ");

			opcija = unos.nextInt();

			if (opcija == 1) {

				System.out.println("Unesi dva broja koja zelite sabrati:");
				a = unos.nextDouble();
				b = unos.nextDouble();
				System.out.print("rezultat je: " + kalkulator.Sabiranje(a, b));
				System.out.println("\n");
				
			}

			if (opcija == 2) {

				System.out.println("Unesi dva broja koja zelite oduzeti: ");
				a = unos.nextDouble();
				b = unos.nextDouble();

				System.out.print("rezultat je: " + kalkulator.Oduzimanje(a, b));
				System.out.println("\n");
				
			}

			if (opcija == 3) {

				System.out.println("Unesite dva broja koja zelite pomnoziti: ");
				a = unos.nextDouble();
				b = unos.nextDouble();

				System.out.println("rezultat je: " + kalkulator.Mnozenje(a, b));
				System.out.println("\n");
				
			}

			if (opcija == 4) {

				System.out.println("Unesite dva broja koja zelite podjeliti: ");
				a = unos.nextDouble();
				b = unos.nextDouble();

				System.out.println("rezultat je: " + kalkulator.Djeljenje(a, b));
				System.out.println();
				
			}

			if (opcija == 5) {

				System.out.println("Unesite broj koji zelite kvadrirati: ");
				a = unos.nextDouble();

				System.out.println("rezultat je: " + kalkulator.Kvadriranje(a));
				System.out.println("\n");
				
			}

			if (opcija == 6) {

				System.out.println("Unesite broj koji zelite korjenovati: ");
				a = unos.nextDouble();

				System.out.println("rezultat je: " + kalkulator.Korjenovanje(a));
				System.out.println();
				
			}

		}

	}

}
