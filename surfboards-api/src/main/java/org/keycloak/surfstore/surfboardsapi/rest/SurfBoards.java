package org.keycloak.surfstore.surfboardsapi.rest;

import org.keycloak.surfstore.surfboardsapi.Persistence;
import org.keycloak.surfstore.surfboardsapi.model.*;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import java.util.*;


@Path("/surfboards")
public class SurfBoards {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Board> list(@Context HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");

        return Persistence.listBoards();
    }
}