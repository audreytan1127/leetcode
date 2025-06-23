package leet.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {
    public int[] asteroidsColliding(int[] asteroids){
        //initialize deque to store asteroids that were not destroyed
        Deque<Integer> asteroidDeck = new ArrayDeque<Integer>();
        //for each asteroid in the asteroids array
        for(int asteroid : asteroids) {
            //if the current asteroid is moving right(positive)
            if (asteroid > 0) {
                //offerLast asteroid into deck
                asteroidDeck.offerLast(asteroid);
            }
            //while the deck is adding right moving asteroids
            //and last value in deck is less than positive value of current left moving asteroid
            while (!asteroidDeck.isEmpty() && asteroidDeck.peekLast() > 0 && asteroidDeck.peekLast() < -asteroid) {
                //then pollLast value of deck removing the smaller asteroid
                asteroidDeck.pollLast();
            }
            //if the stack is not empty and the last value of deck is equal to positive value of current asteroid
            if (!asteroidDeck.isEmpty() && asteroidDeck.peekLast() == -asteroid) {
                //then both asteroids get destroyed
                asteroidDeck.pollLast();
            }
            //else if there are no more asteroids in the deck or the last asteroid is left moving

            else if (asteroidDeck.isEmpty() || asteroidDeck.peekLast() < 0) {
                //add current asteroid to deck
                asteroidDeck.offerLast(asteroid);
            }
        }
        //return the asteroid deck thru stream - map into int array
        return asteroidDeck.stream().mapToInt(Integer::valueOf).toArray();
    }
}
