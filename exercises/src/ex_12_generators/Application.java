package ex_11_generators;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Generator> generators = new ArrayList<>();
        generators.add(new AddressGenerator());
        generators.add(new NameGenerator(true));
        generators.add(new PeselGenerator("1863", "04", "03", "168", true));

        for(Generator generator : generators) {
            System.out.println(generator.generate());
        }
    }
}
