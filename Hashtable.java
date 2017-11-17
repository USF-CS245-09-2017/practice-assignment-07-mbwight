public class Hashtable{
	private HashNode[] arr = new HashNode[314753];
	private int elements;
	
	//goes to designated hashed position in array, increments through that linked list, then returns key if there
	public String get(String key){
		int pos = Math.abs(key.hashCode()) % arr.length;
		HashNode temp = arr[pos];
		while(temp!= null){
			if(temp.getKey().equals(key)){
				return temp.getValue();
				}
			temp = temp.getNext();
			
		}
		return null;
	}
	
	public void put(String key, String value){
		HashNode node = new HashNode(key,value);
		int pos = Math.abs(key.hashCode()) % arr.length;
		HashNode temp = arr[pos];
		//case for head
		if(temp == null)
			arr[pos] = node;
		//
		else{
			while(temp.getNext() != null){
				if(temp.getKey().equals(key)){
					temp.setValue(value);
				}
				else{
						temp = temp.getNext();
					}
				
				
			}
			temp.setNext(node);
		}
		elements++;
	}
	
	public String remove(String key){
		int pos = Math.abs(key.hashCode()) % arr.length;
		HashNode temp = arr[pos];
		String result = null;
			if(temp.getKey().equals(key)){
				result = temp.getValue();
				arr[pos] = temp.getNext();
				return result;
				
			}
			while(temp.getNext() != null){
				if(temp.getNext().getKey().equals(key)){
					result = temp.getNext().getValue();
					temp.setNext(temp.getNext().getNext());
					}
				}
			if(result == null){
				throw new NullPointerException("Could not find key");
			}
			return result;
		}
		
	
	
	public boolean containsKey(String key){
		int pos = Math.abs(key.hashCode()) % arr.length;
		HashNode temp = arr[pos];
		while(temp != null){
			if(temp.getNext().getKey().equals(key)){
				return true;
				}
			temp = temp.getNext();
		}
		return false;
	}
		
}