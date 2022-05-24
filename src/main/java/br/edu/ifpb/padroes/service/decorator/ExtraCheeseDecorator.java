package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheeseDecorator  extends BaseDecorator{

    private Float aumento = 1.10f;

    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * aumento;
    }

    @Override
    public String getName() {
        return super.getName() + " (extra cheese)";
    }

}
