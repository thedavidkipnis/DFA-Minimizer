/*
DAVID KIPNIS
October 30 2020
*/

/*
Given a deterministic finite automaton described by a transitions table, the algorithm computes and returns a minimized DFA
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    //TODO: create file parses to fill in fields

    private static File input ;
    public Scanner fileReader = new Scanner(input) ;

    private static int numStates = 5 ;
    private static Character[] alphabet = {'M', 'R', 'S', 'B'} ;
    private static State[] states = new State[numStates];
    private static int[][] transitions = {{2, 1, 1, 1},{1, 2, 3, 2},{1, 3, 3, 4},{1, 5, 4, 4},{1, 5, 5, 4}} ;

    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) {

        input = new File(args[0]) ;

        initStates(numStates, states, alphabet, transitions) ;

        TransitionTable TT = new TransitionTable(alphabet, states) ;

        TT.printTable();
    }

    public static void initStates(int numStates, State[] states, Character[] alphabet, int[][] transList) {
        for (int i = 0; i < numStates; i++) {
            states[i] = new State(i) ;
            states[i].setTransitions(alphabet, transList[i]) ;
        }
    }
}
