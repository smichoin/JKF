package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSort {
	public static ArrayList sortMap(Map map)
	{
		ArrayList outputList = null;
		int count = 0;
		Set set = null;
		Map.Entry[] entries = null;
		set = (Set) map.entrySet();
		Iterator iterator = set.iterator();
		entries = new Map.Entry[set.size()];
		while(iterator.hasNext()) {
		entries[count++] = (Map.Entry) iterator.next();
		}

		// Sort the entries with your own comparator for the values:
		Arrays.sort(entries, new Comparator() {
		public int compareTo(Object lhs, Object rhs) {
		Map.Entry le = (Map.Entry)lhs;
		Map.Entry re = (Map.Entry)rhs;
		return ((Comparable)le.getValue()).compareTo((Comparable)re.getValue());
		}

		public int compare(Object lhs, Object rhs) {
		Map.Entry le = (Map.Entry)lhs;
		Map.Entry re = (Map.Entry)rhs;
		return ((Comparable)le.getValue()).compareTo((Comparable)re.getValue());
		}
		});
		outputList = new ArrayList();
		for(int i = 0; i < entries.length; i++) {
		outputList.add(entries[i]);
		}
		return outputList;
		}
}
