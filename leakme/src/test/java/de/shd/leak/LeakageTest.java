/*
 */
package de.shd.leak;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class LeakageTest {

    List<String> messages = new ArrayList<>();

    @Test
    public void leak() throws InterruptedException {
        while (true) {
            messages.add("- " + LocalTime.now());
            Thread.sleep(100);
        }
    }

}
