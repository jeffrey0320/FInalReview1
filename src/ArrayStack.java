import java.util.ArrayList;

public class ArrayStack<E> implements OurStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public void push(E item) {
        list.add(item);
    }

    public E peek() {
        return list.get(list.size()-1);
    }

    public E pop() {
        return list.remove(list.size()-1);
    }

    public boolean isEmpty() {
        return list.size()==0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("top\n");
        for(int i=list.size()-1; i>=0; i--)
            sb.append(list.get(i) + ",");
        sb.append("bottom");
        return sb.toString();
    }


}
