public class Main {

    public static void main(String[] args) {
        Person dima = new Boy("Dima", 25);
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

        //Tree tree = new Tree();
        //tree.addLink(oleg, Relation.PARENT, dima, Relation.CHILD);
        //tree.addLink(oleg, Relation.PARENT, olga, Relation.CHILD);
        //tree.addLink(svetlana, Relation.PARENT, oleg, Relation.CHILD);
        //tree.addLink(oleg, Relation.SISTER, olga, Relation.BROTHER);
        //tree.addLink(svetlana, Relation.MARIED, dima, Relation.MARIED);


        //Research.printAllChildren("Oleg", tree);
        //Research.printAllSisterAndBrothers(tree);
    }

}