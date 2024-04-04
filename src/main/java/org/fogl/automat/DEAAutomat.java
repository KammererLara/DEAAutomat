package org.fogl.automat;

import org.fogl.constants.DEAStates;
import org.fogl.constants.DEATransitions;

public class DEAAutomat {

    public static boolean DEA(String input){
        var state = DEAStates.STATE_START;
        for (char transition : input.toCharArray()) {
            switch (state){
                case DEAStates.STATE_S -> {
                    switch (transition) {
                        case DEATransitions.INPUT_A -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_B -> state = DEAStates.STATE_C;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_A -> {
                    switch (transition) {
                        case DEATransitions.INPUT_B -> state = DEAStates.STATE_B;
                        case DEATransitions.INPUT_D -> state = DEAStates.STATE_A;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_B -> state = DEAStates.STATE_INVALID;
                case DEAStates.STATE_C -> {
                    switch (transition) {
                        case DEATransitions.INPUT_C -> state = DEAStates.STATE_C;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
            }
        }
        return state == DEAStates.STATE_END1 || state == DEAStates.STATE_END2;
    }
}
