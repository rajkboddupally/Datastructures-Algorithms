package queue;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class LRUCache {
    private final Deque<Integer> cacheList;
    private Map<Integer, User> cache;
    private final List<User> userList;
    private final int cacheLimit;


    public LRUCache(int cacheLimit) {
        this.cacheList = new LinkedList<>();
        this.cache = new HashMap<>();
        this.userList = new ArrayList<>();
        this.cacheLimit = cacheLimit;
        init();
    }

    private void init() {
        userList.add(new User(1, "a"));
        userList.add(new User(2, "b"));
        userList.add(new User(3, "c"));
        userList.add(new User(4, "d"));
        userList.add(new User(5, "e"));
        cache = userList.stream().collect(Collectors.toMap(User::getId, Function.identity()));
        userList.forEach((user -> cacheList.add(user.getId())));
    }

    public User get(Integer id) {
        if (!cache.containsKey(id)) {
            updateCache();
            User user = getFromDB(id);
            cache.put(id, user);
            cacheList.add(id);
            return user;
        }
        cacheList.remove(id);
        cacheList.add(id);
        return cache.get(id);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(cache.values());
    }

    public User add(User user) {
        updateCache();
        int id = user.getId();
        cacheList.add(id);
        return cache.put(id, user);
    }

    public void remove(Integer id) {
        if (cache.remove(id) == null)
            throw new NoSuchElementException("User do not exist to remove");
        cacheList.remove(id);
    }

    private void updateCache() {
        int cacheSize = cacheList.size();
        while (cacheSize > cacheLimit - 1) {
            int id = cacheList.remove();
            cache.remove(id);
            cacheSize--;
        }
    }

    private User getFromDB(Integer id) {
        Optional<User> user = userList.stream().filter((u) -> id.equals(u.getId())).findFirst();
        return user.orElseThrow(() -> new NoSuchElementException("User do not exist " + id));
    }

    public int cacheSize() {
        return this.cache.size();
    }
}

class User {
    private final Integer id;
    private final String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && name.equals(user.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
