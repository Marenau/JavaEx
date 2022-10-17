package ru.mirea.pr.pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;

/**
 * Base class WaitList with base functionality.
 * @author malinvadim
 * @version 1.0
 * @param <E> Type of stored data.
 * @see IWaitList
 */
public class WaitList<E> implements IWaitList<E> {
    /**
     * Field for storing data.
     */
    protected ConcurrentLinkedQueue<E> collection;

    /**
     * Constructor.
     * @see WaitList#WaitList(ConcurrentLinkedQueue)
     */
    public WaitList() {
        collection = new ConcurrentLinkedQueue<>();
    }

    /**
     * Overloaded constructor.
     * @param c Collection with data to store.
     * @see WaitList#WaitList()
     */
    public WaitList(ConcurrentLinkedQueue<E> c) {
        collection = new ConcurrentLinkedQueue<>(c);
    }

    /**
     * Method to add element at the end of queue.
     * @param element Value to be added.
     * @see IWaitList#add(Object)
     * @see ConcurrentLinkedQueue#add(Object)
     */
    @Override
    public void add(E element) {
        collection.add(element);
    }

    /**
     * Method to remove first element of the queue.
     * @return Removed element.
     * @throws IllegalStateException
     * @see IWaitList#remove()
     * @see ConcurrentLinkedQueue#remove()
     */
    @Override
    public E remove() {
        if (isEmpty())
            throw new IllegalStateException("Очередь пуста!");
        return collection.remove();
    }

    /**
     * Method to check, is value equal to element in queue.
     * <br>Difficulty - O(n).
     * @param element Value for search.
     * @return Is <i>true</i> if find elements, else <i>false</i>.
     * @see IWaitList#contains(Object)
     */
    @Override
    public boolean contains(E element) {
        boolean flag = false;
        for(int i = 0; i < collection.size(); i++){
            E el = collection.remove();
            if(el.equals(element)) flag = true;
            collection.add(el);
        }
        return flag;
    }

    /**
     * Method to check, are all values equal to elements of collection in queue.
     * <br>Difficulty - O(n<sup>2</sup>).
     * <br>If <i>collection</i> has two equal elements,
     * both will be find in {@link WaitList#collection}
     * by one element.
     * @param c Collection with values for search.
     * @return Is <i>true</i> if founded all elements, else <i>false</i>.
     * @see IWaitList#containsAll(Collection)
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        ArrayList<E> arr = new ArrayList<>(c);
        for (int i = 0; i < collection.size(); i++) {
            boolean flag = false;
            for (int j = 0; j < arr.size(); j++) {
                E element = collection.remove();
                if (element.equals(arr.get(i))) flag = true;
                collection.add(element);
            }
            if (!flag) return false;
        }
        return true;
    }

    /**
     * Method to check, is {@link WaitList#collection} empty.
     * @return Is <i>true</i> if she has no elements, else <i>false</i>.
     * @see IWaitList#isEmpty()
     * @see ConcurrentLinkedQueue#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return collection.isEmpty();
    }


    /**
     * Method to get information about this list in String type.
     * @return String-value of this list.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "WaitList { " +
                "collection = " + collection +
                '}';
    }
}