public class Dog extends Animal {

    @Override
    public void come() {
        System.out.println("  Dog come to man");
    }

    @Override
    public void goodAnswer() {
        System.out.println("  Dog: Gav");
    }

    @Override
    public void badAnswer() {
        System.out.println("  Dog: RRrrr");
    }

    @Override
    public void eat() {
        System.out.println("  Dog starting to eat");
    }

}
