package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {

    private PizzaHotService pizzaHotService;
    private List<PizzaHotPizza> cachePizzaHotPizza = new ArrayList<PizzaHotPizza>();

    public PizzaHotServiceProxy(){
        this.pizzaHotService = new PizzaHotServiceImpl();
    }

    @Override
    public List<PizzaHotPizza> getPizzas() {
        // TODO - implementar proxy
        if (cachePizzaHotPizza.isEmpty()){
            cachePizzaHotPizza = pizzaHotService.getPizzas();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePizzaHotPizza;
    }

    public void reset(){
        cachePizzaHotPizza.clear();
    }
}
