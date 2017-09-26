
package de.shd.pnt.discovery.entity;

import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author airhacks.com
 */
public class Printer {

    private String modelName;

    public Printer(String name) {
        this.modelName = name;
    }


    public JsonObject toJson() {
        return Json.createObjectBuilder().
                add("name", this.modelName).
                build();
    }

}
