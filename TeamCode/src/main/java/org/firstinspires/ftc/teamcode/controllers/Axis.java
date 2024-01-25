package org.firstinspires.ftc.teamcode.controllers;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.constants.ControllerConstants;

/**
 * A Controller Axis
 */
public class Axis implements ControllerConstants {
    private final ElapsedTime timer;
    private double value;

    /**
     * Instantiates the Button
     */
    public Axis() {
        timer = new ElapsedTime();
    }

    /**
     * The Axis's current value
     *
     * @return the current value
     */
    public double value() {
        return value;
    }

    /**
     * Whether the value has been zero long enough
     *
     * @return whether the timer is under the wait time
     */
    public boolean hasBeenZero() {
        return timer.time() >= WAIT_TIME;
    }

    /**
     * The Axis as a String
     *
     * @return whether the Axis is pressed
     */
    @NonNull
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Updates the Axis
     *
     * @param newValue the new value
     */
    public void update(double newValue) {
        if(Math.abs(newValue) >= AXIS_DEADBAND) {
            value = newValue;
            timer.reset();
        }
        else
            value = 0.0;
    }
}