package day4;

import java.util.Scanner;

interface IVehicle {
	// indicate how much a basic tune-up costs
	public double tuneUpCost();

	
	boolean canCarry(int numPassengers, int ch);


	public boolean canCarry(int numPassengers);
	}



	class Car implements IVehicle{



	public boolean tuneUpCost(int ch) {
		if(ch==1) {
		
	System.out.println("Tune up costs Rs.2000");
	return true;
		}
		else {
			System.out.println("Tune up costs Rs.10000");
			return false;
		}
		
	}



	@Override
	public boolean canCarry(int numPassengers,int ch) {
		if(ch==1) {
	if(numPassengers<=5) {
	System.out.println("True,The vehile holds the passengers");
	return true;
	}
	else {

	System.out.println("False,The vehicle cannot hold so many passengers");
	return false;

	}}
		else {
			if(numPassengers<=40) {
				System.out.println("True,The vehile holds the passengers");
				return true;
				}
				else {

				System.out.println("False,The vehicle cannot hold so many passengers");
				return false;

				}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public double tuneUpCost() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public boolean canCarry(int numPassengers) {
		// TODO Auto-generated method stub
		return false;
	}

	}