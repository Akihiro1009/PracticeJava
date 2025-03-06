import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Collection list = new Collection();
        list.addItem("Ada"); System.out.println(list);
        list.addItem("Ali"); System.out.println(list);
        list.addItem("Bob"); System.out.println(list);
        list.addItem("Jill"); System.out.println(list);
        list.addItem("Kyle"); System.out.println(list);

        //copy this list to an array.
        Collection collection = new Collection();
// ...

        Element element = collection.start;
        int c = 0;

        collection.resetNext();
        while ((element = element.next) != null) c++;

        Element[] elements = new Element[c];
        collection.resetNext();
        for (int i = 0; (element = element.next) != null; i++) {
            elements[c] = element;
        }
    }
}
