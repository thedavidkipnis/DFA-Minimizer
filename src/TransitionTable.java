public class TransitionTable {

    private int[][] transitions ;
    private static State[] states ;
    private static Character[] alphabet ;

    public TransitionTable(Character[] alphabet, State[] states) {
        this.setAlphabet(alphabet);
        this.setStates(states);
        this.transitions = new int[alphabet.length][states.length] ;
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < states.length ; j++) {
                transitions[i][j] = states[j].getTransitions().get(alphabet[i]) ;
            }
        }
    }

    public void printTable() {
        System.out.print("     ") ;
        for (int i = 0; i < alphabet.length; i++) {
            System.out.printf("%c         ", alphabet[i]) ;
        }
        System.out.println() ;
        for (int i = 0; i < states.length ; i++) {
            System.out.printf("%d    ", states[i].getStateID());
            for (int j = 0; j < alphabet.length; j++) {
                System.out.printf("%d         ", transitions[j][i]);
            }
            System.out.println() ;
        }
    }

    public static State[] getStates() { return states; }

    public static void setStates(State[] states) { TransitionTable.states = states; }

    public static Character[] getAlphabet() { return alphabet; }

    public static void setAlphabet(Character[] alphabet) { TransitionTable.alphabet = alphabet; }
}
