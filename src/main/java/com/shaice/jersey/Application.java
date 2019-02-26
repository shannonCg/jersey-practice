package com.shaice.jersey;

import java.net.MalformedURLException;
import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.shaice.jersey.config.JerseyConfig;

public class Application {

	public static void main(String[] args){
		String protocol = "http";
		String host = "localhost";
		int port = 8090;
		
		URI baseUri = UriBuilder.fromPath("")
								.scheme(protocol)
								.host(host)
								.port(port)
								.build();
		try {
			System.out.println(baseUri.toURL().toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		ResourceConfig config = new JerseyConfig();
		
		JettyHttpContainerFactory.createServer(baseUri, config);
	}
}
