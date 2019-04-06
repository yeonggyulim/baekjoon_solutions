import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//minCost[0]은 안씀
		int minCost[] = new int[num+1];
		minCost[1]=0;
		for(int i=2; i<=num; i++) {
			minCost[i]=minCost[i-1]+1;
			
			if(i%2==0 && minCost[i] > minCost[i/2]+1)
				minCost[i] = minCost[i/2] + 1;
			if(i%3==0 && minCost[i] > minCost[i/3]+1)
				minCost[i] = minCost[i/3] + 1;
		}
		System.out.println(minCost[num]);
	}
}
