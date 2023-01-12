package order1;

public class Cocacola extends Shop {

	@Override
	public Goods createGoods() {
		Goods coke = new Coke();
		return coke;
	}

}
