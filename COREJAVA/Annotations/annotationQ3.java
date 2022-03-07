/**
 * Create a custom annotation called @Execute to be applied on methods. Placing the
@Execute method on a method implies that method should be invoked using Reflection API
(Invoking the method using Reflection API is out of scope of this assignments). The
annotation @Execute should have an optional property “sequence” which can be given
values such as 1, 2, 3… in the order of priority. In case the sequence property is not used the
API may invoke methods in random order.
E.g.
Class MyClass{
@Execute(Sequence=2)
Public void myMethod1(){
}
@Execute(Sequence=1)
Public void myMethod2(){
}
@Execute(Sequence=3)
Public void myMethod3(){
}
}
Note: The above annotation tells the system that the invocation should be in the order:
myMethod2 first, followed by myMethod1 and finally myMethod3 
 */



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface  Execute{
	int Sequence() default 12;
}

class MyClass{
	@Execute(Sequence=2)
	public void myMethod1(){
		
	}
	@Execute(Sequence=1)
	public void myMethod2(){
		
	}
	@Execute(Sequence=3)
	public void myMethod3(){
		
	}
}
public class annotationQ3 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		MyClass objClass =new MyClass();
		Class<? extends MyClass> c =objClass.getClass();
		Method method=c.getMethod("myMethod3");
		Execute annotation = method.getAnnotation(Execute.class);
		System.out.println(((Execute) annotation).Sequence()); 

	}

}