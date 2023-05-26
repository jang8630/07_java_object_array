package step7_01.objectArray;

class Product {
	
	String name;
	int price;
}

public class ObjectArrayEx01 {

	public static void main(String[] args) {
		
		// Product p = new Product();
		// 클래스 배열 생성방법 > 클래스명[] 배열명 = new 클래스명[크기];
		Product[] productList = new Product[3];
		
		productList[0] = new Product(); // 객체, 주소 Link
		productList[1] = new Product();
		
		Product p = new Product();
		p.name = "패드";
		p.price = 10000;
		
		productList[2] = p;
		
		productList[0].name = "기계식 장치";
		productList[0].price = 45000;

		productList[1].name = "마우스";
		productList[1].price = 85000;
		
		for (int i = 0; i < productList.length; i++) {
			System.out.println("name : " + productList[i].name);
			System.out.println("price : " + productList[i].price);
			System.out.println();
		}
		
		// [응용] 생각해 보기
		 Product[] temp1 = productList; 	 // 주소
		 Product temp2 = productList[0]; 	 // 주소
		 String temp3 = productList[0].name; // 데이터
		 int temp4 = productList[0].price;   // 데이터
		 
		Product temp = productList[2]; // 주소
		System.out.println("temp : " + temp); // 주소 : step7_01.objectArray.Product@762efe5d
		System.out.println("productList[2] : " + productList[2]); // 주소 : step7_01.objectArray.Product@762efe5d
			
		System.out.println("temp.name : " + temp.name); // p.name : 패드
		System.out.println("productList[2].name : " + productList[2].name); // 패드
			
		temp.name = "장패드1";
		System.out.println("temp.name : " + temp.name); // 장패드1
		System.out.println("productList[2].name : " + productList[2].name); // 장패드1
			
		productList[2].name = "장패드2";
		System.out.println("temp.name : " + temp.name); // 장패드2
		System.out.println("productList[2].name : " + productList[2].name); // 장패드2
		
	}

}
