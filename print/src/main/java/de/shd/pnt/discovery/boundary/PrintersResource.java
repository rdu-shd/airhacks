
package de.shd.pnt.discovery.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("printers")
public class PrintersResource {

    @GET
    public String all() {
        return "hp, host,micro";
    }


}
