package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * stream : 자료의 대상과 관계없이 동일한 연산을 수행 할 수 있도록 해주는 반복자
		 * 요소가 하나씩 흘러가는 형태로 처리
		 * 재서용 불가능
		 * 중간연산 filter(조건의 맞는 요소 추출),distinct()중복제거
		 * sorted()정렬 map(Function<T, R> mapper)추출 맥스,민
		 * 최종연산 sum() , forEach() ,reduce()계산
		 */
		//Stream<Integer> integerStrom1 = Stream.of(1,2,3,4,5,6,7,8,9);
		int []arr= {1,2,3,7,90};
		long a =Arrays.stream(arr).count();
		System.out.println(a);
		OptionalDouble aa= Arrays.stream(arr).average();
		System.out.println(aa);
		
		int []arr2 = {19,97,11,25};
		int sum=0;
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]>70) {
				sum+=arr2[i];
			}
		}
		System.out.println("자바:"+sum);
		
		int sum2 =Arrays.stream(arr2).filter(b->b>=70).sum();
		System.out.println("stream:"+sum2);
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		list.add(11);
		list.add(20);
		list.add(80);
		list.add(68);
		Stream<Integer> s = list.stream();
		int ls=s.mapToInt(n->n.intValue()).sum();
		System.out.println(ls);
	}

}
