public class MakingLists {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> intlist = new SinglyLinkedList<>();
        System.out.println(intlist);
        System.out.println(intlist.get(3));

        intlist.add(31);
        intlist.add(12);
        intlist.add(6);
        System.out.println(intlist);
        System.out.println(intlist.get(1));
        intlist.set(1,99);
        System.out.println(intlist);
        intlist.remove(1);
        System.out.println(intlist);
        intlist.clear();
        System.out.println(intlist);
    }
}