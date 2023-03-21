package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EnglishDictionary {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Word w = new Word();
		w.MakeWord(sc);
		//w.PrintWord();
		w.PrintWord2();
	}
	
	

}

class Dictionary {
//	ArrayList<E>
}

class Word {
	private Map<String, ArrayList<String>> words = new HashMap<>();

	/*
	 * y=입력 n=종료 메서드 makeWord 단어가 이미 있다면 이미 있는 단어입니다
	 * 
	 */
	public void MakeWord(Scanner sc) {
		while(true) {
			System.out.println("단어를 추가하시겠습니까?(Y/N)");
			String choi = sc.next();
			if ("y".equals(choi) || "Y".equals(choi)) {
				System.out.println("추가할 단어를 입력해 주십시오");
				String word = sc.next();
				if(words.containsKey(word)) {
					System.out.println("이미 등록된 단어입니다");
				}else {
					ArrayList<String> means = new ArrayList<>();
					String choi2="y";
					do {
						System.out.println("단어의 뜻을 입력해주세요");
						String mean = sc.next();
						means.add(mean);
						System.out.println("뜻을 추가로 입력하려면 Y를 눌러주세요");
						System.out.println("아니라면 아무키나 눌러주세요");
						choi2=sc.next();
					}while("y".equals(choi2)||"Y".equals(choi2));
					words.put(word,means);
					System.out.println("단어가 등록되었습니다");
				}		
			} else if ("n".equals(choi) || "N".equals(choi)) {
				break;
			} else {
				System.out.println("잘못된 입력입니다");
			}
		}

	}

	public void PrintWord() {
		Set<String> keySet = words.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k =keyIterator.next();
			ArrayList<String> v = words.get(k);
			System.out.print(k+":");
			for(int i=0;i<v.size();i++) {
				System.out.print(v.get(i)+" ");
			}
			System.out.println();
		}
	}
	
	public void PrintWord2() {
		for(String s : words.keySet()) {
			System.out.println(s);
			System.out.println(words.get(s));
		}
		
	}
	
}