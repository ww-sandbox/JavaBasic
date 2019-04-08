package ex_11_generators;

public class NameGenerator extends Generator {
    private String femaleFirstnames[] = {"Angie", "Jessica", "Sophia", "Beth"};
    private String maleFirstames[] = {"John", "Gregory", "George", "Phil"};
    private String lastNames[] = {"Smith, Connor, McCann, McGregor, Cosby, Gatsby"};
    private boolean isMale;

    public NameGenerator(boolean isMale) {
        super();
        this.isMale = isMale;
    }

    public String generate() {
        return isMale ?
                this.getRandomName(maleFirstames) :
                this.getRandomName(femaleFirstnames);
    }

    private String getRandomName(String names[]) {
        return names[rand.nextInt(names.length)] + " " + this.lastNames[rand.nextInt(this.lastNames.length)];
    }
}
