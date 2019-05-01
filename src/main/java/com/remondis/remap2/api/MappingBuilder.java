package com.remondis.remap2.api;

import com.remondis.remap.FieldSelector;
import com.remondis.remap.Mapping;
import com.remondis.remap.SetBuilder;
import com.remondis.remap.TypeMapping;
import com.remondis.remap.TypedSelector;

public interface MappingBuilder<S, D> {

  public MappingBuilder<S, D> use(Mapping<?, ?> mapper);

  public MappingBuilder<S, D> use(TypeMapping<?, ?> mapper);

  public <RS> MapToBuilder<S, D, RS> map(TypedSelector<RS, S> sourceSelector);

  public <RS> MapCollectionBuilder<S, D, RS> mapCollection(TypedSelector<RS, S> sourceSelector);

  public MapThisToBuilder<S, D> mapThis();

  public <RD> SetBuilder<S, D, RD> set(TypedSelector<RD, D> destinationSelector);

  public MappingBuilder<S, D> omitInSource(FieldSelector<S> sourceSelector);

  public MappingBuilder<S, D> omitInDestination(FieldSelector<D> destinationSelector);

  public MappingBuilder<S, D> omitOthers();

  public MappingBuilder<S, D> omitOthersSource();

  public MappingBuilder<S, D> omitOthersDestination();

  public Mapper<S, D> mapper();

}
