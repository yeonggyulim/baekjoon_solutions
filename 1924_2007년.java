import java.util.Scanner;

public class Main{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int totalDiffDays = 0;
		for(int i=0; i<month-1; i++) {
			totalDiffDays+=days[i];
		}
		totalDiffDays += day - 1;
		
		
		switch(totalDiffDays % 7) {
		case 0:
			System.out.println("MON");
			break;
		case 1:
			System.out.println("TUE");
			break;
		case 2:
			System.out.println("WED");
			break;
		case 3:
			System.out.println("THU");
			break;
		case 4:
			System.out.println("FRI");
			break;
		case 5:
			System.out.println("SAT");
			break;
		case 6:
			System.out.println("SUN");
			break;
		default:
			System.out.println("ERR");
			
		}
	}
}
