package day1;

import java.util.Scanner;

public class NoOverlap {// 중복되지 않는 첫번째 문자 구하기
	Scanner sc;

	public char checkOverlap(String str) {
		str = str.replaceAll(" ", "");
		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			boolean flag = true;
			for (int j = 0; j < c.length; j++) {
				if (i != j && c[i] == c[j]) {
					flag = false;
				}
			}
			if (flag) {
				return c[i];
			}
		}
		return ' ';
	}

	public void menu() {
		sc = new Scanner(System.in);
		System.out.println("문자열입력");
		String str = sc.nextLine();
		char result = checkOverlap(str);
		if (result == ' ') {
			System.out.println("모든 문자가 중복입니다.");
		} else {
			System.out.println("중복되지 않는 첫번째 문자는 " + result + "입니다");
		}
	}

	public static void main(String[] args) {
		NoOverlap no = new NoOverlap();
		no.menu();
	}

}
