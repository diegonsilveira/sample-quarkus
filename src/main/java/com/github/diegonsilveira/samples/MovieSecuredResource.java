package com.github.diegonsilveira.samples;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import org.eclipse.microprofile.jwt.JsonWebToken;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.diegonsilveira.samples.entity.Movie;
import com.github.diegonsilveira.samples.entity.MovieRepository;

@Path("/secured")
@RequestScoped
public class MovieSecuredResource {
	
	@Autowired
	MovieRepository repo;

    @Context
    ResourceContext resourceContext;

    @Inject
    JsonWebToken jwt;

    @GET()
    @RolesAllowed({ "Subscriber" })
    @Produces(MediaType.TEXT_PLAIN)
    public List<Movie> moviePrivate(@Context SecurityContext ctx) {
    	return repo.findAll();
    }
}
