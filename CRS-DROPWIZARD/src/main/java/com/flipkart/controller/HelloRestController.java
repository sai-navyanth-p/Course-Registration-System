/** * 
 */
package com.flipkart.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author lenovo
 *
 */
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloRestController {
	
	 @GET
	    public String getEmployees() {
	        return "my dropwizard service";
	    }

}