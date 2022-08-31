public class Main {

    public static void main(String[] args) {
        Person dima = new Boy("Dima" ,25);
        Person olga = new Girl("Olga", 24);

        Animal cat1 = new Cat();
        Animal dog1 = new Dog();

        dima.call(cat1, Commands.KISKIS);
        dima.call(dog1, Commands.COME);

        System.out.println("-----------------");

        olga.call(cat1, Commands.KISKIS);
        olga.call(dog1,Commands.EAT);

        System.out.println("---------------");

        dima.say(olga, Commands.SAY);
        olga.say(dima,Commands.SAY);

    }

}