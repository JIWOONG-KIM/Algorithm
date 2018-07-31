package day1;

import java.util.*;

public class Sumdivisor {

	// � ���� n�� �ڽ��� ������ ��� ������� �հ� ������, �� ���� ��������� �Ѵ�.
	//
	// ���� ��� 6�� 6 = 1 + 2 + 3 ���� �������̴�.
	//
	// n�� ���������� �ƴ��� �Ǵ����ִ� ���α׷��� �ۼ��϶�.
	Scanner sc;

	public void menu() {// �� �Է¹ޱ�, ��ȿ���˻�, ���
		sc = new Scanner(System.in);
		System.out.println("�� �Է�");
		String input = sc.nextLine();
		int n = -1;
		try {
			n = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}
		if (n == -1) {
			System.out.println("�����մϴ�");
			System.exit(0);
		} else if (n <= 2 || n >= 100000) {
			System.out.println("2<n<100,000 �� ���ڸ� �Է��ϼ���");
		} else {
			System.out.println(calc(n));
		}
	}

	public String calc(int n) {
		List<Integer> divlist = new ArrayList<Integer>();
		for (int i = 2; i < n; i++) {// 1�� ������ ������ ��� ���ؼ� ����Ʈ�� ����
			if (n % i == 0) {
				divlist.add(i);
			}
		}
		String sum = "1";// ����� ���� ��Ʈ�� ���ڿ�. 1���� ����
		int sum2 = 1;// 1���� �����ؼ� ���ΰ� ������ �˻��ϱ� ���� ���
		for (Integer i : divlist) {
			sum += "+" + i;// ���ڿ��� ���ϱ�
			sum2 += i;// ���� ������� �� ���ϱ�
		}
		if (sum2 != n) {
			return n + " is not perfect";// �������� �ƴ� ��� ����
		} else {
			return n + " = " + sum;// �������� ��� ����
		}
	}

	public static void main(String[] args) {
		Sumdivisor sv = new Sumdivisor();
		while (true) {
			sv.menu();
		}
	}
}
