package task;

public class LinkedList {

    Node collectionHead = null;

    public void addElement(int data) {
        Node node = new Node();
        node.data = data;

        if (collectionHead == null) {
            collectionHead = node;
        } else {
            Node n = collectionHead;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void showElements(){
        Node node = collectionHead;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "collectionHead=" + collectionHead +
                '}';
    }

    public boolean removeElement(int n) {

        return false;
    }
}
