import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
public class PlantingTrees {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int trees = num.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		int time = 2;
		
		for(int i = 0; i< trees; i++) {
			list.add(num.nextInt());
		}
		
		list = (ArrayList<Integer>) list.stream().sorted().collect(Collectors.toList());    
		
		int temp;
		int temp2;
		int n = list.size()-1;
		for(int j = 0; j <list.size()/2; j++) {
			temp = list.get(j);
			temp2 = list.get(n);
			list.set(n, temp);
			list.set(j, temp2);
			n--;
		}
		//System.out.println(list);
		num.close();
		
		for(int i = 0; i< trees; i++) {
			if(list.get(i)+i +2 > time) {
				//time = list.get(i) + i +1;
				time = (list.get(i) + i +2);
			}
		}
		System.out.println(time);
	}
}
