package com.src;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class SampleListener
 *
 */
public class SampleListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public SampleListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	
    }
	
}
