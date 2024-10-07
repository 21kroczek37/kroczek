package pl.krok.szymon;

import java.util.Scanner;

public class Main {
	private static int liczba;

	public static void main(String[] args) {
		System.out.println("Wybierz 0 albo 1:");
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			liczba = scanner.nextInt();
		} else {
			System.out.println("Nieprawid³owa wartoœæ. Proszê wprowadziæ 0 lub 1.");
			return;
		}

		switch (liczba) {
		case 0:
			System.out.println("Wybrano 0");
			break;
		case 1:
			System.out.println("Hello World");
			break;
		case 3:
			calc();
		}

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
