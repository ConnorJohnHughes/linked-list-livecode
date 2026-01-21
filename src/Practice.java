public class Practice {
    public static void main(String[] args) {
        // Node head = new Node('g', null);
        
        // Node ryan = new Node('s', null);

        // head.next = ryan;

        // ryan.next = new Node('t', null);
        // ryan.next.next = new Node('x', null);

        // // expected to return true 
        // System.out.println(contains(head, 'x'));

        // // expected to return false
        // System.out.println(contains(head, 'e'));

        // remove(head, 't');


        MyLL<Character> list = new MyLL<>();

        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');

        list.printList();
        System.out.println("\n");
        list.printListBackwards();
     

        MyLL<Integer> intList = new MyLL<>();
        intList.addToBack(5);
        intList.addToBack(8);
        intList.addToBack(9);
        intList.addToBack(10);
        intList.addToBack(48);
        intList.addToBack(23);

        intList.printList();
        System.out.println("\n");
        intList.printListBackwards();




    }
   

    public static void printList(Node start){
        Node current = start;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static boolean contains(Node start, char toFind){
        Node current = start;
        while(current != null){
            if(current.value == toFind){
                return true;
            }
            current = current.next;
        }

        return false;
    }  

    // remove the first node that has toRemove
    public static char remove(Node head, char toRemove){
        Node current = head;

        while(current.next != null){
            if(current.next.value == toRemove){
                current.next = current.next.next;
                return toRemove;
            }

            current = current.next; 
        }
        return '\0';
    }


    
}



//////////////// Counting elements in linked list/////////////
//  current = head
//  count = 0
//  
//  while current != null
//  count ++
//  current = current.next
//
//  return count


