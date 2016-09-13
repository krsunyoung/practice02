package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		//Goods[] goodsArray = new Goods[3];
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i <3 ; i++){
			String line = scan.nextLine();
//			System.out.println( line );
		 //파싱 ?
			String[] infos = line.split(" "); //스페이스로 라인을 불리하겠다.
			
			String name = infos[0];
			int price = Integer.parseInt(infos[1]);
			int countStock = Integer.parseInt (infos[2]);
			
			System.out.println( name );
			System.out.println( price );
		}
		
		scan.close();
	}

}
