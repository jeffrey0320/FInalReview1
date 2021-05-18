import java.util.*;

/* Final Test
 * Write code that goes through something and tells me how often things occur
 *
 * TreeMap will print out in order
 * HashMap will be in random order
 */
public class Mains {
    public static void main(String[] args){
        // LinkedLists
        System.out.println("LINKEDLISTS" + "\n");

        // How to create an empty LinkedList in Java
        LinkedList<Integer> linkList = new LinkedList<>();

        // add() - Appends the specified element to the end of this list.
        linkList.add(5);
        linkList.add(42);
        linkList.add(2);
        linkList.add(21);
        linkList.add(1);
        linkList.add(18);

        // size() - Returns the number of elements in this list.
        System.out.println(linkList.size()); // 6

        // get() - Returns the element at the specified position in this list.
        System.out.println(linkList.get(1)); // 42

        System.out.println();

        // set() - Replaces the element at the specified position in this list with the specified element.
        linkList.set(3, 15); // 5, 42, 2, 15, 1, 18

        // iterator() - Returns an iterator over the elements in this list
        Iterator<Integer> itr = linkList.iterator();

        // listIterator() - Returns a list iterator over the elements in this list
        Iterator<Integer> iter = linkList.listIterator();

        // remove() - Retrieves and removes the head (first element) of this list.
        linkList.remove(); // 42, 2, 15, 1, 18

        // contains() - Returns true if this list contains the specified element.
        System.out.println(linkList.contains(1)); // true

        // addFirst() - Inserts the specified element at the beginning of this list.
        linkList.addFirst(63); // 63, 42, 2, 15, 1, 18

        // getFirst() - Returns the first element in this list.
        System.out.println(linkList.getFirst()); // 63

        // removeFirst() - Removes and returns the first element from this list.
        linkList.removeFirst(); // 42, 2, 15, 1, 18

        // addLast() - Appends the specified element to the end of this list.
        //This method is equivalent to add.
        linkList.addLast(32); // 42, 2, 15, 1, 18, 32

        // getLast() - Returns the last element in this list.
        System.out.println(linkList.getLast()); // 32

        System.out.println();

        // removeLast() - Removes and returns the last element from this list.
        linkList.removeLast(); // 42, 2, 15, 1, 18

        // iterating through a LinkedList in 3 different ways
        // for loop
        // for each loop
        // iterator

        System.out.print("for loop: ");
        for(int i=0; i<linkList.size();i++){
            System.out.print(linkList.get(i) + " ");
        }
        System.out.println();

        System.out.print("for each loop: ");
        for(int x : linkList)
            System.out.print(x + " ");

        System.out.println();

        Iterator<Integer> it = linkList.iterator();

        System.out.print("iterator: ");
        while(it.hasNext())
            System.out.print(it.next() + " ");

        System.out.println("\n");

        // Stacks
        System.out.println("STACK" + "\n");

        // create a stack
        ArrayStack<Character> stk = new ArrayStack<>();

        for(char ch = 'A'; ch<='Z'; ch++)
            stk.push(ch); // push() - adds to the end of the stack

        System.out.println(stk); // top Z,Y,X,W,V,U,T,S,R,Q,P,O,N,M,L,K,J,I,H,G,F,E,D,C,B,A,bottom

        for(int i=0; i<10; i++)
            stk.pop(); // pop() - lets you look at the top of the stack

        System.out.println("peek(): " + stk.peek()); // peek(): P

        System.out.println(stk); // top P,O,N,M,L,K,J,I,H,G,F,E,D,C,B,A,bottom

        while(!stk.isEmpty())
            stk.pop();

        System.out.println(stk);

        System.out.println();

        // Deque
        System.out.println("DEQUE" + "\n");

        Deque<Integer> dQue = new LinkedList<>();

        // Queue mode - addLast(), offerLast(), removeFirst(), pollFirst(), getFirst(), peekFirst()
        dQue.addLast(5);
        dQue.addLast(10);

        // Stack mode - addFirst(), removeFirst(), peekFirst()

        // Queue
        System.out.println("QUEUES" + "\n");

        Queue<Integer> QUQ = new LinkedList<>();

        // add() - Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        // adds to the end of the list
        QUQ.add(10);
        QUQ.add(25);
        QUQ.add(63);
        QUQ.add(5);
        QUQ.add(43);
        QUQ.add(1);
        QUQ.add(32);

        for(int x : QUQ)
            System.out.print(x + " "); // 10 25 63 5 43 1 32

        System.out.println();

        // poll() - Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println("poll()- " + QUQ.poll()); // poll()- 10
        System.out.println("poll()- " + QUQ.poll()); // poll()- 25

        // peek() - Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println("peek()- " + QUQ.peek()); // peek()- 63

        // size() - Returns the number of elements in this collection.
        System.out.println("size()- " + QUQ.size()); // size()- 5

        for(int x : QUQ)
            System.out.print(x + " "); // 63 5 43 1 32

        System.out.println("\n");

        //PriorityQueue
        System.out.println("PriorityQueues" + "\n");

        // Know how to create an empty PriorityQueue.
        PriorityQueue<Integer> que = new PriorityQueue<>();

        // How to create a PriorityQueue using a custom comparator
        PriorityQueue<Integer> pQ = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        // How to implement a class that implements the Comparator<E> interface.
        PriorityQueue<Integer> p = new PriorityQueue<>(10, new PQ());

        // add() - Inserts the specified element into this priority queue. O(log(n))
        p.add(39);
        p.add(7);
        p.add(41);
        p.add(30);
        p.add(17);
        p.add(29);
        p.add(17);
        p.add(20);

        for(int x : p)
            System.out.print(x + " "); // 41 30 39 20 17 29 17 7

        System.out.println();

        // poll() - Retrieves and removes the head of this queue, or returns null if this queue is empty O(log(n))
        System.out.println("poll() - " + p.poll()); // 39 30 29 20 17 7 17

        // peek() - Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty O(1)
        System.out.println("peek() - " + p.peek()); // 39

        // size() - Returns the number of elements in this collection. O(1)
        System.out.println("size() - " + p.size()); // 7

        // isEmpty() - Returns true if this collection contains no elements. O(1)
        System.out.println("isEmpty() - " + p.isEmpty()); // false

        for(int x : p)
            System.out.print(x + " ");

        System.out.println();

        // HEAPS - insertElement() and removeMin()

        /*
            add(x):
	        1.put x as a child of the node as far to the bottom left as you can go, where each level must be filled in.

	        2.Let p = the parent of x.

	        3.while p > x and x isn't the root
		        swap p and x
		        set x = p
		        set p = the parent of p

            poll():
	        1.swap the root with the last element in the tree.
	        2.delete the last element in the tree
	        3.find the minimum if the root, the root's left, and the root's right (assuming they exist)
	        4.if the root is the smallest (or it's the only element), stop.
	        5.else, repeat 3 and 4 with the smaller child.
        */

        System.out.println("\n");
        // SETS
        System.out.println("SETS" + "\n");

        // How to create a TreeSet and HashSet
        HashSet<Integer> set1 = new HashSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        // add() - Adds the specified element to this set if it is not already present.
        set1.add(5);
        set1.add(10);
        set1.add(3);
        set1.add(7);
        set1.add(12);
        set1.add(1);

        set2.add(5);
        set2.add(10);
        set2.add(3);
        set2.add(7);
        set2.add(12);
        set2.add(1);
        set2.add(15);

        // contains() - Returns true if this set contains the specified element.
        System.out.println("Set1 contains 1: " +set1.contains(1)); // true
        System.out.println("Set1 contains 50: " +set1.contains(50) + "\n"); // false


        // remove() - Removes the specified element from this set if it is present.
        set1.remove(12); // 1, 3, 5, 7, 10
        set1.remove(1); // 3, 5, 7, 10
        set1.remove(9);


        // Iterating using an Iterator
        System.out.print("Hashset using Iterator: ");
        Iterator<Integer> itr1 = set1.iterator();

        while(itr1.hasNext())
            System.out.print(itr1.next() + " ");

        System.out.println();

        // Iterating using a for loop
        System.out.print("Hashset using for loop: ");
        for(int x : set1)
            System.out.print(x + " ");

        System.out.println();

        System.out.print("Treeset: ");
        Iterator<Integer> itr2 = set2.iterator();

        while(itr2.hasNext())
            System.out.print(itr2.next() + " ");

        System.out.println("\n");

        /*
         * removeAll() - is a new set that contains the elements that are in A but not in B. (A=A-B) A.removeAll(B);
         *
         */

        //removeAll() set2 - {1, 3, 5, 7, 10, 12, 15} set1 - {3, 5, 7, 10}
        set2.removeAll(set1); // 1, 12, 15

        System.out.print("Hashset using removeAll(): ");
        for(int x : set2)
            System.out.print(x + " ");

        System.out.println();

        //addAll() - For 2 sets A and B, A union B is a new set that contains elements from A and B combined.
        set2.addAll(set1); // 1, 3, 5, 7, 10, 12, 15

        System.out.print("Hashset using addAll(): ");
        for(int x : set2)
            System.out.print(x + " ");

        System.out.println();

        //retainAll() - For 2 sets A and B, A intersect B is a new set that contains only elements that are both in A and B.
        set2.retainAll(set1); // 3, 5, 7, 10

        System.out.print("Hashset using retainAll(): ");
        for(int x : set2)
            System.out.print(x + " ");

        System.out.println();


        // MAPS
        System.out.println("MAPS" + "\n");

        // How to create an empty map using HashMap or TreeMap
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new TreeMap<>();

        // put() - associates the specified value with the specified key in this map
        // A map cannot contain duplicate keys; each key can map to at most one value.
        map1.put('c', 1);
        map1.put('a',5);
        map1.put('b',2);
        map1.put('g',8);
        map1.put('z',10);
        map1.put('a',9); // will associate 9 with 'a' instead of 5

        // How to iterate through a map, 2 different ways using sets - keySet() and entrySet()
        // either iterate through the keys and find the values or
        // iterate through the set of pairs and pull out the keys and values from set of pairs

        System.out.println("Using entrySet()");
        // Works well for both Maps
        for(Map.Entry<Character, Integer> entry: map1.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            System.out.println("key: " + key + " value: " + value);
        }

        System.out.println();
        System.out.println("Using keySet()");
        // Ony works well for HashMap
        for(char key: map1.keySet()){
            int value = map1.get(key);
            System.out.println("key: " + key + " value: " + value);
        }

        System.out.println();
        // containsKey() - returns true if the map contains the given key
        System.out.println(map1.containsKey('d')); // false
        System.out.println(map1.containsKey('z')); // true

        System.out.println();
        // get() - returns the value to which the specified key is mapped, or null if
        // this map contains no mapping for the key.
        System.out.println(map1.get('d')); // null
        System.out.println(map1.get('z')); // 10

        System.out.println();

        // containsValue() - returns true if this map maps one or more keys to the
        // specified value.
        System.out.println(map1.containsValue(0)); // false
        System.out.println(map1.containsValue(10)); // true

        System.out.println();

        // entrySet() - Returns a Set view of the mappings contained in this map.
        System.out.println(map1.entrySet()); // [g=8, b=2, c=1, a=9, z=10]

        System.out.println();

        // keySet() - Returns a Set view of the keys contained in this map.
        System.out.println(map1.keySet()); // [g, b, c, a, z]

        System.out.println();
        System.out.println("BINARY SEARCH TREES");
        System.out.println();
        /*
        * A Binary Search Tree is a binary tree where every node obeys the BST property.
        * The BST property is that for every node x
        * x.left.key <= x.key and x.right.key >= x.key
        */

        BinarySearchTree tree = new BinarySearchTree();

        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(40);
        tree.add(70);
        tree.add(60);
        tree.add(80);

        // LNR - 20, 30, 40, 50, 60, 70, 80
        System.out.println("BST inorder:");
        tree.inOrder();
        System.out.println();

        // NLR - 50, 30, 20, 40, 70, 60, 80
        System.out.println("BST pre-order:");
        tree.preOrder();
        System.out.println();

        // LRN - 20, 40, 30, 60, 80, 70, 50
        System.out.println("BST post order:");
        tree.postOrder();
        System.out.println();
    }
}
