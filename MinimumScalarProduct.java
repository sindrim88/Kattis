import java.util.ArrayList;
import java.util.Scanner;

//Problem Kattis
public class MinimumScalarProduct {
//////////
///////// KLÁRAÐ
/////////
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		ArrayList<Long> list1 = new ArrayList<Long>();
		ArrayList<ArrayList<Long>> list2 = new ArrayList<ArrayList<Long>>();
		
		long cases = num.nextInt();
		
		long columns = 0;
		for(long i = 0; i< cases*2; i++) {
			if(i%2 == 0) {
				columns = num.nextLong();
			}
			for(long j = 0; j< columns; j++) {
				list1.add(num.nextLong());
			}
			list2.add(new ArrayList<Long>(list1));
			list1.clear();
		}
		num.close();
		
		//Sort both arrays
		for(int i = 0; i< list2.size(); i++) {
			list2.get(i).sort(null);
		}
		
		long temp;
		long temp2;
		
		//swap every other array
		for(int i = 0; i< list2.size(); i++) {
			int n = list2.get(i).size()-1;
			
			for(int j = 0; j < n; j++) {
				if(i%2 == 0) {
					temp = list2.get(i).get(j);
					temp2 = list2.get(i).get(n);
					list2.get(i).set(n, temp);
					list2.get(i).set(j, temp2);
					n--;
				}
			}
		}
		long sum = 0;
		int caseNum = 1;
		for(int i = 0; i <list2.size()-1; i++) {
			sum = 0;
			if(i%2 == 0) {
				for(int j = 0; j <list2.get(i).size(); j++) {
					sum += (list2.get(i).get(j) * list2.get(i+1).get(j));
				}
				System.out.println("Case #"+ (caseNum) +": " + sum);
				caseNum++;
			}	
		}
	}
}
