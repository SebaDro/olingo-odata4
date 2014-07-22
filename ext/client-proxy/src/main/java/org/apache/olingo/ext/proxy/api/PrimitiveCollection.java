/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.ext.proxy.api;

import java.io.Serializable;
import java.util.Collection;

public interface PrimitiveCollection<T extends Serializable> extends Collection<T>, Serializable {

  /**
   * Returns all instances.
   *
   * @return all entities
   */
  PrimitiveCollection<T> execute();

  /**
   * Sets the maximum number of results to retrieve (<tt>$top</tt>).
   *
   * @param top maximum number of results to retrieve
   * @return the same query instance.
   * @throws IllegalArgumentException if the argument is negative
   */
  PrimitiveCollection<T> top(int top) throws IllegalArgumentException;

  /**
   * Sets the position of the first result to retrieve (<tt>$skip</tt>).
   *
   * @param skip position of the first result, numbered from 0
   * @return the same query instance.
   * @throws IllegalArgumentException if the argument is negative
   */
  PrimitiveCollection<T> skip(int skip) throws IllegalArgumentException;
}
