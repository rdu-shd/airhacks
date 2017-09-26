
package de.shd.pnt.discovery.boundary;

import de.shd.pnt.discovery.entity.Printer;
import java.util.Arrays;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author airhacks.com
 */
@Stateless
public class PrinterDiscovery {

    public List<Printer> printers() {
        return Arrays.asList(new Printer("hp"), new Printer("epson"));
    }

}
