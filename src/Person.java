public abstract class Person implements Action{
    protected String name;
    protected Integer age;

    protected Commands commands;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;

    }


    public abstract void call(Animal animal, Commands commands);
    public abstract void say(Person person, Commands commands);



}