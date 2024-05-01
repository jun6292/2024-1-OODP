package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Entry {
    private List<Entry> entries = new ArrayList<Entry>();
    private String name;
    private int numberOfFiles = 0;

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        for (int i = 0; i < numberOfFiles; i++) {
            size += entries.get(i).getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        if (numberOfFiles >= entries.size()) {
            throw new RuntimeException("directory is full");
        }
        entries.set(numberOfFiles++, entry);
        return this;
    }

    public Entry add(File file) {
        return add((Entry) file);
    }

    public void printList() {
        printList("");
    }

    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (int i = 0; i < numberOfFiles; i++) {
            entries.get(i).printList(prefix + "/" + name);
        }
    }
}
