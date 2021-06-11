package ru.job4j.stream;

import java.util.stream.Stream;

public class Deck {
    public enum Suit {
        DIAMONDS,
        HEARTS,
        SPADES,
        CLUBS
    }

    public enum Value {
        V_6,
        V_7,
        V_8
    }

    public class Card {
        private Suit suit;
        private Value value;

        public Card(Suit suit, Value value) {
            this.suit = suit;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> value + " " + suit))
                .forEach(System.out::println);
    }
}
