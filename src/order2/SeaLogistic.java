package order2;

public class SeaLogistic extends Logistic {

	@Override
	public Transport createTransport() {
		return new Ship();
	}

}
