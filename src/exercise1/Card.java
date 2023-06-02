package exercise1;
import java.util.*;
/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Suhrad Trambadiya
 
 */
public class Card {

   
   public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private int value;
    private String suit;

    public Card() {
        this.value = 0;
        this.suit = "";
    }

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Card card = (Card) obj;
        return value == card.value && suit.equals(card.suit);
    }
    
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(13) + 1; // Random number from 1 to 13
    }

    public static int generateRandomNumber(int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound);
    }
}