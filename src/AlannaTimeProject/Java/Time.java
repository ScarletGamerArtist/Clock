package AlannaTimeProject.Java;
/*
 * Alanna Botscharow
 * 9/18
 * Time project
 */
public class Time {
	public static void main(String[] args) {
		//1. Obtain Milliseconds since Midnight, January 1, 1970. 
			//System.currentTimeMillis()
		
		while(true) {
		
				long totalMilliseconds = System.currentTimeMillis(); 
		
		//2. obtain total seconds. 
			//TotalSeconds = totalMilliseconds / 1000.
		
				long totalSeconds = totalMilliseconds / 1000; 
		
		//3. Compute the current second from total seconds. 
			//Total seconds % 60 = currentSecond. 
		
				long currentSecond = totalSeconds % 60; 
		
		//4. Obtain total minutes. 
			//totalMinutes = totalSeconds / 60. 
		
				long totalMinutes = totalSeconds / 60; 
		
		//5. Compute the current minute from totalMinutes. 
			// TotalMinutes % 60 = current minute. 
				
				long currentMinute = totalMinutes % 60; 
		
		//6. Obtain the total hours.
			//TotalHours = totalMinutes / 60. 
				
				long totalHours = totalMinutes / 60; 
		
		//7. Compute the current hour. 
			// TotalHours % 24 = currentHour.
				
				long currentHour = totalHours % 24; 
				
				long ourCurrentHour = currentHour - 6;
				try{
				    Thread.sleep(1000);
				   }catch(InterruptedException e){
				   }
				  System.out.flush();
				System.out.println(ourCurrentHour+":"+currentMinute+":"+currentSecond);
			
		
		
		
		
		
		
		
		
		}	
}
}