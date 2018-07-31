package day1;

import java.util.*;

public class Sumdivisor {

	// 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
	//
	// 예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
	//
	// n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
	Scanner sc;

	public void menu() {// 수 입력받기, 유효성검사, 출력
		sc = new Scanner(System.in);
		System.out.println("수 입력");
		String input = sc.nextLine();
		int n = -1;
		try {
			n = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
		}
		if (n == -1) {
			System.out.println("종료합니다");
			System.exit(0);
		} else if (n <= 2 || n >= 100000) {
			System.out.println("2<n<100,000 의 숫자를 입력하세요");
		} else {
			System.out.println(calc(n));
		}
	}

	public String calc(int n) {
		List<Integer> divlist = new ArrayList<Integer>();
		for (int i = 2; i < n; i++) {// 1과 본인을 제외한 약수 구해서 리스트에 저장
			if (n % i == 0) {
				divlist.add(i);
			}
		}
		String sum = "1";// 출력을 위한 스트링 문자열. 1부터 시작
		int sum2 = 1;// 1부터 시작해서 본인과 같은지 검사하기 위해 계산
		for (Integer i : divlist) {
			sum += "+" + i;// 문자열에 더하기
			sum2 += i;// 실제 약수들의 합 구하기
		}
		if (sum2 != n) {
			return n + " is not perfect";// 완전수가 아닐 경우 리턴
		} else {
			return n + " = " + sum;// 완전수일 경우 리턴
		}
	}

	public static void main(String[] args) {
		Sumdivisor sv = new Sumdivisor();
		while (true) {
			sv.menu();
		}
	}
}
