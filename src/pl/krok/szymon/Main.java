package pl.krok.szymon;

import java.util.Random;
import java.util.Scanner;

public class Main {
	private static int liczba;

	public static void main(String[] args) {
		System.out.println("Wybierz 0 - 2:");
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			liczba = scanner.nextInt();
		} else {
			System.out.println("Nieprawid³owa wartoœæ. Proszê wprowadziæ 0 - 2.");
			return;
		}

		switch (liczba) {
		case 0:
			System.out.println("Wybrano 0");
			break;
		case 1:
			helloWorld();
			break;
		case 2:
			zgadnijLiczbe();
			break;

		case 3:
			calc();
		}

	}

	private static void helloWorld() {
		System.out.println("hello world");
		
	}

	private static void zgadnijLiczbe() {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int liczbaDoZganiecia = random.nextInt(100) + 1;
		System.out.println("Wymyœli³em liczbê z przedzia³u 1-100. Zgadnij co to za liczba");

		int liczbaOdUzytkwonika;
		int iloscProb = 0;
		do {
			iloscProb++;
			System.out.print("Podaj liczbê: ");
			liczbaOdUzytkwonika = scanner.nextInt();

			if (liczbaOdUzytkwonika < liczbaDoZganiecia) {
				System.out.println("Poda³eœ za ma³¹ liczbê");
			} else if (liczbaOdUzytkwonika > liczbaDoZganiecia) {
				System.out.println("Poda³eœ za du¿¹ liczbê");
			} else {
				System.out.println("Gratulujê! Zgad³eœ liczbê w " + iloscProb + " próbie");
			}
		} while (liczbaDoZganiecia != liczbaOdUzytkwonika);

	}

	private static void calc() {
		int pierwszaliczba;
		int drugaliczba;
		int znak = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj pierwsz¹ liczbê:");
		pierwszaliczba = scanner.nextInt();
		System.out.println("Podaj drug¹ liczbê");
		drugaliczba = scanner.nextInt();

		System.out.println("dodawanie, wcisnij 1");
		System.out.println("odejmowanie, wcisnij 2");
		System.out.println("mno¿enie, wcisnij 3");
		System.out.println("dzielenie, wcisnij 4");
		znak = scanner.nextInt();
		switch (znak) {

		case 1: {
			System.out.println(pierwszaliczba + drugaliczba);
			break;
		}
		case 2: {
			System.out.println(pierwszaliczba - drugaliczba);
			break;
		}
		case 3: {
			System.out.println(pierwszaliczba * drugaliczba);
			break;
		}
		case 4: {
			if (drugaliczba != 0) {
				System.out.println(pierwszaliczba / drugaliczba + "  oraz reszty: " + pierwszaliczba % drugaliczba);
			} else {
				System.out.println("Nie dzielimy przez zero!!!");
			}
			break;
		}
		}
		scanner.close(); }
}
