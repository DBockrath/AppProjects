import java.util.*;

public class Ship {
	
	private ArrayList<String> location = new ArrayList<String>();
	private String name;
	private int size;
	
	public Ship(String name, int size) {
		
		this.name = name;
		this.size = size;
		
	}
	
	public ArrayList<String> getLocations() {
		
		return location;
		
	}
	
	public int getSize() {
		
		return size;
		
	}
	
	public void setLocation(ArrayList<String> locationToSet) {
		
		this.location.addAll(locationToSet);
		
	}
	
	public String check(String guess) {
		
		String result = "Miss";
		
		if (location.contains(guess)) {
			
			location.remove(guess);
			
			result = location.isEmpty() ? "Kill" : "Hit";
			
		}
		
		return result;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
}
