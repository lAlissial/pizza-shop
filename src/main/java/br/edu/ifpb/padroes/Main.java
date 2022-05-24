package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.service.PizzaShopService;
import br.edu.ifpb.padroes.service.decorator.*;

public class Main {

    public static void main(String[] args) {

        PizzaShopService pizzaShopService = new PizzaShopService();

        System.out.println("Pizzas - menu");

        // TODO - implementar adapter para juntar as pizzas da PizzaHot e Damenos em um único conjunto
        /*for (PizzaHotPizza pizza : pizzaShopService.getPizzasPizzaHot()) {
            System.out.println(String.format("%s - %.2f", pizza.getTopping(), pizza.getPrice()));
        }
        for (DamenosPizza pizza : pizzaShopService.getPizzasDamenos()) {
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getCost()));
        }*/
        for (Pizza pizza : pizzaShopService.getPizzas()) {
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getPrice()));
        }


        Pizza pizza = new PizzaShopPizza("pepperoni", 55.0f);

        // TODO - implementar padrão decorator para só precisar passar o objeto pizza

        BaseDecorator pizzaCupomDesconto = new DiscountCouponDecorator(pizza);
        BaseDecorator pizzaQueijoExtra = new ExtraCheeseDecorator(pizzaCupomDesconto);
        BaseDecorator pizzaBordaRecheada = new StuffedCrustDecorator(pizzaQueijoExtra);

        pizzaShopService.orderPizza(pizzaBordaRecheada);
        
    }

}
