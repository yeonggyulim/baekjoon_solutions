import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int in;
		while(n-- >0){
			in = sc.nextInt();
			if(in<min)
				min = in;
			if(in>max)
				max = in;
		}
		System.out.println(min + " " + max);
	}
}
