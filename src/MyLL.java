public class MyLL<T>{
    private class Node<E> {
        public E value;
        public Node<E> next;
        public Node<E> prev;

        public Node(E value, Node<E> next, Node<E> prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
}

private Node<T> head;
private Node<T> tail;


public MyLL(){
    head = null;
    tail = null;
}

    public void printList(){
        Node<T> current = head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void printListBackwards(){
        Node<T> current = tail;

        while(current != null){
            System.out.println(current.value);
            current = current.prev;
        }
    }

    public void addToBack(T toAdd){
        Node<T> newNode = new Node<T>(toAdd, null, null);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        };

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        // Node<T> current = head;

        // while(current.next != null){
        //     current = current.next;
        // };

        // current.next = newNode;

    }

    public boolean contains( T toFind){
        Node<T> current = head;
        while(current != null){
            if(current.value.equals(toFind)){
                return true;
            }
            current = current.next;
        }

        return false;
    }  

    // remove the first node that has toRemove
    public T remove(T toRemove){
        if(head == null){
            return null;
        }


        if(head.value.equals(toRemove)){
            head = head.next;
        }

        
        Node<T> current = head;

        while(current.next != null){
            if(current.next.value.equals(toRemove)){
                current.next = current.next.next;
                return toRemove;
            }

            current = current.next; 
        }
        return null;
    }










}
