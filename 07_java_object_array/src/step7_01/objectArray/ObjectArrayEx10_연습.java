package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectArrayEx10_연습 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("arr : " + Arrays.toString(arr)); // arr : [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.out.println("list : " + list); // list : []
		System.out.println("\n===========================\n");
		
		// add(value) : arrayList의 맨뒤에 value를 추가한다.
		// add(index,value) : arrayList의 index번째에 value를 추가한다.		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;

		list.add(100);
		list.add(200);
		list.add(400);
		list.add(2,  250);
		
		System.out.println("arr : " + Arrays.toString(arr)); // arr : [100, 200, 300, 0, 0, 0, 0, 0, 0, 0]
		System.out.println("list : " + list); // list : [100, 200, 250, 400]
		System.out.println("\n===========================\n");	
		
		// set(index,value) : ArrayList의 index번째의 값을 value값으로 수정한다.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		list.set(0, 10);
		list.set(1, 20);
		list.set(2, 30); // 패턴 암기
		
		System.out.println("arr : " + Arrays.toString(arr)); // arr : [10, 20, 30, 0, 0, 0, 0, 0, 0, 0]
		System.out.println("list : " + list); // list : [10, 20, 30, 400]
		System.out.println("\n===========================\n");		
		

	}

}
