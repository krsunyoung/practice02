package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int inputNumber = scanner.nextInt();

		/* 여기에 구현 코드를 작성 합니다. */
		int sum = 0;
		int i = 0 ;
		
		if (inputNumber % 2 == 0) {

			for (i = 0; i <= inputNumber; i=i+2) {
				sum = sum + i;
			}

		}else {

			for (i = 1; i <= inputNumber; i=i+2) {
				sum = sum + i;
			}
		}

		System.out.println(sum);
		scanner.close();
	}

}
