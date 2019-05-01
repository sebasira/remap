package com.remondis.remap2.api;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface Mapper<S, D> {

  /**
   * Performs the mapping from the source to destination type.
   *
   * @param source The source object to map to a new destination object.
   * @return Returns a newly created destination object.
   */
  D map(S source);

  /**
   * Performs the mapping from the source into a specified destination object while overwriting fields in the
   * destination object if affected by the mapping configuration.
   *
   * @param source The source object to map to a new destination object.
   * @param destination The destination object to map into. Field affected by the mapping will be overwritten.
   * @return Returns the specified destination object.
   */
  D map(S source, D destination);

  /**
   * Performs the mapping for the specified {@link Collection}.
   *
   * @param source The source collection to map to a new collection of destination objects.
   * @return Returns a newly created collection of destination objects. The type of the resulting collection is either
   *         {@link List} or {@link Set} depending on the specified type.
   */
  Collection<D> map(Collection<? extends S> source);

  /**
   * Performs the mapping for the specified {@link List}.
   *
   * @param source The source collection to map to a new collection of destination objects.
   * @return Returns a newly created list of destination objects.
   */
  List<D> map(List<? extends S> source);

  /**
   * Performs the mapping for the specified {@link Set}.
   *
   * @param source The source collection to map to a new collection of destination objects.
   * @return Returns a newly set list of destination objects.
   */
  Set<D> map(Set<? extends S> source);

  /**
   * Performs the mapping for the elements provided by the specified {@link Iterable} .
   *
   * @param iterable The source iterable to be mapped to a new {@link List} of destination objects.
   * @return Returns a newly set list of destination objects.
   */
  List<D> map(Iterable<? extends S> iterable);

  /**
   * Performs the mapping from the source to destination type if the source value is <b>non-null</b>. If the source
   * value is <code>null</code> this method returns <code>null</code>.
   *
   * @param source The source object to map to a new destination object. May be <code>null</code>.
   * @return Returns a newly created destination object or <code>null</code> if the input value is <code>null</code>.
   */
  D mapOptional(S source);

  /**
   * Performs the mapping from the source to destination type if the source value is <b>non-null</b>. If the source
   * value is <code>null</code> this method returns the specified default value.
   *
   * @param source The source object to map to a new destination object. May be <code>null</code>.
   * @param defaultValue The default value to return if the input is <code>null</code>.
   * @return Returns a newly created destination object or the default value if the input value is <code>null</code>.
   */
  D mapOrDefault(S source, D defaultValue);

}