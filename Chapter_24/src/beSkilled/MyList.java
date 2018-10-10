package beSkilled;

public interface MyList<E> extends java.lang.Iterable<E> {
//add a new elemenr at the end of this list

    public void add(E e);
    //Add anew element at the specified index in this list

    public void add(int index, E e);
    //Clear the list

    public void clear();
    //Return true if this list contains the element

    public boolean contains(E e);

    public E get(int index);

    public int indexOf(E e);

    public boolean isEmpty();

    public int lastIndexOf(E e);

    public boolean remove(E e);

    public E remove(int index);

    public Object set(int index, E e);

    public int size();

}
