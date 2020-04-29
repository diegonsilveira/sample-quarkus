package com.github.diegonsilveira.samples;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/security/jedis")
public class SecurityResource {

	@Inject EntityManager entityManager;
	
    private final JediRepository repo;

    public SecurityResource(JediRepository repo) {
        this.repo = repo;
    }

	@GET
	@Path("/repo")
	@Produces(value = MediaType.APPLICATION_JSON)
	public List<Jedi> getJedisRepo() {
		return repo.findAll();
	}
}
