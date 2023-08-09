import java.util.Timer;
import java.util.TimerTask;

public class VT100 {
	
	static class A extends TimerTask{

		@Override
		public void run() {
			System.out.println(Math.random()*20);
			
		}
		
	}
	

	public static void main(String[] args) {

//		
//		int line;
//		int column;
//		int fg;
//		int bg;
//		char ch;
//	
		int line =(int)(Math.random()*20);
//		
		System.out.println(line);
//		
//		int a;
//
//		for(int i =0; i<=9;i++) {
//			
//			
//			System.out.println("=======i=========="+i);
//			
//			for(int j = 1; j<=20;j++) {
//				System.out.println("j="+j);
//				System.out.println(((double)i/10)*j);
//			}
//		}
		
		//double c =(double) 9/10;
	
		//System.out.println(c);
		
		
		
		
		
		Timer t= new Timer();
		
		t.schedule(new A(), 0, 1000);
		
		
	}

}
