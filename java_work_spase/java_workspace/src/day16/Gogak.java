package day16;

import java.util.Objects;

public class Gogak implements Comparable<Gogak> {
	private String name;
	private int age;
	private int money;
	
	
	
	public Gogak(String name, int age, int money) {
		this.name = name;
		this.age = age;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	/*
	@Override
	public int hashCode() {
		return Objects.hash(age, money, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gogak other = (Gogak) obj;
		return age == other.age && money == other.money && Objects.equals(name, other.name);
	}
	*/
	@Override
	public int compareTo(Gogak o) {
		// TODO Auto-generated method stub
	//	Gogak.this.age = (Gogak)o;
		return 0;
	}
}
