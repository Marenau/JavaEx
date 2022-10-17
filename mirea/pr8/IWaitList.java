package ru.mirea.pr8;

import java.util.Collection;

/**
 * Interface IWaitList with methods for implementors.
 * @version 1.0
 * @param <E> Type of elements to store in WaitList.
 */
public interface IWaitList <E> {
    /**
     * Method to add element into end of queue.
     * @param element Value to be added.
     */
    void add(E element);

    /**
     * Method to remove first element of queue.
     * @return Removed element.
     */
    E remove();

    /**
     * Method to check, is equal element included in queue or not.
     * @param element Value for search.
     * @return Is <i>true</i> element in list or not <i>false</i>.
     */
    boolean contains(E element);

    /**
     * Method to check, are all elements of collection included in queue or not.
     * @param c Collection with values for search.
     * @return Are <i>true</i> all elements in list or not <i>false</i>.
     */
    boolean containsAll(Collection<E> c);


    /**
     * Method to check, are there any elements in list or not.
     * @return Is <i>true</i> if no elements, <i>false</i> if any elements in list.
     */
    boolean isEmpty();
}