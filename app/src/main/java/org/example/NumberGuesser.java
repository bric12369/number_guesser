package org.example;

public class NumberGuesser {
    Integer number;

    NumberGuesser(Integer number) {
        this.number = number;
    }

    public String guess(Integer guess) {
        String res = "Correct!";
        if (guess < this.number) {
            res = "higher";
        } else if (guess > this.number) {
            res = "lower";
        }
        return res;
    }
}
