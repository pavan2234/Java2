package parkingSlots;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Vehicle {
	Map<Integer,String> bk = new HashMap<Integer,String>();
	Map<Integer,String> cr = new HashMap<Integer,String>();
	static Map<Integer,String> bkselected = new HashMap<Integer,String>();
	static Map<Integer,String> crselected = new HashMap<Integer,String>();
	public void start() throws Exception {
		System.out.println("Welcome to the parking slots");
		System.out.println("Please enter the name");
		name();
		System.out.println("Select your type of vehicle");
		System.out.println("1.Bike");
		System.out.println("2.Car");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i==1) {
			System.out.println("You have selected bike");
			bike();
		}else if(i==2) {
			System.out.println("You have selected car");
			car();
		}else {
			System.out.println("Please enter proper value");
			start();
		}
	}
	public void bike() throws Exception {
		System.out.println("Available slots in bike");
		for(Map.Entry m:bk.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("Enter the number of desired slot");
		try {
			Scanner sc = new Scanner(System.in);
			int bkinput = sc.nextInt();
			if(bk.containsKey(bkinput)) {
				System.out.println("Successfully slot booked");
				System.out.println("The booked slot is--"+bk.get(bkinput));
				String name = null;
				bkselected.put(bkinput, name);
				bk.remove(bkinput);
			}else {
				System.err.println("Slot already booked please choose another");
				bike();
			}
		}catch(Exception e) {
			System.err.println("Exception occurred,please try again"+e);
			bike();
		}
	 try {
		 System.out.println("Press 1 to continue,press 2 to main page,Press any key to exit");
		 Scanner sc = new Scanner(System.in);
		 int i = sc.nextInt();
		 if(i==1) {
			 bike();
		 }else if(i==2) {
			 start();
		 }
		 else {
			 System.out.println("Thank you");
		 }
	 }catch(Exception e) {
		 System.err.println("Error occurred,please try again");
		 start();
	 }
		
	}
	public void car() throws Exception{
		System.out.println("Available slots in Car");
		for(Map.Entry m:cr.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("Enter the number of desired slot");
		try {
			Scanner sc = new Scanner(System.in);
			int crinput = sc.nextInt();
			if(cr.containsKey(crinput)) {
				System.out.println("Successfully slot booked");
				System.out.println("The booked slot is--"+bk.get(crinput));
				String name = null;
				crselected.put(crinput,name);
				cr.remove(crinput);
			}else {
				System.err.println("Slot already booked please choose another");
				car();
			}
		}catch(Exception e) {
			System.err.println("Exception occurred,please try again"+e);
			car();
		}
		try {
			 System.out.println("Press 1 to continue,press 2 to main page,Press any key to exit");
			 Scanner sc = new Scanner(System.in);
			 int i = sc.nextInt();
			 if(i==1) {
				 car();
			 }else if(i==2) {
				 start();
			 }else {
				 System.out.println("Thank you");
			 }
		 }catch(Exception e) {
			 System.err.println("Error occurred,please try again");
			 start();
		 }
	}
	public void name() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if(Pattern.matches("[a-zA-Z]{2,}", name)) {
			System.out.println("Name is "+name);
		}else {
			System.out.println("Please enter valid name");
			name();
		}
	}
}
