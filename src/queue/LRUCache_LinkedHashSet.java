package queue;

/* Raj Kumar Boddupally created on 9/17/2021 inside the package - queue */

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache_LinkedHashSet {
    private final Set<User> cache;
    private final int CAPACITY;

    public LRUCache_LinkedHashSet(int capacity) {
        cache = new LinkedHashSet<>(capacity);
        CAPACITY = capacity;
    }

    public LRUCache_LinkedHashSet() {
        cache = new LinkedHashSet<>(5);
        CAPACITY = 5;
    }

    public static void main(String[] args) {

    }

    public void refer(User user) {
        if (get(user)) {
            cache.remove(user);
        }
        put(user);
    }

    private boolean get(User user) {
        return cache.contains(user);
    }

    private void put(User user) {
        if (cache.size() == CAPACITY) {
            User lruUser = cache.iterator().next();
            cache.remove(lruUser);
        }
        cache.add(user);
    }

    public void displayCache() {
        new LinkedList<>(cache).descendingIterator().forEachRemaining(System.out::println);
    }

    public int size() {
        return cache.size();
    }
}


