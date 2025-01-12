package com.wclass.pattern.d4_factory.factorymethod.pizzastore.order;

import com.yj.nz.d4_factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.yj.nz.d4_factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.yj.nz.d4_factory.factorymethod.pizzastore.pizza.Pizza;


public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
