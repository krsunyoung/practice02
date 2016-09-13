package prob3;
import java.util.Scanner;


public class Prob3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
		
		char[] a = s.toCharArray(); 
		
	for ( int i = 0; i<a.length ; i++){

		for ( int j = 0; j<i ; j++){
			
			System.out.print( a );
		}

		 
	}

		//객체안에 있는 문자열을 배열로 저장. 직접접근할수 없게 만들고 내부에 있는 배열을 새배열을 만들어서 새로 리턴해주는것. private으로 변수를 저장했을경우
		//System.out.println( a );
	
		scanner.close();
	}
}
