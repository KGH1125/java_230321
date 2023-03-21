package day17;

import java.io.File;

public class FileObjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 파일이 가지고 있는 정보를 출력
		 * D:\java_work_spase\java_workspace
		 */
		File f = new File("D:\\java_work_spase\\java_workspace\\out.txt");
//		System.out.println(f.getName());//파일이름
//		System.out.println(f.getPath());//경로+이름
//		System.out.println(f.getAbsolutePath()); //절대경로
//		System.out.println(f.getParent()); //경로
//		System.out.println(File.separator); //파일 구분자
//		System.out.println(File.separatorChar); //
//		
		String fa = f.toString();
		System.out.println(fa); //경로+파일명
		
		System.out.println(fa.substring(0,1));
		//드라이브만
		System.out.println(fa.substring(0,fa.indexOf(File.separator)));
		//파일명만
	//	System.out.println(fa.substring(fa.lastIndexOf(File.separator),fa.indexOf(File.separator)));
		//파일경로만
		System.out.println(fa.substring(fa.indexOf(File.separator)+1,fa.lastIndexOf(File.separator)));
		
		//파일명과 확장자분리
		System.out.println(f.getName());
		String[] str = f.getName().split(File.separator+".");
		System.out.println(str[0]+str[1]);
		
		
	}

}
