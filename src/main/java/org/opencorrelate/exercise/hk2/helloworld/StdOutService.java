package org.opencorrelate.exercise.hk2.helloworld;

import org.jvnet.hk2.annotations.Service;

@Service
public class StdOutService implements HelloWorld {

	@Override
	public void hello(String message) {
		System.out.println(message);
		
	}
	
	

}
