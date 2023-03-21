package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderStreamEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 줄단위로 읽음
		 * 더이상 읽을 라인이 없으면 null을 리턴
		 * 보조스트림을 사용할 경우 기반스트림을 생성자에 추가해야됨
		 * 
		 */
		BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\EZENIC-155\\Downloads\\ararar.txt"));
		
		while(true) {
			String line = buffer.readLine();
			if(line==null) {
				break;
			}else {
				System.out.println(line);
			}
			
		}
		
		buffer.close();
		
	}

}
