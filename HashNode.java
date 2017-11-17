public class HashNode{
	private String key, value;
	private HashNode next, previous;
	
	public HashNode(String key, String value){
		this.key = key;
		this.value = value;
	}
	
	public String getKey(){
		return key;
	}
	
	public void setkey(String key){
		this.key = key;
	}
	
	public String getValue(){
		return value;
	}
	
	public void setValue(String value){
		this.value = value;
	}
	
	public HashNode getNext(){
		return next;
	}
	
	public void setNext(HashNode newNext){
		next = newNext;
	}
	
	public HashNode getPrevious(){
		return previous;
	}
	
	public void setPrevious(HashNode newPrevious){
		previous = newPrevious;
	}
}