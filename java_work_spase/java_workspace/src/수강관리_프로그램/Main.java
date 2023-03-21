package 수강관리_프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열 이용 수강관리 인터페이스 program 1. 학생리스트 출력 2. 학생등록 3. 학생검색 4. 학생별로 수강신청 5. 수강철회
		 * 
		 * subject 클래스 생성 과목의 정보를 나타내는 클래스 과목코드 과목명 학점 시수(몇시간인지) 교수 학기 전공인지 교양인지
		 * 
		 * student 클래스 학생정보를 나타내는 클래스 학번 이름 주민번호 학부 학과 수강과목(과목클래스를 배열로) 수강과목 번지를 대신할
		 * count 변수 메서드 -수강과목 추가 (배열이 다 찼다면 늘려주기),삭제
		 * 
		 * studentManager -인터페이스 구현
		 * 
		 * main 메뉴구성 1.학생등록 2.학생확인(리스트) 3.학생검색(한 학생의 정보 출력-수강정보 포함) 4.수강신청 5.수강철회 6.종료
		 */
		studentManager sm = new studentManager();
		Scanner sc = new Scanner(System.in);
		int menu = 0;

		do {
			System.out.println("[메뉴]");
			System.out.println("1.학생등록");
			System.out.println("2.학생확인");
			System.out.println("3.학생검색");
			System.out.println("4.수강신청");
			System.out.println("5.수강철회");
			System.out.println("6.종료");
			menu = sc.nextInt();
			System.out.println();
			
			switch (menu) {
			case 1:
				sm.insertStudent(sc);
				break;
			case 2:
				sm.printStudent();
				break;
			case 3:
				sm.serchStudent(sc);
				break;
			case 4:
				sm.registerSubject(sc);
				break;
			case 5:
				sm.deleteSubject(sc);
				break;
			case 6:
				break;
			default:
				System.out.println("잘못된 메뉴입니다");
			}

		} while (menu != 6);
		System.out.println("종료");

		sc.close();

	}

}
