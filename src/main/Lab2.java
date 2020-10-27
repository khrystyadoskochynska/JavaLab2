package main;

import java.util.Scanner;

import phone.Phone;
// import phone.*;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Employee[] obj = new Employee[2] ;

		Phone[] customers = new Phone[10];
		customers[0] = new Phone();
		customers[0].setId(3);
		customers[0].setSurname("Doskochynska");
		customers[0].setAccountNumber(123);
		customers[0].setWithinCityTime(65);
		// customers[0].setOutCityTime(21);

		customers[1] = new Phone();
		customers[1].setId(7);
		customers[1].setSurname("Kovaliv");
		customers[1].setAccountNumber(124);
		customers[1].setWithinCityTime(987);
		customers[1].setOutCityTime(3);

		customers[2] = new Phone();
		customers[2].setId(7);
		customers[2].setSurname("Koval");
		customers[2].setAccountNumber(121);
		customers[2].setWithinCityTime(4);
		customers[2].setOutCityTime(750);

		Scanner in = new Scanner(System.in);
		System.out.println("Overlimited time of within city calls");
		int LimitCityTime = in.nextInt();

		System.out.println();
		System.out.println("Person's surname who overlimited time of within city calls: ");

		for (int i = 0; i < 3; i++) {

			if (LimitCityTime < customers[i].getWithinCityTime()) {

				System.out.println(customers[i].getSurname());
			}
		}

		System.out.println();
		System.out.println("Person's surname who used outcity calls: ");

		for (int i = 0; i < 3; i++) {

			if (0 < customers[i].getOutCityTime()) {

				System.out.println(customers[i].getSurname());
			}
		}

		System.out.println();
		System.out.println("AccountNumber is in such diapason ");
		System.out.println("Input bottom value of diapason: ");
		int a = in.nextInt();
		System.out.println();
		System.out.println("Input top value of diapason: ");
		int b = in.nextInt();
		
		if (a > b) {

			int c = 0;
			c = a;
			a = b;
			b = c;

			System.out.println("Elements have been changed succsessfuly");
		}

		System.out.println();
		System.out.println("Person's surname whos AccountNumber is in such diapason: ");

		for (int i = 0; i < 3; i++) {

			if (a <= customers[i].getAccountNumber() && b >= customers[i].getAccountNumber()) {

				System.out.println(customers[i].getSurname());
			}
		}

	}

}
