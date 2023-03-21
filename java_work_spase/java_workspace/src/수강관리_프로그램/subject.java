package 수강관리_프로그램;

public class subject {

	private String subName;
	private int subCord;
	private double subCredite;
	private int subTime;
	private String subTeacher;
	private int subHakgi;
	private String subBunru;

	public subject() {
	}

	public subject(String subName) {
		this.subName = subName;
	}

	public subject(String subName, int subCord) {
		this.subName = subName;
		this.subCord = subCord;
	}

	public subject(String subName, int subCord, double subCredite, int subTime, String subTeacher, int subHakgi,
			String subBunru) {
		this.subName = subName;
		this.subCord = subCord;
		this.subCredite = subCredite;
		this.subTime = subTime;
		this.subTeacher = subTeacher;
		this.subHakgi = subHakgi;
		this.subBunru = subBunru;
	}

	@Override
	public String toString() {
		return "과목명=" + subName + ", 과목코드=" + subCord + ", 학점=" + subCredite + ", 시간=" + subTime + ", 교수 =" + subTeacher
				+ ", 학기=" + subHakgi + ", 분류=" + subBunru;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubCord() {
		return subCord;
	}

	public void setSubCord(int subCord) {
		this.subCord = subCord;
	}

	public double getSubCredite() {
		return subCredite;
	}

	public void setSubCredite(double subCredite) {
		this.subCredite = subCredite;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubTeacher() {
		return subTeacher;
	}

	public void setSubTeacher(String subTeacher) {
		this.subTeacher = subTeacher;
	}

	public int getSubHakgi() {
		return subHakgi;
	}

	public void setSubHakgi(int subHakgi) {
		this.subHakgi = subHakgi;
	}

	public String getSubBunru() {
		return subBunru;
	}

	public void setSubBunru(String subBunru) {
		this.subBunru = subBunru;
	}

}

//* 과목의 정보를 나타내는 클래스
//* 과목코드
//* 과목명
//* 학점
//* 시수(몇시간인지)
//* 교수
//* 학기
//* 전공인지 교양인지