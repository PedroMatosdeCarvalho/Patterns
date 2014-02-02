package state;

public class Dormindo implements Beijinhos {
	
	@Override
	public void darBeijinhos(StateContext context){
		System.out.println(this.getClass().getSimpleName() + ":: Amor, estou a dormiiiiir, mais 5min =P");
		context.setState(new Acordado());			
	}

}
