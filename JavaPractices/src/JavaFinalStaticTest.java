import java.util.ArrayList;
import java.util.List;

public class JavaFinalStaticTest {
	
	private static final List foo=new ArrayList();
	
	private static final List foo1=new ArrayList();
	
	public JavaFinalStaticTest()
	{
	//	foo= new ArrayList();  
		
	//	foo.add("Geeta");
	}
	
	public static void main(String[] args) {
		
		JavaFinalStaticTest finalStaticTest = new JavaFinalStaticTest();
		
		finalStaticTest.foo.add("Ramesh");
		
		foo=foo1;
		
		System.out.println("list is "+finalStaticTest.foo);
		
		finalStaticTest.foo.add("Geeta");
		
		
		
		System.out.println("list is "+finalStaticTest.foo);
	}
	

}
