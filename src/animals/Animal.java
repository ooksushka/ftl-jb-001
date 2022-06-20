package animals;

import java.security.PublicKey;

class Animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;
    public Boolean canFly = false;

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
        this.canFly = false;
    }
    public Animal() {
        this.canFly = false;
    }

    public void voice() {
        System.out.println("Voice!");
    }

    protected void runForward(Integer length) {
        this.currentPosition += length;
    }

}
