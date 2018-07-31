package day1;

import java.util.Scanner;

public class Sort1 {
	// 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
	// 첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
	// 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
	Scanner sc;

	public void menu() {
		sc = new Scanner(System.in);
		System.out.println("정렬 할 수를 입력하세요(-1 = 종료)");
		String input = sc.nextLine();
		int n = 0;
		try {
			n = Integer.parseInt(input);
			if (input.equals("-1")) {
				System.out.println("종료합니다");
				System.exit(0);
			}
			if (n > 1000000000 || n < 0) {
				System.out.println("숫자가 너무 크거나 음수입니데이");
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니데이");
			return;
		}
		int[] num = descSort(makeNumArray(input));
		for (int i : num) {
			System.out.print(i);
		}
		System.out.println("\n-----출력 완료------");
	}

	public int[] makeNumArray(String str) {// 입력받은 문자열을 숫자 배열 형태로 변환
		char[] ch = str.toCharArray();
		int num[] = new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			num[i] = ch[i] - 48;// ASCII넘버를 이용해 char형태의 단일 문자를 숫자로 치환
		}
		return num;
	}

	public int[] descSort(int[] num) {// 정렬 담당 메서드
		int buffer = 0;
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] < num[i + 1]) {// 한칸 옆의 배열과 비교해서 자리 치환
				buffer = num[i];
				num[i] = num[i + 1];
				num[i + 1] = buffer;
				i = -1;// 치환 했다면 다시 처음부터
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Sort1 st = new Sort1();
		while (true) {
			st.menu();
		}
	}

}
