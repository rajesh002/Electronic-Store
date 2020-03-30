package dao;

import java.util.ArrayList;

public class Category {
	ArrayList<String> Categories=new ArrayList<String>();
	public Category(){
		Categories.add("Refrigerators");
		Categories.add("Washing Machines");
		Categories.add("Televisions");
		Categories.add("Mobile Phones");
		Categories.add("Air conditioners");
	}
	
	
	public void displayCategory() {
		for(int index1=0;index1<Categories.size();index1++) {
	         System.out.println(index1+1+" "+Categories.get(index1));
	      }
	}
	
	
	
	
	
}














/*
public class Category {
    private float price;
    private String brand;
    private String model;
  Category(float price,String brand,String model){
    	this.price=price;
    	this.model=model;
    	this.brand=brand;
    }
    public void setPrice(float price) {
    	this.price=price;
    }
    public void setBrand(String brand) {
    	this.brand=brand;
    }
    public void setModel(String model) {
    	this.model=model;
    }
    
    
    public float getPrice() {
    	return price;
    }
    public String getBrand() {
    	return brand;
    }
    public String getModel() {
    	return model;
    }
}
*/

