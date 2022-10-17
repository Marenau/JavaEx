package ru.mirea.pr.pr8;

/**
 * Class of queue with added functionality:
 * <br>Removing element from any place of queue.
 * <br>Moving found element to the end of queue.
 * @author malinvadim
 * @version 1.0
 * @param <E> Type of stored data.
 * @see WaitList
 */
public class UnfairWaitList<E> extends WaitList<E> {
    /**
     * Constructor.
     * @see WaitList
     */
    public UnfairWaitList() { super(); }

    /**
     * Method to remove element of the queue.
     * <br>Difficulty - O(n).
     * @param element Value for search and removing.
     * @see WaitList#remove()
     */
    public void remove(E element) {
        boolean flag = false;
        for (int i = 0; i < collection.size(); i++) {
            E el = collection.remove();
            if (!flag && el.equals(element)) {
                flag = true;
                break;
            } else collection.add(el);
        }
    }

    /**
     * Method for moving element to the end of queue.
     * <br>Uses {@link UnfairWaitList#remove(Object)}
     * and {@link WaitList#add(Object)}.
     * @param element Value to move.
     */
    public void moveToBack(E element) {
        int prevSize = collection.size();
        remove(element);
        if (collection.size() < prevSize)
            collection.add(element);
    }
}