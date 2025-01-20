package main;

class Hedgehog {
    String name;
    int age;

    /* constructor */

    public Hedgehog(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void speak(String sentence) {
        System.out.println(sentence);
    }

    public void run(int n) {
        for (int i = 1; i < n + 1; i++) {
            System.out.println(this.name + " runs really fast!");
        }
    }
}