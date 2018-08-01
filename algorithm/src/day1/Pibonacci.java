package day1;

import java.util.Scanner;

public class Pibonacci {// 백준알고리즘 시간초과실패 ㅠㅠ
	int cnt0, cnt1;
	Scanner sc;

	public void getPibonacci(int n) {
		if (n == 0) {
			cnt0++;
			return;
		} else if (n == 1) {
			cnt1++;
			return;
		} else {
			getPibonacci(n - 1);
			getPibonacci(n - 2);
			return;
		}
	}

	public void menu() {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int n2 = sc.nextInt();
			if (n2 <= 40) {
				getPibonacci(n);
				System.out.println(cnt0 + " " + cnt1);
				cnt0 = 0;
				cnt1 = 0;
			}
		}
	}

	public static void main(String[] args) {
		Pibonacci pb = new Pibonacci();
		pb.menu();
	}
}
