import java.util.*;

public class Server {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		//ArrayList<Integer> list = new ArrayList<Integer>();

		int arr[] = new int[number];
		int T = num.nextInt();
		for(int i = 0; i< number; i++) {
			int n = num.nextInt();
			arr[i] = n; 
		}
		
		int sum = 0;
		int count = 0;
		boolean breakLoop = false;
		
		int j = 0;
		for(int i = 0; i< number; i++) {
			T -= arr[i];
			if(T>=0) {
				count++;
			}
		}
		System.out.print(count);
		num.close();
	}
}
