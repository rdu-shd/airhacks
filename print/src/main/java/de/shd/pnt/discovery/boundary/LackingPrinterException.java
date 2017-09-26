
package de.shd.pnt.discovery.boundary;

import javax.ejb.ApplicationException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

/**
 *
 * @author airhacks.com
 */
@ApplicationException(rollback = true)
public class LackingPrinterException extends WebApplicationException {

    public LackingPrinterException(String reason) {
        super(Response.status(407).header("shd-reason", reason).build());
    }

}
