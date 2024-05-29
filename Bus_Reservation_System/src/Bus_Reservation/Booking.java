package Bus_Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String passenger_name;
	int busno;
	Date date;
	Scanner sc=new Scanner(System.in);
	
	public Booking() throws ParseException {
		// TODO Auto-generated constructor stub
		System.out.println("Ente the passenger name:");
		passenger_name=sc.next();
		System.out.println("Enter the bus Number:");
		busno=sc.hashCode();
		System.out.println("Enter the date (dd-MM-yyyy):");
		String dateInput=sc.next();
		date=new SimpleDateFormat("dd-MM-yyyy").parse(dateInput);
		//dateFormate.parse(dateInput, null);
		
		
	}

}
