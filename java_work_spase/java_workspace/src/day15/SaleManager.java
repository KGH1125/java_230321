package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	
	Scanner sc =new Scanner(System.in);
	private ArrayList<Sale<String,Integer>> p =new ArrayList<>();
	private ArrayList<Sale<String,Integer>> o =new ArrayList<>();
	
	public void add() {
		System.out.println("제품명");
		String m=sc.next();
		
		System.out.println("가격");
		String r=sc.next();
		
		Sale s =new Sale (m,r);
		p.add(s);
	}

}
