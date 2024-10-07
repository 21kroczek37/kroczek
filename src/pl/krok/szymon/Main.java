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

		}

		scanner.close();
	}
}
