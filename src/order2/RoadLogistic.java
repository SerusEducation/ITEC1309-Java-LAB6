package order2;

public class RoadLogistic extends Logistic {

	@Override
	public Transport createTransport() {
		return new Truck();
	}

}
