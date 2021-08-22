package queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class LRUCacheTest {
    LRUCache cache = new LRUCache(5);

    @BeforeEach
    void setUp() {
    }

    @Test
    void getWithNoElement() {
        Assertions.assertThrows(NoSuchElementException.class, () -> cache.get(999));
    }

    @Test
    void getWithDBElement() {
        Assertions.assertSame(new User(2, "b"), cache.get(2));
    }

    @Test
    void addNewUser() {
        User newUser = new User(10, "ten");
        cache.add(newUser);
        printUsers();
        Assertions.assertEquals(5, cache.cacheSize());
    }

    private void printUsers() {
        cache.getAllUsers().forEach(System.out::println);
    }

    @Test
    void remove() {
        cache.remove(3);
        printUsers();
        Assertions.assertEquals(4, cache.cacheSize());
    }
}
