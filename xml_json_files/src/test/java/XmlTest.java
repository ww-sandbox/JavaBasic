import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlTest {
    private Car car;

    @Before
    public void setUp() {
        User user = new User("Artur", "somerandomemail@email.com", "admin", "strong");
        car = new Car(user, "VW", "2019");
    }

    @Test
    public void testObjectToXml() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Car.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(car, new File("car.xml"));
        marshaller.marshal(car, System.out);
    }

    @Test
    public void testXmlToObject() throws JAXBException {
        File file = new File("car.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Car.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        car = (Car) unmarshaller.unmarshal(file);
        System.out.println(car + "\n");

        System.out.println(car.getOwner().getEmail());
    }

    @After
    public void tearDown() {
        car = null;
    }
}
