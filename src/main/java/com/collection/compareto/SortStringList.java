package com.collection.compareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

class MyComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

public class SortStringList {
	private static final Logger log = Logger.getLogger(SortStringList.class);
	
	public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("D");
			list.add("A");
			list.add("Z");
			list.add("A");
			list.add("C");
			
			Collections.sort(list, new MyComparator());
			log.info(list);
	}

}
