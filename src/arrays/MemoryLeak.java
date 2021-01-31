package arrays;

import java.util.HashSet;
import java.util.Set;

public class MemoryLeak {

    public static void main(String[] args) {
        Set map = new HashSet();
        map.add(new BadKey("key"));
        map.add(new BadKey("key"));
        map.add(new BadKey("key"));

        map.remove(new BadKey("key"));

        System.out.println("size "+map.size());

        System.out.println(new BadKey("key").hashCode());

        System.out.println(new BadKey("key").hashCode());
    }
}

class BadKey {
    public final String key;

    public BadKey(String key) {
        this.key = key;
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BadKey badKey = (BadKey) o;
        return key.equals(badKey.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

     */
}
