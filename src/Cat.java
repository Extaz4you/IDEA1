public class Cat extends Animal {

    @Override
    public void come() {
        System.out.println("  Cat come to man");
    }

    @Override
    public void goodAnswer() {
        System.out.println("  Cat: Meow");
    }

    @Override
    public void badAnswer() {
        System.out.println("  Cat:Frrr");
    }

    @Override
    public void eat() {
        System.out.println("  Cat starting to eat");
    }

}
