//package AdapterPattern2;
//
//public class JawtList extend JScrollPane implements awtList, ListSelectionListener {
//    private JList listWindow;
//    private JListData listContents;
//    public JawtList(int rows) {
//        listContents = new JListData();
//        listWindow = new JList(listContents);
//        listWindow.setPrototypeCellValue("Abcdefg Hijklmnop");
//        getViewPort().add(listWindow);
//    }
//    public void add(String s) {
//        listContents.addElement(s);
//    }
//    public void clear() {
//        listContents.clear();
//    }
//    public void remove(String s) {
//        listContents.removeElement(s);
//    }
//    public String[] getSelectedItems() {
//        return adaptee.getSelectedItems();
//    }
//}
