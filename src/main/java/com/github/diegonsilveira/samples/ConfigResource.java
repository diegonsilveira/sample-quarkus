package com.github.diegonsilveira.samples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/config")
public class ConfigResource {
	
    @ConfigProperty(name = "configs.prop")
    String prop;

	@GET
	@Produces(value = MediaType.TEXT_PLAIN)
	public String getConfig() {
		return "Propriedade: " + prop;
	}
}
