import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "car")
public class Car {
    @XmlElement(name = "owner")
    private User owner;
    @XmlElement(name = "model")
    private String model;
    @XmlElement(name = "year")
    private String year;

    public Car() {};
    public Car(User owner, String model, String year) {
        this.owner = owner;
        this.model = model;
        this.year = year;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner=" + owner +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
