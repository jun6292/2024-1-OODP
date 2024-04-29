package AdapterPattern2;

public interface JList {
    void add(String item);
    void clear();
    void remove(int position);
    String[] getSelectedItems();
}
