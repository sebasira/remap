package com.remondis.remap2.api;

import java.util.function.Function;

public interface MapThisApplyingBuilder<S, D, RD> {

  public MappingBuilder<S, D> applying(Function<S, RD> transformation);

}
