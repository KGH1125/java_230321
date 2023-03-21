package day17;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx01 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out);
		String a ="헬로";
		pw.print(a);
		pw.println();
		pw.printf("%.15f",Math.PI);
		pw.flush();//잔류 바이트 버퍼를 비움
		pw.close();
		
		PrintWriter pw1 = new PrintWriter("tset2.txt");
		for(int i=0;i<10;i++) {
			String data = i+"test2";
			pw1.println(data);
		}
		
		pw1.close();
		
		PrintWriter pw2 = new PrintWriter(new FileWriter("tset2.txt",true));
	
		for(int i=11;i<20;i++) {
			String data = i+"test3";
			pw2.println(data);
		}
		pw2.append('+');
		pw2.append("hello");
		pw2.close();
		
		
		
		
		
		
		
		
		
	}

}
