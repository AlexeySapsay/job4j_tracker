package ru.job4j.oop;

/**
 * Far, far away in the galaxy a fairy tail.
 * Lived the Ball and the Hare. They was so dipressed
 * and scared by cruel Wolf and angry Fox.
 * They has  with a lot of trubles and problems with
 * them.
 *
 * And Ball and Hare going to the fairy psyhotherapyst.
 * It solve mental problems with depressions and guilt.
 * They go to gym, then mix fighthing, then buy
 * shootgun and go to not so cruel
 * Wolf and so cute and fluffy Fox.
 */

public class BallStory {
    public static void main(String[] args) {

        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        Fox fox = new Fox();

        ball.run(wolf);
        ball.run(fox);
        hare.hunting(wolf);
        hare.hunting(fox);

        hare.eat(fox);
        ball.eat(wolf);
    }
}
