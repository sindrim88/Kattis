import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FallingApart {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int number = num.nextInt(); 
	
		int i = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(i<number) {
			list.add(num.nextInt());
			i++;
		}
		i=0;
		int alice = 0;
		int bob = 0;
		int j = 0;
		ArrayList<Integer> sortedList = (ArrayList<Integer>) list.stream().sorted().collect(Collectors.toList());    
		
		
		int temp;
		int temp2;
		int n = sortedList.size()-1;
		
		for(j = 0; j <sortedList.size()/2; j++) {
			
			temp = sortedList.get(j);
			temp2 = sortedList.get(n);
			sortedList.set(n, temp);
			sortedList.set(j, temp2);
			n--;
		}
		
		for(j = sortedList.size()-1; j >= 0; j--) {
			if(j%2 == 0) {
				alice += sortedList.get(j);
			}
			else{
				bob += sortedList.get(j);
			}
		}
		System.out.println();
		System.out.println(alice + " " + bob);
	}
}
