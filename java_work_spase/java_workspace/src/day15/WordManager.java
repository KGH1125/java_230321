package day15;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordManager {

	private ArrayList<Word> wordList = new ArrayList<Word>();

	public void exWord() {
		wordList.add(new Word("apple", "사과"));
		wordList.add(new Word("banana", "사과"));
		wordList.add(new Word("dolpin", "돌고래"));
		wordList.add(new Word("fiar", "불"));
	}

	public void addWord(Scanner sc) {
		System.out.println("추가할 단어를 입력해 주십시오");
		String addw = sc.next();
		System.out.println("단어의 뜻을 입력해 주십시오");
		sc.nextLine();// 엔터도 입력받기때문에 엔터를 버릴 스캔.
		String addm = sc.nextLine();// 넥스트라인은 공백을 포함할 수 있음 = 장문가능
		System.out.println("단어:" + addw + " 뜻:" + addm + " 을 등록하시려면 y를 눌러주세요");
		System.out.println("취소하려면 아무키나 누르세요");
		String ch = sc.next();
		if (ch.equals("y") || ch.equals("Y")) {
			wordList.add(new Word(addw, addm));
			System.out.println("단어장에 추가되었습니다");
		} else {
			System.out.println("취소되었습니다");
		}
	}

	public void delWord(Scanner sc) {
		System.out.println("삭제할 단어를 입력해주세요");
		String delw = sc.next();
		int index = -1;
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).getWord().equals(delw)) {
				System.out.println("삭제하시려면 y를 눌러주세요");
				System.out.println("취소하려면 아무키나 눌러주세요");
				String ch = sc.next();
				index = i;
				if (ch.equals("y") || ch.equals("Y")) {
					wordList.remove(i);
					System.out.println("삭제되었습니다");
				} else {
					System.out.println("취소되었습니다");
				}
			}
		}
		if (index == -1) {
			System.out.println("해당하는 단어가 단어장에 없습니다");
		}
	}

	public void corWord(Scanner sc) {
		System.out.println("수정할 단어를 입력해 주십시오");
		String corw = sc.next();
		int index = -1;
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).getWord().equals(corw)) {
				System.out.println("수정하시려면 y를 눌러주세요");
				System.out.println("취소하려면 아무키나 눌러주세요");
				String ch = sc.next();
				index = i;
				if (ch.equals("y") || ch.equals("Y")) {
					System.out.println("수정할 단어의 뜻을 입력해주세요");
					String newm = sc.next();
					wordList.get(i).setMean(newm);
					System.out.println("수정되었습니다");
				} else {
					System.out.println("취소되었습니다");
				}
			}
		}
		if (index == -1) {
			System.out.println("해당하는 단어가 단어장에 없습니다");
		}
	}

	public void serchWord(Scanner sc) {
		System.out.println("검색할 단어를 입력해 주십시오");
		String serw = sc.next();
		int index = -1;
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).getWord().equals(serw)) {
				index = i;
				String w = wordList.get(i).getWord();
				String m = wordList.get(i).getMean();
				System.out.println("단어:" + w + " 뜻:" + m);
			}
		}
		if (index == -1) {
			System.out.println("해당하는 단어가 단어장에 없습니다");
		}
	}

	public void printWrod() {
		// 정렬
		Collections.sort(wordList);
		for (int i = 0; i < wordList.size(); i++) {
			wordList.get(i).print();
		}

	}

	public void printTxt() throws IOException {
		System.out.println("파일로 변환합니다.");
		BufferedWriter fw = new BufferedWriter(new FileWriter("단어장.text"));
		
		for (int i = 0; i < wordList.size(); i++) {	
			fw.write(wordList.get(i).toString()+"\r\n");
			
		}

		fw.close();

	}

}
