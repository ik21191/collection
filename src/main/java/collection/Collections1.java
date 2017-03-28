package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Collections1 {
public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		//list  = (List<String>) Collections.synchronizedCollection(list);//throw java.lang.ClassCastException
		Collection<String> collection  = Collections.synchronizedCollection(list);//Will not throw java.lang.ClassCastException
		System.out.println(collection);
		list  = (List<String>) Collections.synchronizedList(list);
		Collections.synchronizedCollection(set);
		System.out.println(list.get(0));
	}

}