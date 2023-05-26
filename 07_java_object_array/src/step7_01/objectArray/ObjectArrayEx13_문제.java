package step7_01.objectArray;

import java.util.ArrayList;

class Tv1 {
	
	String name;
	String brand;
	int price;

	void setData(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
}


public class ObjectArrayEx13_문제 {

	public static void main(String[] args) {
		
		// ArrayList 사용
		ArrayList<Tv1> list = new ArrayList<Tv1>();

		Tv1 temp = new Tv1();
		temp.setData("TV", "삼성", 1000);
		list.add(temp);
		
		temp = new Tv1();
		temp.setData("시그니처TV", "엘지", 2000);
		list.add(temp);

		temp = new Tv1();
		temp.setData("스마트TV", "애플", 3000);
		list.add(temp);
	
		list.remove(1);
		
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println("name : " + list.get(i).name);
			System.out.println("brand : " + list.get(i).brand);
			System.out.println("price : " + list.get(i).price);
			System.out.println();
		}
		
		System.out.println("\n");
		
		for (Tv1 tv1 : list) {
			System.out.println("name : " + tv1.name);
			System.out.println("brand : " + tv1.brand);
			System.out.println("price : " + tv1.price);
			System.out.println();
		}


	}

}
