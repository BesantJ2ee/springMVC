package com.MovieService;

import org.springframework.stereotype.Service;

@Service
public class AddLogic {
	
	public int verification(String a,String b,String c,String d){
		
		Integer x=a.length();
		Integer y=b.length();
		Integer z=c.length();
		Integer w=d.length();
		
		
		int k=x+y+z+w;
		
		return k;
		
	}

}
