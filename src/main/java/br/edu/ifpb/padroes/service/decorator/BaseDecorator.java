package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class BaseDecorator implements Pizza {

    private Pizza wrappee;

    public BaseDecorator(Pizza pizza){
        this.wrappee = pizza;
    }

    @Override
    public Float getPrice() {
        return wrappee.getPrice();
    }

    @Override
    public String getName() {
        return wrappee.getName();
    }
}
