package org.fogl;

import org.fogl.automat.DEA2Automat;
import org.fogl.automat.DEAAutomat;
import org.fogl.constants.DEAColors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Heute programmieren wird einen Automaten");

        System.out.printf(DEAColors.ANSI_GREEN + "Ausdruck ist %s.\n" + DEAColors.ANSI_RESET, DEAAutomat.DEA("ab")? "korrekt" : "nicht korrekt");
        System.out.printf("Ausdruck ist %s.\n", DEAAutomat.DEA("b")? "korrekt" : "nicht korrekt");
        System.out.printf("Ausdruck ist %s.\n", DEAAutomat.DEA("abd")? "korrekt" : "nicht korrekt");

        System.out.printf(DEAColors.ANSI_GREEN + "Ausdruck ist %s.\n" + DEAColors.ANSI_RESET, DEA2Automat.DEA("135652")? "korrekt" : "nicht korrekt");
        System.out.printf("Ausdruck ist %s.\n", DEA2Automat.DEA("92839")? "korrekt" : "nicht korrekt");
        System.out.printf("Ausdruck ist %s.\n", DEA2Automat.DEA("23")? "korrekt" : "nicht korrekt");
    }
}
