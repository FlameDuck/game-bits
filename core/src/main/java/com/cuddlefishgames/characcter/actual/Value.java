package com.cuddlefishgames.characcter.actual;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Value<T extends Facet> {
    private BigInteger spentPoints;
    private final T facet;

    public Value(T facet) {
        this.facet = facet;
        this.spentPoints = BigInteger.ZERO;
    }
}
