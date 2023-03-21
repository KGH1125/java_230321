package 수강관리_리스트;

public class Subject {

	private String subName;
	private String subCord;
	private String subTime;
	private String subTeacher;
	private String subCredite;

	public Subject() {
	}

	public Subject(String subName) {
		super();
		this.subName = subName;
	}

	public Subject(String subName, String subCord, String subTime, String subTeacher, String subCredite) {
		super();
		this.subName = subName;
		this.subCord = subCord;
		this.subTime = subTime;
		this.subTeacher = subTeacher;
		this.subCredite = subCredite;
	}

	public String getSubName() {
		return subName;
	}
	public void subPrint() {
		System.out.printf("과목명:%s 과목코드:%s 시간:%s 교수:%s 학점:%s %n",subName,subCord,subTime,subTeacher,subCredite);
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getSubCord() {
		return subCord;
	}

	public void setSubCord(String subCord) {
		this.subCord = subCord;
	}

	public String getSubTime() {
		return subTime;
	}

	public void setSubTime(String subTime) {
		this.subTime = subTime;
	}

	public String getSubTeacher() {
		return subTeacher;
	}

	public void setSubTeacher(String subTeacher) {
		this.subTeacher = subTeacher;
	}

	public String getSubCredite() {
		return subCredite;
	}

	public void setSubCredite(String subCredite) {
		this.subCredite = subCredite;
	}

}
