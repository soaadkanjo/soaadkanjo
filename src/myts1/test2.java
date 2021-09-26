package myts1;

import java.util.Scanner;

public class test2 {


		public static void main(String[] args) {
		    Scanner cons = new Scanner(System.in); 
			System.out.println("enter your age");
			int x = cons.nextInt();
			if (x>=20 && x<=50) {
			System.out.println("enter your hight");
			int y =cons.nextInt();
			if (y>=180) {
				System.out.println("ברוכתינו , התקבלת");
			} else {
				System.out.println("אתה נמוך מידי לתפקיד");
				}
			}
			else {
				System.out.println("ילך אינו מתאים");
			}
		}
		}

