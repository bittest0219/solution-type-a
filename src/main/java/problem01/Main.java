package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		int count = 0;
		
		String numStr = String.valueOf(number);
		int lenNum = numStr.length();
		
		for(int i = 0; i < lenNum; i++) {
			char check = numStr.charAt(i);
			if(check=='3' || check=='6' || check=='9') {
				count++;
			}
		}
		
		return count;
	}
}















