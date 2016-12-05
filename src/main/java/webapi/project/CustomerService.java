/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapi.project;

import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import webapi.project.bank.Customer;
import webapi.project.resource.CustomerResource;

/**
 *
 * @author Fasial
 */
@Path("customers")
@Produces("application/json")
public class CustomerService {

 @GET
 @Path("/")
 @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
 public List<Customer>customers(){
     CustomerResource customerResource = new CustomerResource();
     List<Customer>customers = customerResource.getCustomer();
     return customers;
 }
}