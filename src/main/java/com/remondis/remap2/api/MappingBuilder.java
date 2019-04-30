package com.remondis.remap2.api;

import com.remondis.remap.Mapping;
import com.remondis.remap.TypeMapping;

public interface MappingBuilder<S, D> {

  public MappingBuilder<S, D> use(Mapping<?, ?> mapper);

  public MappingBuilder<S, D> use(TypeMapping<?, ?> mapper);

}
