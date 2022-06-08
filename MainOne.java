package com.project;

import java.util.*;
import java.sql.*;

public class MainOne {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);

		String loop = "y";
		while(loop.equals("y")) {
			
		System.out.println("\n********** STORE MANAGEMENT*********");	
		System.out.println("1. Regisster");
		System.out.println("2. Login");
		System.out.println("\n Enter your choice: ");
		
		StoreDetails sf=new StoreDetails();
		int a = sc.nextInt();
		switch(a) {
		case 1:
			sf.registerUser();
			//System.out.println("register");
			break;
		case 2:
			sf.login();   
			//System.out.println("Login");
			break;
		default:
				System.out.println("Enter valid choice");
		}
		System.out.println("Do you want to continue : y/n");
		System.out.println("Do you  want exist press any key");
		loop= sc.next();
	
		}
		
	
	}

}


