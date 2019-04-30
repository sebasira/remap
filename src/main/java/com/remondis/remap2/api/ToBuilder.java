package com.remondis.remap2.api;

public interface ToBuilder<S> {

  public <D> MappingBuilder<S, D> to(D d);

}
