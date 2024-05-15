package SingletonPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;
    // 객체를 private static으로 선언
    private static Deck instance;
    public static Deck getInstance(){
        return instance;
    }
    // 생성자를 private으로 변경
    private Deck(){
        cards = new ArrayList<Card>();
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};
        for(Suit suit: suits) {
            for(int i = 2; i <= 14; i++) {
                cards.add(new Card(suit, i));
            }
        }
        Collections.shuffle(cards, new Random());
    }

    public void print() {
        for (Card card: cards) {
            card.print();
        }
    }

    // 객체 인스턴스를 하나만 생성
    // 객체가 있는지 확인하고 없다면 만들고 반환
    // 있다면 이미 생성된 객체 반환
    public static Deck getDeck(){
        if (instance == null){
            instance = new Deck();
        }
        return getInstance();
    }
}
