package 수강관리_리스트;

import java.util.ArrayList;
import java.util.Scanner;

import 수강관리_프로그램.program;

public class StudentManage implements program {

	private ArrayList<Student> st = new ArrayList<Student>();

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		for (int i = 0; i < st.size(); i++) {
			st.get(i).printStudentOne();
		}

	}

	@Override
	public void insertStudent(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("등록할 학생의 이름을 입력하십시오");
		String stName = sc.next();
		// 추가로 학생정보 입력을 원하면 여기서 입력받고
		// st.add(new Student(stName,여기에 추가(단,생성자 있을경우만 가능)));
		st.add(new Student(stName));

	}

	@Override
	public void serchStudent(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("검색할 학생의 이름을 입력하십시오");
		String stName = sc.next();
		int index = -1;
		for (int i = 0; i < st.size(); i++) {
			if (st.get(i).getStuName().equals(stName)) {
				st.get(i).printStudent();
				if (st.get(i).getSubList().size() == 0) {
					System.out.println("수강등록된 과목이 없습니다");
				}
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("검색된 학생이 없습니다");
		}
	}

	@Override
	public void registerSubject(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("과목 추가를 원하는 학생의 이름을 입력하십시오");
		String stName = sc.next();
		int index = -1;
		for (int i = 0; i < st.size(); i++) {
			if (st.get(i).getStuName().equals(stName)) {
				System.out.println("추가할 과목명을 입력하십시오");
				String subName = sc.next();
				// 과목에 추가할 내용이 있다면 여기서 입력받고 바로아래
				// st.get(i).getSubList().add(new Subject(subName,이부분에 추가하면됨(단,생성자 있을경우만 가능)));
				st.get(i).getSubList().add(new Subject(subName));
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("검색된 학생이 없습니다");
		}
	}

	@Override
	public void deleteSubject(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("과목 제거를 원하는 학생의 이름을 입력하십시오");
		String stName = sc.next();
		int index = -1;
		int index2 = -1;
		for (int i = 0; i < st.size(); i++) {
			if (st.get(i).getStuName().equals(stName)) {
				System.out.println("삭제할 과목명을 입력하십시오");
				String subName = sc.next();
				for (int j = 0; j < st.get(i).getSubList().size(); i++) {
					if (st.get(i).getSubList().get(j).equals(subName)) {
						st.get(i).getSubList().remove(j);
						index2 = j;
					}
				}
			}
		}
		if (index == -1) {
			System.out.println("검색된 학생이 없습니다");
		}
		if (index2 == -1) {
			System.out.println("해당 과목이 없습니다");
		}

	}

}
