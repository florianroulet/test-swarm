package org.shipstone.sandbox.swarm;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

/**
 * Created by francois on 29/10/15.
 */
public class PersonServer {

    public static void main(String[] args) {
        System.out.println("go !!!");
        try {
            Container container = new Container();
            JAXRSArchive jaxrsArchive = ShrinkWrap.create(JAXRSArchive.class);
            jaxrsArchive.addPackages(true, PersonServer.class.getPackage());
            jaxrsArchive.addAllDependencies();
            container.start().deploy(jaxrsArchive);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
