package sr.unasat.inheritance.concrete;

public class Character {
    private String name;
    private int health;

    public void punch() {
        System.out.println("Normal concrete punch");
    }

    public void kick() {
        System.out.println("Normal concrete kick");
    }

    public void Forward() {
        System.out.println("Walks forward concrete normal");
    }

    public void Backward(){
        System.out.println("Walks backward concrete normal");
    }
}
