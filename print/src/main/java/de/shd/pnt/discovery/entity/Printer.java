
package de.shd.pnt.discovery.entity;

import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author airhacks.com
 */
public class Printer {

    private String name;

    public Printer(String name) {
        this.name = name;
    }


    public JsonObject toJson() {
        return Json.createObjectBuilder().
                add("name", this.name).
                build();
    }

}
