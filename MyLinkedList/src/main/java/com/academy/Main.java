package main.java.com.academy;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> myList = new MyLinkedList<>();

        String cities = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra Peru Malvern";
        String[] cityArr = cities.split(" ");
        for (String city : cityArr) {
            boolean isAdded = myList.add(city);
            System.out.println("Adding item : " + city + " , Status : " + isAdded);
        }

        System.out.println("Size : " + myList.getSize());

        myList.printList();

        boolean isRemoved = myList.remove("Malvern");
        System.out.printf("\nItem '%1$s' ::  Remove status : %2$s ", "Malvern", isRemoved);
        myList.printList();

        isRemoved = myList.remove("Sydney");
        System.out.printf("\nItem '%1$s' ::  Remove status : %2$s ", "Sydney", isRemoved);
        myList.printList();

        System.out.println("\nSize : " + myList.getSize());


        // Integer
//        MyLinkedList<Integer> myIntList = new MyLinkedList<>();
//
//        String integers = "12 08 45 98 67 89 74 34 120 60 05 ";
//        String[] intArr = integers.split(" ");
//        for (String intVal : intArr) {
//            boolean isAdded = myIntList.add(Integer.parseInt(intVal));
//            System.out.println("Adding item : " + intVal + " , Status : " + isAdded);
//        }
//
//        System.out.println("Size : " + myIntList.getSize());
//
//        myIntList.printList();

    }
}
