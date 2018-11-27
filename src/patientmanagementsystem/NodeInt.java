
package patientmanagementsystem;

public interface NodeInt <P> {
public void addFirst(P item);
public void addAfter(Node<P> node, P item);
public P removeFirst();
public P removeAfter(Node<P> node);
public Node<P> getNode(int index);
public P get(int index);
public P set(int index, P newValue);
public void add(int index, P item);
public boolean add(P item);
public P remove(int index);
public boolean remove(P item);
public int size();
}
