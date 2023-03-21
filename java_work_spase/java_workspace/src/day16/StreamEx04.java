package day16;

import java.util.ArrayList;

public class StreamEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Gogak> go = new ArrayList<Gogak>();
		
		go.add(new Gogak("이순신", 40, 100));
		go.add(new Gogak("신사임당", 35, 100));
		go.add(new Gogak("이아들", 10, 50));
		
		go.stream().forEach(a->System.out.println(a.getName()));
		System.out.println("총 비용:"+go.stream().mapToInt(a->a.getMoney()).sum());
		
	
	
	}

}
