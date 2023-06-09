package day15;

import java.util.Objects;

public class Word implements Comparable<Object> {
	private String word;
	private String mean;

	Word() {
	}

	@Override
	public String toString() {
		return "단어:" + word + " 뜻:" + mean ;
	}

	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public void print() {
		System.out.println(word + " : " + mean);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		// return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
		if (word == null) {
			if (other.word != null) {
				return false;
			}
		} else if (!word.equals(other.word)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Word word = (Word) o;

		return this.word.compareTo(word.word);
	}

}
