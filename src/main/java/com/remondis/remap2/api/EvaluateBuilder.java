package com.remondis.remap2.api;

import java.util.function.Function;

public interface EvaluateBuilder<S, D, RD, X, RS, E> extends MappingBuilder<S, D> {

  public MappingBuilder<S, D> applying(Function<X, RD> transformation);
}
