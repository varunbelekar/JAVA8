import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {
	
	public static String show(String name){
		return "show "+name;
	}
	
	public static int addList(List<Integer> list){
		return list.stream()
				.mapToInt(Integer::intValue)
				.sum();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String> f=FunctionInterface::show;
		System.out.println(f.apply("varun"));
		
		List<Integer> l=new ArrayList();
		l.add(5);
		l.add(10);
		l.add(15);
		
		Function<List<Integer>,Integer> fun=FunctionInterface::addList;
		System.out.println(fun.apply(l));
		
	}

}
