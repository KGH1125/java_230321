package day16;

import java.util.ArrayList;

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (int x , int y) -> {return x+y}
		 * return이 있으면 중괄호 생략 불가능
		 * 
		 * str -> System.out.println(str);
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		//int result =add(3,5);
		//System.out.println(result);
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(20);
		number.add(34);
		number.add(54);
		for(Integer i : number) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		number.forEach((n)->{
			System.out.print(n+" ");
		});
		System.out.println();
		
		number.forEach(System.out::println);
		
		System.out.println(number.stream().count());
		
	}

}
