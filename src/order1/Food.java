package order1;

public class Food extends Shop {

	@Override
	public Goods createGoods() {
		Goods ezgo = new Ezgo();
		return ezgo;
	}

}
