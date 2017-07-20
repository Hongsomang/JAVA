
public class Until {
	public static <K,V> boolean compare(pair<K,V>p1, pair<K,V>p2 ){
		boolean keycompare=p1.getkey().equals(p2.getkey());
		boolean valuecompare=p1.getvalue().equals(p2.getvalue());
		return keycompare&&valuecompare;
	}
}
