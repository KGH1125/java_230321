package 수강관리_프로그램;

import java.util.Scanner;

public interface program {
	
	void printStudent();				//학생 전체 리스트
	void insertStudent(Scanner sc); 	//학생추가
	void serchStudent(Scanner sc);		//학생검색
	void registerSubject(Scanner sc);	//수강신청
	void deleteSubject(Scanner sc); 	//수강철회

}
