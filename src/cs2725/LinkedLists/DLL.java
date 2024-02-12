package cs2725.LinkedLists;

public class DLL<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        public Node(E data, Node<E> prev, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    // Public Methods

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        return (first == null) ? null : first.data;
    }

    public E last() {
        return (last == null) ? null : last.data;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element, null, first);
        if (first != null) {
            first.prev = newNode;
        } else {
            last = newNode;
        }
        first = newNode;
        size++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(element, last, null);
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E removedData = first.data;
        first = first.next;
        if (first != null) {
            first.prev = null;
        } else {
            last = null;
        }
        size--;
        return removedData;
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E removedData = last.data;
        last = last.prev;
        if (last != null) {
            last.next = null;
        } else {
            first = null;
        }
        size--;
        return removedData;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("null <-> ");
        Node<E> current = first;
        while (current != null) {
            result.append("{").append(current.data).append("} <-> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }

    public DLL<E> clone() {
        DLL<E> cloneList = new DLL<>();
        Node<E> current = first;
        while (current != null) {
            cloneList.addLast(current.data);
            current = current.next;
        }
        return cloneList;
    }

    public DLL<E> deepClone() {
        DLL<E> deepCloneList = new DLL<>();
        Node<E> current = first;
        while (current != null) {
            deepCloneList.addLast(current.data);
            current = current.next;
        }
        return deepCloneList;
    }

    public void insert(int index, E element) {
        if (index < 0 || index > size) {
            return; // Index out of bounds
        }
        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node<E> current = getNodeAtIndex(index - 1);
            Node<E> newNode = new Node<>(element, current, current.next);
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            return null; // Index out of bounds
        }
        return getNodeAtIndex(index).data;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null; // Index out of bounds
        }
        Node<E> current = getNodeAtIndex(index);
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            first = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            last = current.prev;
        }
        size--;
        return current.data;
    }

    public void remove(Node<E> x) {
        if (x == null) {
            return;
        }
        if (x.prev != null) {
            x.prev.next = x.next;
        } else {
            first = x.next;
        }
        if (x.next != null) {
            x.next.prev = x.prev;
        } else {
            last = x.prev;
        }
        size--;
    }

    public Node<E> find(E element) {
        Node<E> current = first;
        while (current != null) {
            if (current.data.equals(element)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void swap(Node<E> x, Node<E> y) {
        if (x == null || y == null || x == y) {
            return;
        }

        Node<E> xPrev = x.prev;
        Node<E> xNext = x.next;
        Node<E> yPrev = y.prev;
        Node<E> yNext = y.next;

        // Update x's neighbors
        if (xPrev != null) {
            xPrev.next = y;
        } else {
            first = y;
        }
        y.prev = xPrev;

        if (xNext != null) {
            xNext.prev = y;
        } else {
            last = y;
        }
        y.next = xNext;

        // Update y's neighbors
        if (yPrev != null) {
            yPrev.next = x;
        } else {
            first = x;
        }
        x.prev = yPrev;

        if (yNext != null) {
            yNext.prev = x;
        } else {
            last = x;
        }
        x.next = yNext;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            return null; // Index out of bounds
        }
        Node<E> current = getNodeAtIndex(index);
        E originalElement = current.data;
        current.data = element;
        return originalElement;
    }

    // Helper method to get the node at a specific index
    private Node<E> getNodeAtIndex(int index) {
        if (index < 0 || index >= size) {
            return null; // Index out of bounds
        }
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}
