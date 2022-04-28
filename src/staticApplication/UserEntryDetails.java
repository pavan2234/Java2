package staticApplication;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserEntryDetails {
	String name;
	String phonenumber;
	public void name() {
		try {
			UserDetails details = new UserDetails();
			System.out.println("Enter your Name");
			Scanner sc = new Scanner(System.in);
			name = sc.nextLine();
			if(Pattern.matches("[a-zA-Z]{2,}",name)){
			details.setName(name);
			System.out.println("Entered name is "+details.getName());
			}else {
				throw new EntryRules();
			}
		}catch(EntryRules e){
		System.out.println("Re-Enter the name please");
		name();
		}
	}
	public void phonenumber() {
		try {
			UserDetails details = new UserDetails();
			System.out.println("Enter your 10 digit mobile number");
			Scanner sc = new Scanner(System.in);
			phonenumber=sc.nextLine();
			if(Pattern.matches("\\d{10}",phonenumber)) {
				details.setPhonenumber(phonenumber);
				System.out.println("Entered Mobile Number is "+details.getPhonenumber());
			}else {
				throw new EntryRules();
			}
		}catch(EntryRules e) {
			System.out.println("Re-Enter the Mobile Number");
			phonenumber();
		}
	}
	public void userregistration() {
		name();
		phonenumber();
		SlotsForSports user = new SlotsForSports();
		user.sportslot();
	}
}
