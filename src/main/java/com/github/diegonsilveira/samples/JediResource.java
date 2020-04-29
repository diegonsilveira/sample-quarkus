package com.github.diegonsilveira.samples;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jedis")
public class JediResource {

	@Inject EntityManager entityManager;
	
    private final JediRepository repo;

    public JediResource(JediRepository repo) {
        this.repo = repo;
    }
	
	@GET
	@Path("/")
	@Produces(value = MediaType.APPLICATION_JSON)
	public List<Jedi> getJedis() {
		return entityManager.createQuery("select j from Jedi j", Jedi.class).getResultList();
	}
	
	@GET
	@Path("/repo")
	@Produces(value = MediaType.APPLICATION_JSON)
	public List<Jedi> getJedisRepo() {
		return repo.findAll();
	}
	
    @DELETE
    @Path("/repo/{id}")
    public void delete(@PathParam(value = "id") Integer id) {
        repo.deleteById(id);
    }

    @POST
    @Path("/repo/{id}")
    @Produces("application/json")
    public void create(@PathParam(value = "id") Integer id, Jedi body) {
    	Jedi jedi = new Jedi();
    	jedi.setId(id);
    	jedi.setGender(body.getGender());
    	jedi.setName(body.getName());
    	
        repo.save(jedi);
    }
	
}
