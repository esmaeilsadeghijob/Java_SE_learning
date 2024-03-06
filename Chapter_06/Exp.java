import java.util.Scanner;

public class Exp{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter first day of the year: ");
		int day = input.nextInt();

		System.out.print("Enter month: ");
		int month = input.nextInt();
		
		String header;
		System.out.println();
		for(int month = 1; month <=12; month++){
			header = "";
			switch(month){
				case 1: header += "January"; break;
				case 2: header += "February"; break;
				case 3: header += "March"; break;
				case 4: header += "April"; break;
				case 5: header += "May"; break;
				case 6: header += "June"; break;
				case 7: header += "July"; break;
				case 8: header += "August"; break;
				case 9: header += "September"; break;
				case 10: header += "October"; break;
				case 11: header += "November"; break;
				case 12: header += "December"; break;
			}
			
			header += year + "";
			
			for(int b = 0; b < 23 - (header.length() / 2); b++){
				System.out.print(" ");
			}
			
			System.out.println(header + "\n-----------------------------\n" +
			" Sun	Mon   Tue   Wed  Thu   Fri   Sat");
			
			day %= 7;
			for(int b = 0; b <= day * 7; b++){
				System.out.print(" ");
			}
			
			int lastDay = 0;
			if(month == 1 || month == 3 || month == 5 || month == 7 || month ==8 || month == 10 || month == 12)
				lastDay += 31; // lastDay = lastDay + 31
			else if(month == 4 || month == 6 || month == 9 || month == 11 )
				lastDay += 30;
			else { 
					if(((year % 4 == 0) && (year % 100 != 0 )) || (year % 400 == 0))
						lastDay += 29;
					else
						 lastDay += 28;
			
			}
			
			
			for(int d = 1; d <= lastDay; d++){
				if(d < 10)
					System.out.print(" ");
				if(day % 7 == 6)
					System.out.print( d +"\n ");
				else{
					System.out.print( d +"    ");
					if(d == lastDay)
						System.out.println();
				}
				day++;
			}
			System.out.println();
			
		}
	}
	
	
}