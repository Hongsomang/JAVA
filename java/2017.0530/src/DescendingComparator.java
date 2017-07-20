import java.util.*;

public class DescendingComparator  implements Comparator<Fruit>{
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		if(o1.price<o2.price)return 1;
		else if(o1.price== o2.price) return 1;
		else return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
