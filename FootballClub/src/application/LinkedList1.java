package application;

// y�netime yeni personel eklerken bunu LinkedList arac�l���yla yapman�n uygun olaca�� d���n�lm�� ve LinkedList class� elle yaz�lm��t�r
public class LinkedList1 {	
	//linked listler node lardan olu�ur bu y�zden i�inde bir node class � tan�mlan�r.
	 public class Node {
		   //olu�turulan her node un saklad��� bir data ve point etti�i bir next Node vard�r.
	        Object data;
	        Node next;
	       // olu�turulan her node un de�eri kendisine atan�r ve next node u null a e�itlenir.
	        Node(Object d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	    // linked list ile i�lem yapmam�za yarayan ilk node u temsil eden head Node tan�m�.
	    Node head;
	    
	    public  LinkedList1 insert(LinkedList1 list, Object object)
	    {
	        // verilen datayla yeni node olu�turulur
	        Node new_node = new Node(object);
	        new_node.next = null;
	   
	        // E�er linked list bo� i�e, olu�turulan yeni node ayn� zamanda head olur.
	        
	        if (list.head == null) {
	            list.head = new_node;
	        }
	        else {
	            // Yoksa node.next ile bo� olan ilk node a kadar liste gezilir.
	            Node last = list.head;
	            while (last.next != null) {
	                last = last.next;
	            }
	   
	            // Yeni node u bo�taki ilk node a atar�z.
	            last.next = new_node;
	        }
	   
	        //Liste return edilir
	        return list;
	    }
	    
	    
}
	   
	    
