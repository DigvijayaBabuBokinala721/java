package com.digvijay.fi;

import com.digvijay.Example;

@FunctionalInterface
public interface I1<T extends Example> {
	
	//will be converted to public method
	String m(T t);
	
}
