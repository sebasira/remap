package com.remondis.remap2.api;

import java.util.function.Supplier;

import com.remondis.remap.Mapping;

public interface SetBuilder<S, D, RD> {
  public Mapping<S, D> with(Supplier<RD> valueSupplier);

  public Mapping<S, D> with(RD value);
}
