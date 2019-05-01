package com.remondis.remap2.api;

import com.remondis.remap.TypedSelector;

public interface MapThisToBuilder<S, D> {

  public <RD> MapThisApplyingBuilder<S, D, RD> to(TypedSelector<RD, D> destinationSelector);

}
