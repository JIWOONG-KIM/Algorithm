package day1;

import java.util.*;

public class Factorization {// 소인수분해 하기
	Scanner sc;

	public String getFactor(int num) {
		int n = num;
		String str = "1";
		for (int i = 2; i <= num; i++) {
			if (n % i == 0) {
				n = n / i;
				str += " X " + i;
				i--;
			}
		}

		return num + " = " + str;
	}

	public void menu() {
		sc = new Scanner(System.in);
		System.out.println("정수입력");
		int n = sc.nextInt();
		System.out.println(getFactor(n));

	}

	public static void main(String[] args) {
		Factorization f = new Factorization();
		f.menu();
	}

}
