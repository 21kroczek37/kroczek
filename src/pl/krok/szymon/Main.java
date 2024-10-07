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
			System.out.println("Nieprawid�owa warto��. Prosz� wprowadzi� 0 - 2.");
			return;
		}

		switch (liczba) {
		case 0:
			System.out.println("Wybrano 0");
			break;
		case 1:
			System.out.println("Hello World");
			break;
		case 2:
			ZgadnijLiczbe();
			break;

		}

		scanner.close();
	}

	private static void ZgadnijLiczbe() {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int liczbaDoZganiecia = random.nextInt(100) + 1;
		System.out.println("Wymy�li�em liczb� z przedzia�u 1-100. Zgadnij co to za liczba");

		int liczbaOdUzytkwonika;
		int iloscProb = 0;
		do {
			iloscProb++;
			System.out.print("Podaj liczb�: ");
			liczbaOdUzytkwonika = scanner.nextInt();

			if (liczbaOdUzytkwonika < liczbaDoZganiecia) {
				System.out.println("Poda�e� za ma�� liczb�");
			} else if (liczbaOdUzytkwonika > liczbaDoZganiecia) {
				System.out.println("Poda�e� za du�� liczb�");
			} else {
				System.out.println("Gratuluj�! Zgad�e� liczb� w " + iloscProb + " pr�bie");
			}
		} while (liczbaDoZganiecia != liczbaOdUzytkwonika);

	}
}
