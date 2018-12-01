package sr.unasat.inheritance.entities;

public class Character {
    private String name;
    private int health;

    public void punch() {
        System.out.println("Normal punch");
    }

    public void kick() {
        System.out.println("Normal kick");
    }

    public void Forward() {
        System.out.println("Walks forward normal");
    }

    public void Backward(){
        System.out.println("Walks backward normal");
    }
}
