package com.remondis.remap2.api;

public interface MapApplyBuilder<S, D> extends MappingBuilder<S, D> {

  public MappingBuilder<S, D> skipWhenNull();

}
