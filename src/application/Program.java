package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj  = new Department(1, "teste");
		System.out.println(obj);
		
		Seller objS = new Seller(1,"madson","madson@gmail",new Date(), 300.00,obj);
		System.out.println(objS);
	}

}
