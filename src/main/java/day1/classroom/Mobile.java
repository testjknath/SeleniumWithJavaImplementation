package day1.classroom;

public class Mobile {

	public void makeCall(int mob_num) {
	System.out.println(mob_num);	
	}
	
	public boolean sendSMS(String sms) {
		System.out.println(sms);
		return true; 
	}
	
	public boolean shutDown() {
		System.out.println("Shut down");
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mob = new Mobile();
		mob.makeCall(9841);
		boolean sendSMS = mob.sendSMS("Hi Hello");
		System.out.println(sendSMS);
		//boolean shutDown = mob.shutDown();
		mob.shutDown();
		//System.out.println(shutDown);
	}

}
