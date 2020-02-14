package hello;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;

public class Main {

    public static void main(String[] args) {
        Config config = ConfigProvider.getConfig();
        // workaround for Quarkus ≥ 1.1.0:
        // Config config = ConfigProvider.getConfig(Thread.currentThread().getContextClassLoader().getParent());
        String value = config.getValue("java.home", String.class);
        System.out.println(value);
    }

}
