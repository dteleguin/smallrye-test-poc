package hello;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.junit.Test;

public class MainTest {

    public MainTest() {
    }

     @Test
     public void hello() {
         Config config = ConfigProvider.getConfig();
         // workaround for Quarkus ≥ 1.1.0:
         // Config config = ConfigProvider.getConfig(this.getClass().getClassLoader().getParent());
         String value = config.getValue("java.home", String.class);
         System.out.println(value);
     }

}
