package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Arrays;

/*
 *
 *  [ java.util.ArrayList ]
 *  
 *	 - 배열은 한번 선언하면 프로그램에서 배열의 크기를 바꿀 수 없다.
 * 	 - ArrayList 클래스는 데이터가 입력되면 자동으로 크기가 커지고 데이터가 삭제되면 자동으로 크기가 작아진다.
 *   - 중간에 데이터가 삽입되면 데이터가 삽입될 위치부터 모든 데이터가 뒤로 이동되고 중간의 데이터가 제거된 다음 위치부터 모든 데이터가 앞으로 이동한다.
 *   
 *   [ Array]
 * 
 *   - 크기가 고정됨     
 *   - 데이터 타입 고정
 *   
 *   
 *   [ ArrayList 생성 방법 ]
 * 
 *   - 크기가 가변적이다. 데이터 타입 가변적이다.
 *   - method로 제어한다.
 *   ArrayList<Integer> list = new ArrayList<Integer>();     
 *   ArrayList<Integer> list = new ArrayList<>();  // 우변의 제네릭의 데이터형은 생략 가능
 *   ArrayList<String> list = new ArrayList<String>();
 *   ArrayList<Product> list = new ArrayList<Product>();
 *   ArrayList<Member> list = new ArrayList<Member>();
 *   
 *   
 *   
 *   * [ 래퍼 클래스(wrapper class) ]
 * 
 * 	- 래퍼 클래스란 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
 *   [기본형]          [래퍼 클래스]
 *    byte              Byte
 *    short             Short
 *    int              Integer
 *    long              Long
 *    float             Float
 *    double            Double
 *    char              Character
 *    boolean           Boolean
 *
 *
 *
 *  [ 제네릭, 예시 : "<Integer>" ]
 *  
 * - 제네릭(generic)이라 부르며 ArrayList에 저장될 데이터 타입을 반드시 클래스로 작성한다.
 * - 기본 자료형 데이터를 저장하는 ArrayList를 만들어야 하는 경우에는 래퍼 클래스를 사용한다.
 *   
 *   
 */

public class ObjectArrayEx10 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("arr : " + Arrays.toString(arr)); // arr : [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.out.println("list : " + list); // list : [] - 데이터
		System.out.println("\n===========================\n");
		
		// add(value) : arrayList의 맨뒤에 value를 추가한다.
		// add(index,value) : arrayList의 index번째에 value를 추가한다.
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		list.add(10);
		list.add(20);
		list.add(40);
		list.add(2,  30);
		list.add(50);
		
		System.out.println("arr : " + Arrays.toString(arr)); // arr : [10, 20, 30, 40, 50, 0, 0, 0, 0, 0]
		System.out.println("list : " + list); // list : [10, 20, 30, 40, 50]
		System.out.println("\n===========================\n");		
		
		// size() : arrayList의 데이터의 개수를 반환한다.
		System.out.println("arr 크기 : " + arr.length); // 10
		System.out.println("list 크기 : " + list.size()); // 5
		
		// set(index,value) : ArrayList의 index번째의 값을 value값으로 수정한다.
		arr[0] = 1000;
		arr[1] = 2000;
		arr[2] = 3000;
		
		list.set(0, 1000);
		list.set(1, 2000);
		list.set(2, 3000); // 패턴 암기
		
		System.out.println("arr : " + Arrays.toString(arr)); // arr : [1000, 2000, 3000, 40, 50, 0, 0, 0, 0, 0]
		System.out.println("list : " + list); // list : [1000, 2000, 3000, 40, 50]
		System.out.println("\n===========================\n");		
		
		// remove(index) : ArrayList의 index번째 위치의 값을 삭제한다.(reset)
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;
		
		list.remove(2);
		list.remove(1);
		list.remove(0);
		
		System.out.println("arr : " + Arrays.toString(arr)); // arr : [0, 0, 0, 40, 50, 0, 0, 0, 0, 0]
		System.out.println("list : " + list); // list : [40, 50]
		System.out.println("\n===========================\n");		
		
		// get(index) : ArrayList의 index번째의 value를 얻어온다.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");  // 0, 0, 0, 40, 50, 0, 0, 0, 0, 0			
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " "); //40, 50			
		}
		System.out.println("\n");
		
		arr = null; // 배열은 삭제가 되지 않으며, Link를 삭제
		list.clear(); // ArrayList의 데이터 삭제
		// list.add(1000);
		
		list = null; // ArrayList 자체를 삭제
		// list.add(1000); // 오류
		
	}

}
