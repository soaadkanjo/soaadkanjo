package myts1;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner cons = new Scanner(System.in); 
			System.out.println("enter number");
			int num1 = cons.nextInt();
			String soaadString;
			switch (num1) {
			case 1 : soaadString="sunday";
			break;
			case 2 : soaadString="monday";
			break;
			case 3 : soaadString="tuesday";
			break;
			case 4 : soaadString="wednesday";
			break;
			case 5 : soaadString="thursday";
			break;
			case 6 : soaadString="friday";
			break;
			case 7 : soaadString="saturday";
			break;
		}
		System.out.println("soaadstring");
	}
}

