package ca.demo.salestool;

public class Main {
	
	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		dispalyGreeting();
		data.display();
	}
	private static void dispalyGreeting(){
		System.out.println("HELLO HAPPY SALES PEOPLE!"); 
		System.out.println("THIS APP SHOWS SALES");
	}

}
