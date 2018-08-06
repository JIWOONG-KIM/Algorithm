package day1;

import java.util.*;

public class ChangeStr {// 문자열의 단어를 위치바꾸는 함수작성
	Scanner sc;

	public void changeWord(String str, String str1, String str2) {
		str = str.replaceAll(str1, "<replace1>");
		str = str.replaceAll(str2, "<replace2>");

		str = str.replaceAll("<replace1>", str2);
		str = str.replaceAll("<replace2>", str1);

		System.out.println(str);

	}

	public boolean checkWord(String str1, String str2) {
		int n = str1.indexOf(str2, 0);
		if (n < 0) {
			System.out.println("찾는 문자가 없습니다");
			return false;
		} else {
			return true;
		}
	}

	public void menu() {
		sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("문자열을 입력하세요");
		String str = sc.nextLine();
		System.out.println("바꿀 문자열을 입력하세요");
		String str1 = sc.nextLine().trim();
		flag = checkWord(str, str1);
		System.out.println("바뀔 문자열을 입력하세요");
		String str2 = sc.nextLine().trim();
		flag = checkWord(str, str2);

		if (flag) {
			changeWord(str, str1, str2);
		} else {
			return;
		}

	}

	public static void main(String[] args) {
		ChangeStr cs = new ChangeStr();
		cs.menu();
	}

}
