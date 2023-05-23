package org.generation.test;

import com.citibanamex.Atm;

public class AtmTest {

	public static void main(String[] args) {
		System.out.println("Counter Atm: " +  Atm.getCounterAtm() );
		
		Atm cajeroA = new Atm(9_000);
		Atm cajeroB = new Atm();	
		Atm cajeroC = new Atm("777000");
		
		cajeroA.deposit(4_000);		
		System.out.println( cajeroA.displayInfo() );
		cajeroA.withdraw(2_500);
		System.out.println( cajeroA.displayInfo() );
		cajeroA.withdraw(1_000);
		cajeroA.withdraw(500);
		System.out.println( cajeroA.displayInfo() );
		
		System.out.println( cajeroA.getLog()  );
		String ANSI_RESET = "\u001B[0m";
	    String ANSI_BLUE = "\u001B[34m";
	    System.out.println(ANSI_BLUE + cajeroA.getLog() + ANSI_RESET);


	}

}
