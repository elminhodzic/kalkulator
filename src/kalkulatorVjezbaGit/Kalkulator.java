package kalkulatorVjezbaGit;

public class Kalkulator {

	double a, b;

	Kalkulator() {

	}

	public double Sabiranje(double a, double b) {

		return a + b;

	}

	public double Oduzimanje(double a, double b) {

		return a - b;

	}

	public double Mnozenje(double a, double b) {

		return a * b;

	}

	public double Djeljenje(double a, double b) {

		if (b == 0) {

			System.out.println("Sa 0 nije moguce djeliti: ");
			return 0;

		} else {

			return a / b;

		}
	}

	public double Kvadriranje(double a) {

		return a * a;

	}

	public double Korjenovanje(double a) {

		return Math.sqrt(a);
	}

}
