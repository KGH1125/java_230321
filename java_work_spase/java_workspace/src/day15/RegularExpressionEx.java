package day15;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정규 표현식
		//문자형식검증
		/*
		 * [a-zA-Z]:영문 대소문자 가능
		 * \d : 숫자 가능 
		 * \w : 숫자 알파벳 전부가능
		 * . : 문자 한개
		 * ? : 문자한개 없어도됨 있어도됨
		 * * : 문자 여러개 없어도됨 있어도됨 
		 * {n,} : n자리 이상 n=숫자
		 * ^ $ : 시작^ 끝$
		 * 
		 * (02|010)-\d{3,4}-\d{4}  
		 * 
		 * 
		 */
		
		String[] strArr = {"bat","baby","car","cd","apple","disk","count","banana","pink"};
		
		Arrays.sort(strArr);//배열정렬
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+" ");			
		}
		System.out.println();
		
		Pattern pt=Pattern.compile("b[a-zA-z]*");
		for(String str : strArr) {
			Matcher mat =pt.matcher(str);
			if(mat.matches()) { // mat이 트루인지 확인
				System.out.print(str+" ");
			}
		}
		
	}

}
