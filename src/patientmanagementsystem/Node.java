
package patientmanagementsystem;

public class Node<P> {
    private P data;
    private Node<P> next = null;
    
    public Node(P data, Node<P> next) {
        this.data = data;
        this.next = next;
    }
    
    public Node(P data) {
            this(data, null);
    }
    
    
    public P getData(){
        return data;
    }
	
    public void setData(P data){
	this.data = data;
        }
	
    public Node<P> getNext(){
	return next;
    }
		
    public void setNext(Node<P> next){
	this.next = next;
    }

}
