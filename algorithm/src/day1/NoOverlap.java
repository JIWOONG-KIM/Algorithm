package day1;

import java.util.Scanner;

public class NoOverlap {// �ߺ����� �ʴ� ù��° ���� ���ϱ�
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
		System.out.println("���ڿ��Է�");
		String str = sc.nextLine();
		char result = checkOverlap(str);
		if (result == ' ') {
			System.out.println("��� ���ڰ� �ߺ��Դϴ�.");
		} else {
			System.out.println("�ߺ����� �ʴ� ù��° ���ڴ� " + result + "�Դϴ�");
		}
	}

	public static void main(String[] args) {
		NoOverlap no = new NoOverlap();
		no.menu();
	}

}
