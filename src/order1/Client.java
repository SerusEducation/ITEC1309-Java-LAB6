package order1;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		Shop snack = new Snack();
		Goods lay = snack.createGoods();
		
		Shop cocacola = new Cocacola();
		Goods coke = cocacola.createGoods();
		
		Shop food = new Food();
		Goods ezgo = food.createGoods();
		
		List<Goods> goodsList = new ArrayList<Goods>();
		goodsList.add(lay);
		goodsList.add(coke);
		goodsList.add(ezgo);
	}

}
