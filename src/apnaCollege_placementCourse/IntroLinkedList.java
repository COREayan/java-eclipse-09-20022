package apnaCollege_placementCourse;

public class IntroLinkedList {
	Node head;
	//private int size;
	public IntroLinkedList(){
		// size=0;
	}	
	
	class Node {
		String data;
		Node next;
		public Node (String data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//add 
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	//addLast 
	public void addLast(String data) {
		Node ptr = head;
		Node newNode = new Node(data);
		if (head==null) {
			head = newNode;
			return;
		}
		while (ptr.next != null) {
			ptr = ptr.next;
		}
		ptr.next = newNode;
	}
	
	//delete first
	public void removeFirst() {
		if (head==null) {
			System.out.println("Empty list, Nothing to delete");
		}
		Node ptr = head.next;
		head=ptr;
	}
	
	//delete last
	public void removeLast() {
		if (head == null) {
			System.out.println("Empty list, Nothing to delete");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node ptr = head;
		/*
		Node preptr = head;
		while (ptr.next != null) {
			preptr = ptr;
			ptr = ptr.next;
		}
		preptr.next = null;
		*/
		// My try1
		while (ptr.next.next != null) {
			ptr = ptr.next;
		}
		ptr.next = null;
	}
	
	//get size
	public int getSize() {
		Node ptr = head;
		int size=0;
//		if (head==null) {
//			return 0;
//		}
		while (ptr != null) {
			ptr = ptr.next;
			size++;
		}
//		System.out.println()
		return size;
	}
	
	//print list
	public void printList() {
		Node ptr = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (ptr != null) {
			System.out.print(ptr.data+" -> ");
			ptr = ptr.next;
		}
		System.out.print("END\n");
	}
	

	
	public static void main(String args[]) {
		IntroLinkedList list = new IntroLinkedList();
		list.addFirst("hello");
		list.addLast(", ");
		list.addLast("Ayanabha");
		list.removeLast();
		list.printList();
		System.out.println("Size of the list is : "+list.getSize());
	}
}

/*
 * 
public class ll {
    Node head;
    public ll() {
        // size=0;    
    }
    
    class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    //public void addFirst(int d)
    
    public void add(int d) {
        Node newNode = new Node(d);
        newNode.data = d;
        Node ptr = head;
        if (head==null) {
            head=newNode;
            return;
        }
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
    }
    
    public int findIndex(int d) {
        Node ptr = head;
        int index=0;
        if (head.data==d) {
            return 0;
        } 
        while (ptr.data != d) {
            ptr = ptr.next;
            index++;
        }
        return index;
    }
    
    
    public static void main(String[] args) {
        //Homework Problems: 1. Make a Linked List & add the following elements to it:
        //(1, 5, 7, 3, 8, 2, 3). Search for the number 7 & display its index.
		ll list = new ll();
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(3);
		
		System.out.println("Index : "+list.findIndex(7));
    }
}*/

/*
import java.util.Scanner;
class ll {
    Node head;
    public ll() {
        //size =0;
    }
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void add(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
    } 
    
    public void deleteNode(Node ptr) {
        if (ptr == head) {
            Node temp = head.next;
            head = temp;
            return;
        } else {
            Node temp = head;
            while (temp.next != ptr) {
                temp = temp.next;
            }
            Node temp2 = temp.next;
            temp.next = temp2.next;
        }
    }
    
    public void deleteNodesWithValueGreaterThan25() {
        Node ptr = head;
        if (head==null) {
            System.out.println("List is Empty");
        }
        while (ptr!=null) {
            if (ptr.data>25) {
                deleteNode(ptr);
            }
            ptr = ptr.next;
        }
    }
    
    public void display() {
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data+" -> ");
            ptr = ptr.next;
        }
        System.out.print("null\n");
    }
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //Take elements(number in range of 1-50) of a Linked List as input from the user, 
        //Delete all nodes which have values greater than 25.
        Scanner sc = new Scanner(System.in);
        ll list = new ll();
        int option, val;
        do {
            System.out.println("\n*****MAIN MENU*****\n");
            System.out.println("1: Add element");
            System.out.println("2: Display List");
            System.out.println("3: Delete Nodes with value greater than 25");
            System.out.println("4: EXIT\nEnter your option : ");
            option = sc.nextInt();
            switch(option) {
                case 1: 
                    System.out.println("Enter the value to add");
                    val = sc.nextInt();
                    list.add(val);
                    break;
                
                case 2: 
                    list.display();
                    break;
                
                case 3: 
                    list.deleteNodesWithValueGreaterThan25();
                    break;
            
            }
        } while (option != 4);
    }
}*/
