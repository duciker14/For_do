package duc.dev.fordo;

public class MainAppInSoChiaHetChoBa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int n;
		int tempMod = 0;
		int tempDiv = 0;
		int sum  = 0;
		
		for(int i = 100; i < 1000 ; i++) {
			tempDiv = i;
			sum = 0;
			
			
			while(tempDiv > 0 ) {
				
			    tempMod = tempDiv%10;
			    tempDiv = tempDiv/10;
			    sum +=tempMod;
			}
			
		if(sum%3 == 0) {
			System.out.print(String.format("%d\t",i));
		}
			
		}

	}
}
