package org.shipstone.sandbox.swarm.ws.rs;

import org.shipstone.sandbox.swarm.model.Person;
import org.shipstone.sandbox.swarm.ws.rs.util.Pingable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by francois on 29/10/15.
 */
@Path("person")
public class PersonEndpoint implements Pingable {

    @GET
    @Produces("application/json")
    public Person getPerson() {
        return new Person("John", "Doe");
    }

}
