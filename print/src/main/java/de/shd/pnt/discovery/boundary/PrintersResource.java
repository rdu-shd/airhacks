
package de.shd.pnt.discovery.boundary;

import de.shd.pnt.discovery.entity.Printer;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Stateless
@Path("printers")
public class PrintersResource {
    
    @Inject
    PrinterDiscovery discovery;

    @GET
    public JsonArray all() {
        JsonArrayBuilder retVal = Json.createArrayBuilder();
        this.discovery.printers().
                stream().
                map(Printer::toJson).
                forEach(retVal::add);
        return retVal.build();
    }


}
