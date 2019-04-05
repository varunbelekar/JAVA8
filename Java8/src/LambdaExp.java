import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.varun.interfaces.Demo;

interface Sayable{
	public String say(String name);
}


public class LambdaExp  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s1=(name)->{
			return "Hello "+name;
		};
		
		System.out.println(s1.say("varun"));
		
		List<Integer> l=new ArrayList();
		l.add(6);
		l.add(9);
		l.add(4);
		
		//Sorting Collections Using Lambda Expressions
		Collections.sort(l,(a1,a2)->{
			if(a1<a2){
				return -1;
			}
			else{
				return 1;
			}
		});
		
		for(int i:l){
			System.out.println(i);
		}
		
	}

}
