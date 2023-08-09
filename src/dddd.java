
public class dddd {

	public static void main(String[] args) {
  boolean isleap = (2023%4==0 && 2023!=100)||(2023%400==0);
		
		int[] lastDayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(isleap) {
			lastDayOfMonth[1]=29; //윤년일 경우 배열의 인덱스[1]값을 바꿈. 
		}
		
		
	
	    //1년 부터 입력년도 -1까지 총 일 수 계산 
		int leapYear = 0, commonYear = 0, amountOfDay =0;
		int i;
		for( i =1; i <= 2023-1; i++) { 
	     boolean isleap2 = (i%4==0 && i!=100)||(i%400 ==0);
		
		if(isleap2) 
			leapYear += 366;
		else 
		   commonYear += 365;
		}
		
		amountOfDay =leapYear+commonYear;
		System.out.println(amountOfDay);

		
		for(int k=0;k<=2-1;k++) {
		 System.out.println(lastDayOfMonth[k]);
		 
		 amountOfDay +=lastDayOfMonth[k];
		}
		
		System.out.println(amountOfDay);
		System.out.println((amountOfDay+1)%7);


}
}
