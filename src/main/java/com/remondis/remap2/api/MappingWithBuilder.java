package com.remondis.remap2.api;

import java.util.function.Function;

import com.remondis.propertypath.api.PropertyPath;
import com.remondis.remap.Mapping;

public interface MappingWithBuilder<S, D, RS, RD> extends MappingBuilder<S, D> {

  public MapApplyBuilder<S, D> applying(Function<RS, RD> transformation);

  public <E extends Exception> Mapping<S, D> evaluating(PropertyPath<RD, RS, E> propertyPath);

  public <X, E extends Exception> EvaluateBuilder<S, D, RD, X, RS, E> evaluatingAnd(
      PropertyPath<X, RS, E> propertyPath);
}
