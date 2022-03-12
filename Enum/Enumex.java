package Enum;

public class Enumex {
	enum Season 
	{WINTER(10),SUMMER(20),FALL(30);
	private int value;
	private Season(int value) {
	this.value=value;
	}
	}
	public static void main(String[] args) {
    for(Season s:Season.values()) 
    	System.out.println(s+" "+s.value);

	}
}
