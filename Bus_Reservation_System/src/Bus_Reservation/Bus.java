package Bus_Reservation;

public class Bus {
	
	private int busno;
	private boolean ac;
	private int buscapacity;
	
	Bus(){
		
	}
	
	Bus(int busno,boolean ac,int cap){
		
		this.busno=busno;
		this.ac=ac;
		this.buscapacity=cap;
	}
	
	
	public int getBusno() {
		return busno;
	}


	public void setBusno(int busno) {
		this.busno = busno;
	}


	public boolean isAc() {
		return ac;
	}


	public void setAc(boolean ac) {
		this.ac = ac;
	}


	public int getBuscapacity() {
		return buscapacity;
	}


	public void setBuscapacity(int buscapacity) {
		this.buscapacity = buscapacity;
	}


	public void busdetails(){
		System.out.println("Bus Number:"+busno+" Ac:"+ac+" Bus Capacity:"+buscapacity);
	}

}
