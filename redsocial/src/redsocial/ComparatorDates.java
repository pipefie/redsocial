package redsocial;

import java.util.Comparator;

public class ComparatorDates implements Comparator<Like>{

	@Override
	public int compare(Like o1, Like o2) {
		
		if (o1.getFechaLike().after(o2.getFechaLike())) {
			return 1;
		}
		else if (o1.getFechaLike().equals(o2.getFechaLike())) {
			return 0;
		}
		else 
			return -1;
		
		
	}
	

}
