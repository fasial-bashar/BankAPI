/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapi.project;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Fasial
 */

@Path("project")
@Produces("application/json")
public class AccountsService {
    public static final String name = "Bank";
    @GET
    @Path("/")
    @Produces("application/json")
    public Response test(@Context UriInfo info){
        List <String> list = new ArrayList<>();
        String text = "Working!!!!";
        list.add(name);
        list.add(text);
        Gson gson = new Gson();
        return Response.status(200).entity(gson.toJson(list)).build();
    }
}
