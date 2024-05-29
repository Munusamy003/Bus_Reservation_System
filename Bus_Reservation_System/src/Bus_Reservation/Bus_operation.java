package Bus_Reservation;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bus_operation {
	public static void main(String[] args) throws ParseException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Bus Reservation:");
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,45));
		buses.add(new Bus(2,true,45));
		buses.add(new Bus(3,true,45));
		buses.add(new Bus(4,true,45));
		for(Bus b:buses) {
			b.busdetails();
		}
		int passenger_input=1;
		while(passenger_input==1) {
		System.out.println("Enter 1 to Booking or Enter 2 to Exit");
		 passenger_input=sc.nextInt();
		if(passenger_input == 1)
		{
			Booking booking=new Booking();
		}
		}
		
	}

}
