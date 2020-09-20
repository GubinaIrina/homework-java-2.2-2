package com.company;

public class Main {

    public static void main(String[] args) {
		double weight = 55.3;
		double height = 1.76;
    	BmiService service = new BmiService();
		double index = service.calculate(55.3, 1.76);


		System.out.printf("Индекс массы тела %.1f",index);



    }
}
