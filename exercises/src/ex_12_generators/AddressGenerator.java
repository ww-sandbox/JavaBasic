package ex_12_generators;

public class AddressGenerator extends Generator {
    String streets[] = {"White, Blue, Red, Green,Grey, Purple, Dark"};

    public AddressGenerator() {
        super();
    }

    public String generate() {
        return streets[rand.nextInt(this.streets.length)] + " " + rand.nextInt(100);
    }
}
