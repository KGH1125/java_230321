package product;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ProductManager pm = new ProductManager();
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println();
			System.out.println("1.메뉴추가/수정");
			System.out.println("2.메뉴제거");
			System.out.println("3.메뉴리스트 출력");
			System.out.println("4.제품주문");
			System.out.println("5.주문내역확인");
			System.out.println("6.종료");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				pm.addMenu(sc);
				break;
			case 2:
				pm.deleteMenu(sc);
				;
				break;
			case 3:
				pm.printMenu();
				break;
			case 4:
				pm.order(sc);
				break;
			case 5:
				pm.orderChech();
				break;
			case 6:
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		} while (ch != 6);
		System.out.println("종료되었습니다.");

		sc.close();

	}
}
