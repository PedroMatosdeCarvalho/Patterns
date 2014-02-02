package state;

public class Trabalhando implements Beijinhos {

	@Override
	public void darBeijinhos(StateContext context) {
		System.out.println(this.getClass().getSimpleName() + ":: Nao ha beijinhos para ninguem!");
		
		context.setState(new Jantando());
	}

}
