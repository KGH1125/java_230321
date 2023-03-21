package day17;

import java.io.IOException;

public class SystemInEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("알파벳 입력");
		int i;
		try {
			while((i=System.in.read())!='\n') {
				
			//	System.out.println(i);
				System.out.print((char)i);
			}
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
