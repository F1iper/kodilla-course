package task;

public class StringCollection {

    Element head = null;

    String getElement(int n) {

        return "text";
    }

    public void addElement(String str) {
        Element element = new Element(str);
        element.value = str;

        if (head == null) {
            head = element;
        } else {
            Element el = head;
            while(el.next != null){
                el = el.next;
            }
            el.next = el;
        }
    }

    public boolean removeElement(String s) {

        return true;
    }

    @Override
    public String toString() {
        return "String = " + head;
    }

    public static void main(String[] args) {


        StringCollection collection = new StringCollection();
        collection.addElement("first");
        collection.addElement("second");

    }
}