package com.shaice.jersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestResource {

	@GET
	public String getMethod(){
		return "This is Get method";
	}
}
