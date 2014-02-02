package state;

public class Acordado implements Beijinhos {

	private int count = 0;
	@Override
	public void darBeijinhos(StateContext context) {
		System.out.println(this.getClass().getSimpleName() + ":: hmmmm, que bons beijinhos :D :D");// TODO Auto-generated method stub
		if(++count > 3)
			context.setState(new Trabalhando());
	}

}
