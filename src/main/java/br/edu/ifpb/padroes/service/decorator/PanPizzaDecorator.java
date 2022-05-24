package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanPizzaDecorator extends BaseDecorator{

    private Float aumento = 1.15f;

    public PanPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * aumento;
    }

    @Override
    public String getName() {
        return super.getName() + " (pan pizza)" ;
    }

}
