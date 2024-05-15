package SingletonPattern;

public class SingletonEx {
    public static void main(String[] args) {
        Deck deck = Deck.getDeck();
        deck.print();
    }
}
