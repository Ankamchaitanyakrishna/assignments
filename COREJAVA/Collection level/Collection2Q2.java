/**
 * 2)	Write an application to store 10 unique product objects. In case there is an attempt to add a duplicate product, it should be silently rejected. Hint: Use HasSet or TreeSet
Extra(optional): Use ArrayList in the above solution. (This is optional)
 */

import java.util.HashSet;
import java.util.Set;

public class Collection2Q2 {

	public static void main(String[] args) {
				
		Set<Integer> number= new HashSet<>();
		number.add(110);
		number.add(112);
		number.add(113);
		number.add(114);
		number.add(115);
		number.add(116);
		number.add(117);
		number.add(118);
		number.add(119);
		
		System.out.println(number);
		
		number.add(1104);
		
		System.out.println(number);

	}

}