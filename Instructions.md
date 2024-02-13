# cs2725-project01
Project 1: Doubly Linked Lists

Import the class into the tester and check all cases for the methods written in DLL.java.

Description:
In this assignment, you will implement a doubly Linked List that manipulates generic types. Specifically, you will create a doubly Linked List class inside a file called DLL.java. A node class will be implemented as a nested class within the DLL class. The list will be implemented according to the class specifications below. You are not allowed to use ArrayLists or Linked Lists from the Java API library to implement any of the methods. Due to the generic nature of this project, your list is expected to work with various object types specified by the user.
DLL.java Specifications:
class Node<E> Fields:
- private E element;
- private Node<E> prev; - private Node<E> next;
Constructors:
- public Node<E>(): Initializes all fields to null.
- public Node<E>(E element): Initializes the element field to the
specified paramenter, and everything else null.
- public Node<E>(E element, Node<E> prev, Node<E> next): Initializes all all fields to the specified parameters.
Public Methods:
- Getters and setters for the fields.
class DLL<E> Fields:
- private Node<E> head; - private Node<E> tail; - private int counter;
Do not use header or trailer nodes. Constructors:
- public DLL<E>(): Initializes all reference fields to null, and the counter to zero.
     1

Public Methods:
1. int size(): Returns the number of elements in the list.
2. boolean isEmpty(): Returns true if the list is empty, and false otherwise.
3. E first(): Returns (but does not remove) the first element of the list.
4. E last(): Returns (but does not remove) the last element of the list.
5. void addFirst(E element): Adds a new element to the front of the list.
6. void addLast(E element): Adds a new element to the end of the list.
7. E removeFirst(): Removes and returns the first element of the list.
8. E removeLast(): Removes and returns the last element of the list.
9. String toString(): Returns a string that displays the sequence of elements contained in the list. On an empty list, print “null”.
Ex.: “null<––a<––>b<––>c––>null”
10. DLL<E> clone(): Creates a new sequence of nodes whose elements reference the elements of the original list.
11. DLL<E> deepClone(): Creates a new sequence of nodes that contain new elements whose value is equal to that of the objects in the original list.
12. void insert (int index, E element): Inserts an element at the specified position in the list. List elements start at 0.
13. E get(int index): retrieves an element at the specified position in the list (does not remove it from the list). If an index is out of bounds, return null. List elements start at 0.
14. E remove(int index): Removes an element at the specified position from the list, and returns the element.
15. void remove(Node<E> x): Removes the specified node from the list.
16. Node<E> find(E element): Returns a reference to the node containing the
element. If the element is not in the list, return null.
17. void swap (Node<E> x, Node<E> y): The nodes x and y switch positions in the list. The elements contained within the nodes are not altered. (Bonus 5 pts)
18. void clear(): Removes all elements from the list.
19. E set(int index, E element): Replaces the element at the specified position in the list with the specified element. Returns the original element from that position.
Important Notes:
The following methods will be implemented for all objects used during grading:
- toString - clone
- equals
  2

- Submission Instructions:
- Create a README text file that contains your name and any specific compilation
instructions you may have for your program.
- Submit DLL.java and README text file on eLC.
- Make sure you receive the submission email.
You can make your testing classes and submit/upload them if you have any different instructions for them or remove them. We run our grader on your project.
Two options for projects:
• Choose a partner – someone you meet in the class
• Opt to work alone – not recommended, but available
3
