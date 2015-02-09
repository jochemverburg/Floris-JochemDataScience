package dataScience;

import java.util.*;
import java.util.regex.*;

public class regEx {
	
	public static void main(String[] args) {
		//ArrayList<String> lines = readFile("");
		String patternHashtag="#[^\\s]*";
		String patternUsername="@[^\\s]*";
		
		matchTweets(patternHashtag);
		matchTweets(patternUsername);
	}
	
	public static void matchTweets(String pattern){
		String text="@FakeUsername : The Da@y Af#ter in #FakeHashtag  #FakeHashtag (Broadway & 4th Street) http://Fakeurl.(via @FakeUsername) ''";
		Matcher matcher = Pattern.compile( pattern ).matcher( text );
		while ( matcher.find( ) )
		System.out.println(
		"Matched: '"+matcher.group( )+"' at position "+matcher.start( ) );		
	}

}
