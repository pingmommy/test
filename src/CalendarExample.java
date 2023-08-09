
import java.util.Scanner;

/*
 * 작성자 : 조아라  
 * 작성일 : 2023/08/10
 * 교과목 : 프로그래밍응용
 */



public class CalendarExample {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int year =0, month= 0;
		
		while(true) {
			System.out.println();
			System.out.println();
			System.out.print("year>>");
			year = scan.nextInt();
			if(year < 1) {
				System.out.println("년도는 AC(서기)입니다.");
				break;
			}
			System.out.print("month>>");
			month = scan.nextInt();
			if(month > 12) {
				System.out.println("월은 1월에서 12월까지 있습니다.");
				break;
			}
			 
			printMonth(year,month);
		}
		
		System.out.println("Program End...");
	}

	
	static void printMonth(int year, int month) {
		
	
		//윤년평년 계산하는 식
		boolean isleap =(year%4==0 && year!=100)||(year%400==0);
		
		int[] lastDayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(isleap) {
			lastDayOfMonth[1]=29; //윤년일 경우 배열의 인덱스[1]값을 바꿈. 
		}
		
		
	
	    //1년 부터 입력년도 -1까지 총 일 수 계산 
		int leapYear = 0, commonYear = 0, amountOfDay =0;
		
	   for( int i =1; i <= year-1; i++) { 
	     boolean isleap2 = (i%4==0 && i!=100)||(i%400 ==0);
		
		if(isleap2) 
			leapYear += 366;
		else 
		   commonYear += 365;
		}
		
	
		amountOfDay=leapYear+commonYear;
		
		
		
		
		
		
		
		for(int k=0;k<month-1;k++) {
			
			if((year%4==0 && year!=100)||(year%400==0)==true) {
				lastDayOfMonth[1]=29;
			}
			amountOfDay +=lastDayOfMonth[k];
		//	System.out.println(lastDayOfMonth[k]);
		}
		
		

		amountOfDay++;
		
		// 1년 1월 1일은 월요일 (요일의 배열인덱스[1])
				int week = (amountOfDay%7);
				System.out.println(week);
		
		//년 월 출력
		System.out.printf("\t\t  %d년 %d월",year,month);
		System.out.println();
		System.out.println();
		
       String[] arrWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		for(String w:arrWeek)
			{
				System.out.print(w+"\t");
			}
		System.out.println();
	
		
	

		for(int i=1;i<=lastDayOfMonth[month-1];i++) {
		 
			if(i==1) {
				for(int j =0; j<week;j++) {
					
					System.out.print("\t");
				}
			}
				System.out.printf("%2d\t",i);
				week++;
				if(week>6)
				{
					week=0;
					System.out.println();
				}
				
			
		}
		
	}
}
