package com.shaice.jersey.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

//@ApplicationPath("/jersey") this is no used
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig(){		
		packages("com.shaice.jersey.resource");
	}
}
