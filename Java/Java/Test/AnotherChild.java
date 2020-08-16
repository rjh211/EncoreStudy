package Test;

import java.time.Duration;
import java.time.LocalDateTime;

class AChild extends p0420.Inherience{
	
}
public class AnotherChild {
	public static void main(String[] args){
		Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(1));
	
		System.out.println(duration.getSeconds()/60);
	}
}
