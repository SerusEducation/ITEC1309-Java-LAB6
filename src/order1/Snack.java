package order1;

public class Snack extends Shop {

	@Override
	public Goods createGoods() {
		Goods lay = new Lay();
		return lay;
	}

}
