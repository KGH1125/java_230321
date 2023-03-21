package day16;

import java.util.ArrayList;

public class StreamEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("홍길동",52));
		list.add(new Student("홍길순",99));
		list.add(new Student("김갑순",87));
		list.add(new Student("이봉순",68));
		list.add(new Student("박철준",80));
		
		list.stream().forEach(a->System.out.println(a.getName()+":"+a.getScore()));
		System.out.println("합:"+list.stream().mapToInt(a->a.getScore()).sum());
		System.out.println("총 인원수:"+list.stream().count());	
		System.out.println("70점 이상의 합:"+list.stream().mapToInt(a->a.getScore()).filter(a->a>=70).sum());
		
		list.stream().map(a->a.getName()).sorted().forEach(b->System.out.println(b));
		
		
		
	}

}
