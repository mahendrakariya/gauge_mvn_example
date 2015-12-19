import com.thoughtworks.gauge.Step;

import java.io.IOException;
import java.util.Properties;

public class StepImplementation {

    @Step("Say <greeting> to <product name>")
    public void helloWorld(String greeting, String name) throws IOException {
        Properties properties = new Properties();
        properties.load(this.getClass().getResourceAsStream("myprop.properties"));
        System.out.println(properties.getProperty("myproperty"));

        System.out.println(greeting + ", " + name);
    }
}