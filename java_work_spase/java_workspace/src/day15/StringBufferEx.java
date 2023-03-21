package day15;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String : 문자열
		 * StringBuffer : 문자열을 추가하거나 변경할 때 사용
		 * append : 문자열을 끝에 추가
		 * insert : 특정 위치에 문자 추가
		 * substring : 문자열추출
		 * 
		 */
		
		//메모리 사용이적음 멀티스레드 사용시 안전성 좋음
		StringBuffer sb = new StringBuffer();
		sb.append("hellow");
		sb.append(" ");
		sb.append("java");
		
		System.out.println(sb);//원래는 주소값이나오는데 안나오네(?)
		System.out.println(sb.toString());
		String a = sb.toString();
		System.out.println(a);
		
		//메모리를 많이 사용
		String str ="";
		str+="hellow";
		str+=" ";
		str+="coco";
		System.out.println(str);
		
		//buffer 사용과 같음 buffer보다는 성능이 조금더 좋음
		StringBuilder sb1 =new StringBuilder();
		sb1.append("hellow");
		sb1.append(" ");
		sb1.append("apple");
		
		
		
		
	}

}
