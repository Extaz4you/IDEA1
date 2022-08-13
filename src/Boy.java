public class Boy extends Person{
    public Boy(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void call(Animal animal, Commands commands) {
        if (animal instanceof Cat) {
            System.out.printf("Dima %s the cat", commands);
            switch (commands) {
                case KISKIS -> animal.badAnswer();
                case COME -> animal.come();
                case EAT -> animal.eat();
            }
        }else if (animal instanceof Dog) {
            System.out.printf("Dima %s the dog", commands);
            switch (commands) {
                case KISKIS -> animal.goodAnswer();
                case COME -> animal.come();
                case EAT -> animal.eat();
            }

        }
    }
    @Override
    public void say(Person person, Commands commands) {
        System.out.println("  Hi, Olga, how are you?");
    }
}
