import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Properties;

/**
 * Файлы настроек
 */
public class PropertiesTest extends Assert {
    @Test
    public void testShowSystemProperties() {
        System.out.println("Все системные свойства:");
        Properties properties = System.getProperties();
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            System.out.println(" " + entry.getKey() + " = " + entry.getValue());
        }
    }

    @Test
    public void testNonExistingProperty() {
        // Получение несуществующего свойства возврщает NULL
        assertNull(System.getProperty("NOT-EXISTING-PROPERTY"));
        String value = System.getProperty("NOT-EXISTING-PROPERTY");
        if (value != null && !value.isEmpty()) {
            fail("Нет такого свойства :)");
        }
    }

    /**
     * Свойства из файла настроек
     *
     * @throws IOException
     */
    @Test
    public void testLoadConfigProperties() throws IOException {
        String filename = "config.properties";
        InputStream input = getClass().getClassLoader().getResourceAsStream(filename);
        if (input == null) {
            throw new IllegalArgumentException("Не могу загрузить файл \"" + filename + "\"");
        }
        Properties p = new Properties();
        p.load(new InputStreamReader(input, "UTF-8"));
        System.out.println("Список свойств:");
        for (String name : p.stringPropertyNames()) {
            System.out.println(name + " = " + p.getProperty(name));
        }
    }
}
