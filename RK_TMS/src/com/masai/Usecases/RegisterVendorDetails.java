package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.AdministratorDao;
import com.masai.Dao.AdministratorDaoImpl;
import com.masai.Dao.VendorDao;
import com.masai.Dao.VendoreDaoImpl;
import com.masai.Model.Vendor;

public class RegisterVendorDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter vendor password : ");
		String pass = sc.next();
		
		System.out.println("Enter vendor firstname : ");
		String name = sc.next();
		
		System.out.println("Enter vendor Mobile no. : ");
		String mob = sc.next();
		
		System.out.println("Enter vendor Email-Id : ");
		String email = sc.next();
		
		System.out.println("Enter vendor Company : ");
		String company = sc.next();
		
		System.out.println("Enter vendor Address : ");
		String address = sc.next();
		
		
		AdministratorDao admin = new AdministratorDaoImpl();
		
		try {
			
			String str = admin.registerVendorDetails(new Vendor(pass,name,mob,email,company,address));
			System.out.println(str);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
