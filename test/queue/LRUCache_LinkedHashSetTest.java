package queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 9/17/2021 inside the package - queue */

class LRUCache_LinkedHashSetTest {

    LRUCache_LinkedHashSet cache;

    @BeforeEach
    void clear() {
        cache = new LRUCache_LinkedHashSet();
    }

    @Test
    void add4Users() {
        cache.refer(new User(2, "two"));
        cache.refer(new User(6, "six"));
        cache.refer(new User(4, "four"));
        cache.refer(new User(6, "six"));
        cache.refer(new User(1, "one"));
        Assertions.assertEquals(4, cache.size());
        cache.displayCache();
    }

    @Test
    void add5Users() {
        cache.refer(new User(2, "two"));
        cache.refer(new User(6, "six"));
        cache.refer(new User(4, "four"));
        cache.refer(new User(6, "six"));
        cache.refer(new User(1, "one"));
        cache.refer(new User(8, "eight"));
        Assertions.assertEquals(5, cache.size());

    }

    @Test
    void add6Users() {
        cache.refer(new User(6, "six"));
        cache.refer(new User(2, "two"));
        cache.refer(new User(4, "four"));
        cache.refer(new User(6, "six"));
        cache.refer(new User(1, "one"));
        cache.refer(new User(8, "eight"));
        cache.refer(new User(3, "three"));
        cache.refer(new User(5, "five"));
        Assertions.assertEquals(5, cache.size());
        cache.displayCache();
    }
}
