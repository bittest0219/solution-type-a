package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random r = new Random();
		
		int correctNum = r.nextInt(900)+100;
//		int correctNum = 783;	
		int count = 0;
		int input = 0;
		
		Scanner sc = new Scanner(System.in);
		long start = System.currentTimeMillis();
		while(true) {
			count++;
			int S = 0;
			int B = 0;
			int O = 0;
			
			if(input==correctNum) {
				break;
			}
			
			System.out.print("> ");
			input = sc.nextInt();
			
			String a = String.valueOf(correctNum);
			String b = String.valueOf(input);
			
			for(int i = 0; i < b.length(); i++) {
				for(int j = 0; j < a.length(); j++) {
					// b.charAt(i) -> input num,  a.charAt(j) -> correct num
					if(b.charAt(i) == a.charAt(j)) {
						if(i==j) {
							S++;
							break;
						}else{
							B++;
							break;
						}
					}else if(j==2) {
						O++;
						break;
					}
				}
			}
			if(S==3) {
				System.out.println(count + " - S:" + S + ", B:" + B + ", O:" + O);		
				System.out.println("(종료)");
			}else {
				System.out.println(count+" - S:" + S + ", B:" + B + ", O:" + O);
			}
		}
		sc.close();
		long end = System.currentTimeMillis();
		System.out.println("도전횟수: " + (count-1) + ", 게임시간:" + (end-start)/1000.0 );
				

	}
}










