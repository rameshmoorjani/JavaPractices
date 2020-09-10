import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStream {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>  al= new ArrayList<Integer>();
		
		//al.add(0);
		al.add(5);  
		al.add(10);
		al.add(15);
		al.add(25);
		al.add(20);
		a1.add(40);
		a1.add(45);
		a1.add(50);
		a1.add(60);
		  
		
		//al.stream().filter(i->i%2==0).collect(Collectors.toList());
		//			.filter(line -> !"mkyong".equals(line))  
		
		System.out.println(al.stream().filter(j->j%6==0).findFirst().orElse(5));
		
		System.out.println("output"+al.stream().filter(j->j%2==0).collect(Collectors.toList()));
		
		/*for(Integer i:al)
		{
			al.add(i*2);
		}*/
		
		System.out.println(""+al.stream().map(j->j*2).collect(Collectors.toList()));
		
		Stream<Integer> s = al.stream();
		
		s.forEach(System.out::println);
		s.forEach(System.out::println);
		
	}

}
