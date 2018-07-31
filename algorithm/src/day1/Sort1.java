package day1;

import java.util.Scanner;

public class Sort1 {
	// �迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.
	// ù° �ٿ� �����ϰ����ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̴�.
	// ù° �ٿ� �ڸ����� ������������ ������ ���� ����Ѵ�.
	Scanner sc;

	public void menu() {
		sc = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���(-1 = ����)");
		String input = sc.nextLine();
		int n = 0;
		try {
			n = Integer.parseInt(input);
			if (input.equals("-1")) {
				System.out.println("�����մϴ�");
				System.exit(0);
			}
			if (n > 1000000000 || n < 0) {
				System.out.println("���ڰ� �ʹ� ũ�ų� �����Դϵ���");
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϵ���");
			return;
		}
		int[] num = descSort(makeNumArray(input));
		for (int i : num) {
			System.out.print(i);
		}
		System.out.println("\n-----��� �Ϸ�------");
	}

	public int[] makeNumArray(String str) {// �Է¹��� ���ڿ��� ���� �迭 ���·� ��ȯ
		char[] ch = str.toCharArray();
		int num[] = new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			num[i] = ch[i] - 48;// ASCII�ѹ��� �̿��� char������ ���� ���ڸ� ���ڷ� ġȯ
		}
		return num;
	}

	public int[] descSort(int[] num) {// ���� ��� �޼���
		int buffer = 0;
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] < num[i + 1]) {// ��ĭ ���� �迭�� ���ؼ� �ڸ� ġȯ
				buffer = num[i];
				num[i] = num[i + 1];
				num[i + 1] = buffer;
				i = -1;// ġȯ �ߴٸ� �ٽ� ó������
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
