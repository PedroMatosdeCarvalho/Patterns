package state;

public class Jantando implements Beijinhos {

	@Override
	public void darBeijinhos(StateContext context) {
		System.out.println(this.getClass().getSimpleName() + ":: Ao jantar h� mil beijinhos para partilhar...");
		context.setState(new Dormindo());
	}

}
