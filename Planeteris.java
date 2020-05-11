import java.util.Arrays;
import java.util.Scanner;

public class Planeteris {

	public static void main(String[] args) {
	
		Scanner num = new Scanner(System.in);
		int solarSystems = num.nextInt();
		
		int sumShips = num.nextInt();

		int ships[] = new int[solarSystems];
		
		
		for(int i = 0; i< solarSystems; i++) {
			ships[i] = num.nextInt();
		}
		Arrays.sort(ships);
		int wins = 0;
		
		for(int i = 0; i< ships.length; i++) {
			if(sumShips > ships[i]) {
				sumShips -=	(ships[i] + 1);	
				wins++;
			}
		}

		System.out.println(wins);
		
		num.close();
	}

}
