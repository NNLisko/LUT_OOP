package main;

class Hedgehog {
    String name;
    int age;

/* default constructor without parameters */

    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }

/*constructor */

    public Hedgehog(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void Speak( String sentence ) {
        System.out.println(sentence);
    }
}