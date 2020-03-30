package controller;

import java.awt.List;
import java.util.*;

import dao.Category;
import dao.Refrigerator;

public class Main {
	static int totalAmount=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int itemSelection;
		int BrandSelection;
		int ModelSelection;
		String userChoice;
		do {
		System.out.println("---------Electronic Strore----------");
		System.out.println("Select which item You want to buy:");
		Category cg=new Category();
		cg.displayCategory();
		itemSelection =sc.nextInt();
		switch(itemSelection) {
			case 1:
					Refrigerator rf=new Refrigerator();
					rf.displayBrands();
					BrandSelection =sc.nextInt();
					rf.displayModels(BrandSelection);
				//	BrandKey=
					ModelSelection =sc.nextInt();
					sc.nextLine();
					totalAmount+=rf.getPrice(ModelSelection);
		}
		System.out.println("Final amount of your shopping is "+totalAmount);
		System.out.println("Are u want to continue the shopping :yes/no");
		userChoice=sc.nextLine();
		}while(userChoice.equals("yes"));
		System.out.println("Thank you");
		sc.close();
		}
		
	}


