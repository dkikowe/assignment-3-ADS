import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>();


        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(1000), random.nextInt(1000));
            table.put(key, i);

        }

        MyHashTable.HashNode<MyTestingClass, Integer>[] chainArray = table.getChainArray();
        for (int i = 0; i < chainArray.length; i++) {
            int count = 0;
            MyHashTable.HashNode<MyTestingClass, Integer> currentNode = chainArray[i];
            while (currentNode != null) {
                count++;
                currentNode = currentNode.next;
            }
            System.out.println("Bucket " + i + ": " + count + " elements");
        }
        BST<Integer, Integer> bst = new BST<>();
        bst.put(5,1);
        bst.put(4,3);
        bst.put(3,4);
        bst.put(1,5);
        bst.put(6,1);
        for (Integer key : bst.iterator()) {
            System.out.println("Key: " + key + ", Value: " + bst.get(key));
        }
        System.out.println("BST after removing: ");
        bst.delete(4);
        for (Integer key : bst.iterator()) {
            System.out.println("Key: " + key + ", Value: " + bst.get(key));
        }

    }
}
