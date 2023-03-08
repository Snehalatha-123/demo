package Constructors;

import java.util.Scanner;

public class Prime_Constructor {
	int fno;
	int sno;
	int n = 20;

	public Prime_Constructor(int fno, int sno) {
		this.fno = fno;
		this.sno = sno;
	}

	void Prime() {
		int n = sno;

		for (int i = fno; i <= n; i++) {
			int Count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					Count++;
				}
			}

			if (Count == 0) {
				System.out.println(i + " prime Number ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Prime_Constructor n = new Prime_Constructor(1, 20);
		n.Prime();
	}
}
