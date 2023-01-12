package order2;

public class Market {

	public static void main(String[] args) {
		
		Logistic roadLogistic = new RoadLogistic();
		Transport truck = roadLogistic.createTransport();
		
		Logistic seaLogistic = new SeaLogistic();
		Transport ship = seaLogistic.createTransport();

	}

}
