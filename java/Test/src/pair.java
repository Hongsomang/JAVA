
public class pair<K,V> {
	K key;
	V value;
	public pair(K key, V value){
		this.key=key;
		this.value=value;
	}
	public void setkey(K key){
		this.key=key;
	}
	public void setvalue(V value){
		this.value=value;
	}
	public K getkey(){
		return key;
	}
	public V getvalue(){
		return value;
	}

}
