package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCouponDecorator extends BaseDecorator{

    private Float desconto = 0.25f;

    public DiscountCouponDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice() {
        return  super.getPrice() * desconto;
    }

}
