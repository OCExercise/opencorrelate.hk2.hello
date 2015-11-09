package org.opencorrelate.exercise.hk2.helloworld;

import javax.inject.Inject;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;

/**
 * Hello world!
 *
 */
public class App 
{
	
	@Inject
	HelloWorld service;
	
	
	public void run() {
		service.hello("Hello World!");
	}
    public static void main( String[] args )
    {
    	
    	ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();
    	
    	App app = new App();
    	
    	app.run();
    	
    }
}
