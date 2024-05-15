import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>();
        int totalElements = 0;

        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(1000), random.nextInt(1000));
            table.put(key, i);
            totalElements++;
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

        System.out.println("Total elements: " + totalElements);
    }
}
