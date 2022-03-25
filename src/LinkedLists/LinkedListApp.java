package LinkedLists;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Insertion at the beginning
        names.insert("Vishnu");
        names.insert("Varun");
        names.insert("Anand");

        // Traverse
        names.traverse();

        // Remove items
        names.remove("Anand");
        names.traverse();
    }
}
