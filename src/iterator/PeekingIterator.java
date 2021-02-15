/*
author - Raj Kumar Boddupally
Date - 02/14/2021
 */

package iterator;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> itr;
    private Integer next = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        itr = iterator;
        if (itr.hasNext()) {
            next = itr.next();
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer val = next;
        next = itr.hasNext() ? itr.next() : null;
        return val;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

}
