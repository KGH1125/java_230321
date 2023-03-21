package 수강관리_프로그램;

import java.util.Scanner;

public class studentManager implements program {
	private int countSt;
	private student[] st = new student[5];

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		for (int i = 0; i < countSt; i++) {
			st[i].stdprint();
		}
	}

	@Override
	public void insertStudent(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("학번 : ");
		int 학번 = sc.nextInt();
		System.out.println("주민번호 : ");
		int birthday = sc.nextInt();
		System.out.println("학부 : ");
		String faculy = sc.next();
		System.out.println("학과 : ");
		String major = sc.next();
		System.out.println("----------");
		student s = new student(학번, name, birthday, faculy, major);
		if (countSt == st.length) {
			student[] tmp = new student[st.length + 5];
			System.arraycopy(st, 0, tmp, 0, st.length);
			st = tmp;
		}

		st[countSt] = s;
		countSt++;

	}

	@Override
	public void serchStudent(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("찾을 학생의 이름을 입력해주십시오");
		String name = sc.next();
		int a = -1;
		for (int i = 0; i < countSt; i++) {
			if (st[i].getName().equals(name)) {
				st[i].stdprint();
				a = i;

				break;
			}
		}
		if (a == -1) {
			System.out.println("검색된 학생이 없습니다");
		}

	}

	@Override
	public void registerSubject(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("이름을 입력해주십시오");
		String name = sc.next();
		int index = -1;
		for (int i = 0; i < countSt; i++) {
			if (st[i].getName().equals(name)) {
				System.out.println("과목명을 입력해 주십시오");
				String subName = sc.next();
				st[i].addSub(new subject(subName));
				index = i;
				System.out.println("등록되었습니다");
			}
		}
		if (index == -1) {
			System.out.println("학생 이름이 올바르지 않습니다");
		}
	}

	@Override
	public void deleteSubject(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("이름을 입력해주십시오");
		String name = sc.next();
		int index = -1;
		for (int i = 0; i < countSt; i++) {
			if (st[i].getName().equals(name)) {
				System.out.println("삭제할 과목명을 입력해 주십시오");
				String subName = sc.next();
				st[i].delSub(subName);
				System.out.println("삭제되었습니다");
			}
			if (index == -1) {
				System.out.println("학생 이름이 올바르지 않습니다");
			}
		}

	}
}
