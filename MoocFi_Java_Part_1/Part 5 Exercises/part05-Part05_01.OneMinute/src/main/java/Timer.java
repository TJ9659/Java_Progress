/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class Timer {

    ClockHand seconds = new ClockHand(60);
    ClockHand hundrent = new ClockHand(100);

    public Timer() {

    }

    public void advance() {
        hundrent.advance();
        if (hundrent.value() + 1 == 100) {
            seconds.advance();
        }
    }

    public String toString() {

        return this.seconds + ":" + this.hundrent;
    }
}
