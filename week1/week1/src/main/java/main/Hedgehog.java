package main;

class Hedgehog {
    String name;
    int age;

    /* default constructor without parameters */

    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }

    /* constructor */

    public Hedgehog(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void Speak(String sentence) {
        System.out.println(sentence);
    }

    public void run(int n) {
        for (int i = 1; i < n + 1; i++) {
            System.out.println(this.name + "runs really fast!");
        }
    }
}