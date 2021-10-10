package fr.pantheonsorbonne.ufr27.miage.web;

import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import fr.pantheonsorbonne.ufr27.miage.service.Service;
import fr.pantheonsorbonne.ufr27.miage.service.ServiceImplCached;

@Path("primes")
public class PrimeResource {

	@Inject
	ServiceImplCached service;

	@Path("{primeLimit}")
	@GET
	public Response GetPrime(@PathParam("primeLimit") long primeLimit) {
		long res = service.compute(primeLimit);
		return Response.ok("response = " + res).build();

	}

}
