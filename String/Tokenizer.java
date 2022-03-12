package String;

import java.util.*;
public class Tokenizer {

	public static void main(String[] args) {
  StringTokenizer ts=new StringTokenizer("This is strings");
  while(ts.hasMoreTokens())
  {
  System.out.println(ts.nextToken());
	}	
  }
}

