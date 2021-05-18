public interface ourQueue<E> {
    public boolean add(E item);
    public E peek();
    public E poll();
    public boolean isEmpty();
    public int size();
}
