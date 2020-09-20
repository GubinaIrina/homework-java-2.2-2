package com.company;

public class Main {

    public static void main(String[] args) {
    	BmiService service = new BmiService();
		int index = service.calculate(55.3, 1.76);
		double weight = 55.3;
    	double height = 1.76;

	System.out.println(index);



    }
}
