package ru.mirea.pr8;

/**
 * Class of queue with constant
 * max {@link BoundedWaitList#capacity}.
 * @author malinvadim
 * @version 1.0
 * @param <E> Type of stored data.
 * @see WaitList
 */
public class BoundedWaitList<E> extends WaitList<E> {
    /**
     * Field for maximum capacity of the queue.
     */
    private int capacity;

    /**
     * Overloaded constructor.
     * @param capacity Maximum {@link BoundedWaitList#capacity} of queue.
     * @throws IllegalStateException
     * @see WaitList#WaitList()
     */
    public BoundedWaitList(int capacity) {
        super();
        if (capacity == 0)
            throw new IllegalStateException("Максимальный размер не" +
                                            "должен быть нулевым!");
        this.capacity = capacity;
    }

    /**
     * Method to get property {@link BoundedWaitList#capacity}.
     * @return Value of {@link BoundedWaitList#capacity}.
     */
    public int getCapacity() { return capacity; }

    /**
     * Method to add element into queue.
     * @param element Value to be added.
     * @throws IllegalStateException
     * @see WaitList#add(Object)
     */
    @Override
    public void add(E element) {
        if (collection.size() == capacity)
            throw new IllegalStateException("Очередь заполнена!");
        super.add(element);
    }

    /**
     * Method to get information about this list in String type.
     * @return String-value of this list.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "BoundedWaitList {" +
                " capacity = " + capacity +
                ", collection = " + collection +
                '}';
    }
}
