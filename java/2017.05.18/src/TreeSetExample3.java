import java.util.*;

public class TreeSetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> scores= new TreeSet<String>();
		scores.add("apple");
		scores.add("forever");
		scores.add("description");
		scores.add("description");
		scores.add("ever");
		scores.add("zoo");
		scores.add("base");
		scores.add("guess");
		scores.add("cherry");
		//scores.add("c");
		
		System.out.println("[c~f 사이의 단어 검색");
		NavigableSet<String> rangeSet=scores.subSet("c", false, "fz", true);
		for(String word :rangeSet){
			System.out.println(word);
		}
		
	}

}
