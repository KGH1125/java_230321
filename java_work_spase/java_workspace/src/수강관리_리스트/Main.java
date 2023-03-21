package 수강관리_리스트;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		StudentManage sm = new StudentManage();
		Scanner sc = new Scanner(System.in);
		String menu = "0";

		do {
			System.out.println("[메뉴]");
			System.out.println("1.학생등록");
			System.out.println("2.학생확인");
			System.out.println("3.학생검색");
			System.out.println("4.수강신청");
			System.out.println("5.수강철회");
			System.out.println("6.종료");
			menu = sc.next();
			System.out.println();

			switch (menu) {
			case "1":
				sm.insertStudent(sc);
				break;
			case "2":
				sm.printStudent();
				break;
			case "3":
				sm.serchStudent(sc);
				break;
			case "4":
				sm.registerSubject(sc);
				break;
			case "5":
				sm.deleteSubject(sc);
				break;
			case "6":
				break;
			default:
				System.out.println("잘못된 메뉴입니다");
			}

		} while (!menu.equals("6"));
		System.out.println("프로그램 종료");

		sc.close();
	}

}
