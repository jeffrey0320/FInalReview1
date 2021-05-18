import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedQueue<E> implements ourQueue<E> {

    private LinkedList<E> list;

    public LinkedQueue(){
        list = new LinkedList<>();
    }

    public boolean add(E item){
        return list.add(item);
    }

    public E peek(){
        if(isEmpty())
            throw new NoSuchElementException();
        return list.getFirst();
    }

    @Override
    public E poll() {
        if(isEmpty())
            throw new NoSuchElementException();
        return list.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

}
