package ex_5_static_keyword;

class Person {
    private static int staticAge = 20;
    private int objectAge = 20;

    void addStaticAge(int age) {
        staticAge = staticAge + age;
    }

    void addObjectAge(int age) {
        objectAge = objectAge + age;
    }

    int getStaticAge() {
        return  staticAge;
    }

    int getObjectAge() {
        return objectAge;
    }

    static void staticMethod() {
        System.out.println("I`m static...you don`t have to create new object!");
    }
}
