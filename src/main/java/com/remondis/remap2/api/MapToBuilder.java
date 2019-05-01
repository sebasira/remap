package com.remondis.remap2.api;

import com.remondis.remap.TypedSelector;

public interface MapToBuilder<S, D, RS> {

  public <RD> MappingWithBuilder<S, D, RS, RD> to(TypedSelector<RD, D> destinationSelector);

}
