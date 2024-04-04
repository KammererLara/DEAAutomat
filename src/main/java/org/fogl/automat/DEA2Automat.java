package org.fogl.automat;

import org.fogl.constants.DEA2Transitions;
import org.fogl.constants.DEA2States;
import org.fogl.constants.DEA2Transitions;

public class DEA2Automat {

    public static boolean DEA(String input){
        var state = DEA2States.STATE_START;
        for (char transition : input.toCharArray()) {
            switch (state){
                case DEA2States.STATE_S -> {
                    if (DEA2Transitions.INPUT_02468.contains(transition))
                        state = DEA2States.STATE_B;
                    else if (DEA2Transitions.INPUT_13579.contains(transition))
                        state = DEA2States.STATE_A;
                    else
                        state = DEA2States.STATE_INVALID;
                }
                case DEA2States.STATE_A, DEA2States.STATE_B -> {
                    if (DEA2Transitions.INPUT_02468.contains(transition))
                        state = DEA2States.STATE_B;
                    else if (DEA2Transitions.INPUT_13579.contains(transition))
                        state = DEA2States.STATE_S;
                    else
                        state = DEA2States.STATE_INVALID;
                }
            }
        }
        return state == DEA2States.STATE_END;
    }
}
