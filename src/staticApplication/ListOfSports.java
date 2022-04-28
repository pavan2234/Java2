package staticApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListOfSports {
	Map<Integer, String> bd = new HashMap<Integer, String>();
	Map<Integer, String> ft = new HashMap<Integer, String>();
	Map<Integer, String> ck = new HashMap<Integer, String>();

	public void sports() {
		System.out.println("Enter to the Sports Complex");
		System.out.println("Here is the list of sports");
		System.out.println("1.Badminton Court");
		System.out.println("2.FootBall");
		System.out.println("3.Cricket");
		System.out.println("Please select the sport with a number of your choice");
		Scanner sc = new Scanner(System.in);
		try {
			int option = sc.nextInt();
			if (option >= 0 && option <= 3) {
				switch (option) {
				case 1:
					badminton();
					break;
				case 2:
					football();
					break;
				case 3:
					cricket();
					break;
				}
			} else {
				System.out.println("Enter correct input");
				sports();
			}
		} catch (Exception e) {
			System.out.println("Enter the apropriate value");
			sports();
		}
	}

	public void badminton() {
		System.out.println("Solts available in this sport");
		for (Map.Entry m : bd.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Enter the desired slot number");
		try {
			Scanner sc = new Scanner(System.in);
			int bdinput = sc.nextInt();

			/*
			 * if(bdinput>0&&bdinput<=10) { System.out.println("Slot booked successfully");
			 * System.out.println("The booking details are----"+bd.get(bdinput));
			 * bd.remove(bdinput); System.out.println(); }
			 */
			if (bd.get(bdinput).equals(null)) {
				System.err.println("wrong entry please Enter the existing number in the list of slots");
				// badminton();
			}

			else {
				System.out.println("Slot booked successfully");
				System.out.println("The booking details are----" + bd.get(bdinput));
				bd.remove(bdinput);

			}
		} catch (Exception e) {
			System.err.println("selected slot is already booked choose the right slot");
			badminton();
		}
		System.out.println("Press 1 to continue,Press 2 to main page,Press any key to exit");
		Scanner sc = new Scanner(System.in);
		try {
			int i = sc.nextInt();
			if (i == 1) {
				badminton();
			} else if (i == 2) {
				sports();
			} else {
				System.out.println("Thank you for visiting sports complex ");
			}
		} catch (Exception e) {
			System.out.println("An error occurred,try again");
		}
	}

	public void football() {
		System.out.println("Available slots in the football sport");
		for (Map.Entry m : ft.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Enter the desired slot number for booking");
		try {
			Scanner sc = new Scanner(System.in);
			int ftinput = sc.nextInt();
			if (ftinput > 0 && ftinput <= 20) {
				System.out.println("Slot booked successfully");
				System.out.println("Thank you for booking slot---" + ft.get(ftinput));
				ft.remove(ftinput);
			} else {
				System.out.println("Enter the valid input");
				football();
			}
		} catch (Exception e) {
			System.out.println("Enter the number in the list of slots");
			football();
		}
		System.out.println("Press 1 to continue,Press 2 to main page,enter any key to exit");
		try {
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			if (i == 1) {
				football();
			} else if (i == 2) {
				sports();
			} else {
				System.out.println("Thank you for visiting the sports complex");
			}
		} catch (Exception e) {
			System.out.println("An eroor occurred try again");
		}
	}

	public void cricket() {
		System.out.println("Available slots in the cricket");
		for (Map.Entry m : ck.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Enter the desired slot number for booking");
		try {
			Scanner sc = new Scanner(System.in);
			int ckinput = sc.nextInt();
			if (ckinput > 0 && ckinput <= 5) {
				System.out.println("Slot booked successfully");
				System.out.println("Thank you for booking slot----" + ck.get(ckinput));
				ck.remove(ckinput);
			} else {
				System.out.println("Enter the valid input");
				cricket();
			}
		} catch (Exception e) {
			System.out.println("Enter the valid input");
			cricket();
		}
		System.out.println("Press 1 to continue,Press 2 for main menu,Enter any key to exit");
		try {
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			if (i == 1) {
				cricket();
			} else if (i == 2) {
				sports();
			} else {
				System.out.println("Thank for visiting sports complex");
			}
		} catch (Exception e) {
			System.out.println("An error occurred try again");
		}
	}
}
