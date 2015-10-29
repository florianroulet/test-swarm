package org.shipstone.sandbox.swarm.ws.rs.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by francois on 29/10/15.
 */
public interface Pingable {

    @GET @Path("ping")
    default Response pingMe(){
        return Response.noContent().build();
    }
}
