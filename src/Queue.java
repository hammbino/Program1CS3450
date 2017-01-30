import java.util.Collection;
import java.util.List;

/**
 * Program1
 * Created by jeffreyhammond on 1/29/17.
 */
public class Queue  {
    private List list;

    Queue(List list) {
        this.list = list;
    }

    void push(Object object) {
        list.add(object);
    }

    Object peek() {
        return list.get(0);
    }

    Object pop() {
        return list.remove(0);
    }

    int length() {
        return list.size();
    }

    void clear() {

    }

    void changeStorage(List list2) {
        list2.clear();
        while (this.list.size() > 0) {
            list2.add(list.remove(0));
        }
        this.list = list2;
    }
}
