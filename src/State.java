import java.util.HashMap;

public class State {

    private int stateID ;
    boolean isFinal ;
    boolean isStart ;
    private HashMap<Character, Integer> transitions = new HashMap<Character, Integer>() ;

    public State(int ID) {
        this.stateID = ID ;
    }

    public void setTransitions(Character[] alphabet, int[] transList) {
        for(int i = 0 ; i < alphabet.length ; i ++) {
            transitions.put(alphabet[i], transList[i]) ;
        }
    }

    public int getStateID() { return stateID; }

    public void setStateID(int stateID) { this.stateID = stateID; }

    public boolean isFinal() { return isFinal; }

    public void setFinal(boolean aFinal) { isFinal = aFinal; }

    public HashMap<Character, Integer> getTransitions() { return transitions; }

    public void setTransitions(HashMap<Character, Integer> transitions) { this.transitions = transitions; }

    public boolean isStart() { return isStart; }

    public void setStart(boolean start) { isStart = start; }
}
