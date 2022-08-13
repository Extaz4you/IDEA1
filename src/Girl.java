public class Girl extends Person {


    public Girl(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void call(Animal animal, Commands commands) {
        if (animal instanceof Cat) {
            System.out.printf("Olga %s the cat", commands);
            switch (commands) {
                case KISKIS -> animal.goodAnswer();
                case COME -> animal.come();
                case EAT -> animal.eat();
                }
            }else if (animal instanceof Dog) {
            System.out.printf("Olga %s the dog", commands);
            switch (commands) {
                case KISKIS -> animal.badAnswer();
                case COME -> animal.come();
                case EAT -> animal.eat();
            }

        }
    }

    @Override
    public void say(Person person, Commands commands) {
            System.out.println("  \n" +
                    "I'm fine, and how are you?");
        }
    }

