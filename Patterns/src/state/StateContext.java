package state;

public class StateContext {
	
	private Beijinhos myState;
    /**
     * Standard constructor
     */
StateContext() {
    setState(new Dormindo());
}

    /**
     * Setter method for the state.
     * Normally only called by classes implementing the State interface.
     * @param newState the new state of this context
     */
void setState(final Beijinhos newState) {
    myState = newState;
}

    /**
     * Writer method
     * @param name the name to be written
     */
public void darBeijinhos() {
    myState.darBeijinhos(this);
}



}
