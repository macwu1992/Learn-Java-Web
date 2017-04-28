import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by Tong on 2016/11/12.
 */

public class JavaTest {
    public static void main(String[] args) {
        LinkedList<Node> linkedList = new LinkedList<Node>();
        Node node1 = new Node(1, 2);
        Node node2 = new Node(3, 4);
        Node node3 = new Node(4, 5);

        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);

        Node head = linkedList.getFirst();

        int index = linkedList.indexOf(linkedList);

        System.out.print(index);

//        for (Node node : linkedList.subList(0, linkedList.size()-1)) {
//            if (head.equals(node)) {
//                System.out.print(linkedList.size());
//            }
//        }
    }
}
