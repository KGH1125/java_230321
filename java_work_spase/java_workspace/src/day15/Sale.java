package day15;
//제네릭 미지의 타입
public class Sale <K,V>{
	private K menu;
	private V prise;
	
	public Sale() {	}

	public Sale(K menu, V prise) {
		this.menu = menu;
		this.prise = prise;
	}

	public K getMenu() {
		return menu;
	}

	public void setMenu(K menu) {
		this.menu = menu;
	}

	public V getPrise() {
		return prise;
	}

	public void setPrise(V prise) {
		this.prise = prise;
	}
		
	
	
	
	
	
	
	
	
	

}
