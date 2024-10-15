package collections_12a;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        // Example: Set
        // A Set is an unordered collection that cannot contain duplicate elements.
        // Popular implementations: HashSet, LinkedHashSet, TreeSet.

        System.out.println("=== Set Example ===");
        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("orange");
        fruitSet.add("lemon");

        // Attempt to add a duplicate element
        fruitSet.add("lemon");

        // Size of the set (duplicates not stored)
        System.out.println("Size of set: " + fruitSet.size()); // Output: 4

        // Print the elements of the set (order is not guaranteed)
        System.out.println("Set elements: " + fruitSet);
        System.out.println();


        // Example: List
        // A List is an ordered collection that can contain duplicate elements.
        // Popular implementations: ArrayList, LinkedList, Stack, Vector.

        System.out.println("=== List Example ===");
        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("orange");
        fruitList.add("lemon");
        fruitList.add("lemon"); // Duplicate allowed

        // Size of the list (duplicates are stored)
        System.out.println("Size of list: " + fruitList.size()); // Output: 5

        // Print the elements of the list (order is preserved)
        System.out.println("List elements: " + fruitList);
        System.out.println();


        // Example: Queue
        // A Queue is an ordered collection typically used to process elements in the order they were added (FIFO).
        // Popular implementations: LinkedList, PriorityQueue.

        System.out.println("=== Queue Example ===");
        Queue<String> fruitQueue = new LinkedList<>();
        fruitQueue.add("apple");
        fruitQueue.add("banana");
        fruitQueue.add("orange");

        // Remove the head of the queue (FIFO: First In, First Out)
        String head = fruitQueue.remove(); // Removes "apple"
        System.out.println("Removed head: " + head);

        // Peek at the current head of the queue without removing it
        String nextHead = fruitQueue.peek(); // Peeks "banana"
        System.out.println("Next head: " + nextHead);

        // Print the remaining elements in the queue
        System.out.println("Remaining elements: " + fruitQueue);
        System.out.println();


        // Example: Map
        // A Map stores key-value pairs, where keys must be unique, but values can be duplicated.
        // Popular implementations: HashMap, TreeMap, LinkedHashMap.

        System.out.println("=== Map Example ===");
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 62);
        fruitCalories.put("lemon", 17);

        // Attempt to add a duplicate key
        fruitCalories.put("lemon", 20); // Overwrites the previous value

        // Size of the map (no duplicate keys allowed)
        System.out.println("Size of map: " + fruitCalories.size()); // Output: 4

        // Access a value by its key
        System.out.println("Calories in a lemon: " + fruitCalories.get("lemon")); // Output: 20

        // Remove an element by its key
    }

    }