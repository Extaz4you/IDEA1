public class Main {

    public static void main(String[] args) {
        Person dima = new Person("Dima", "V");
        Person oleg = new Person("Oleg", "V");
        Person olga = new Person("Olga", "V");
        Person svetlana = new Person("Svetlana", "V");

        Tree tree = new Tree();
        tree.addLink(oleg, Relation.PARENT, dima, Relation.CHILD);
        tree.addLink(oleg, Relation.PARENT, olga, Relation.CHILD);
        tree.addLink(svetlana, Relation.PARENT, oleg, Relation.CHILD);
        tree.addLink(oleg, Relation.SISTER, olga, Relation.BROTHER);
        tree.addLink(svetlana, Relation.MARIED, dima, Relation.MARIED);


        Research.printAllChildren("Oleg", tree);
        Research.printAllSisterAndBrothers(tree);
    }

}