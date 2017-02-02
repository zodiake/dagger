/*
 * Copyright (C) 2016 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.binds;

import dagger.Component;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import javax.inject.Singleton;
import test.SomeQualifier;

@Singleton
@Component(modules = SimpleBindingModule.class)
public interface TestComponent {
  Object object();

  @SomeQualifier
  Object reusableObject();

  Foo<String> fooOfStrings();

  Foo<Object> fooOfObjects();

  @SomeQualifier
  Foo<String> qualifiedFooOfStrings();

  Foo<Integer> fooOfIntegers();

  Set<Foo<? extends Number>> foosOfNumbers();

  Set<Object> objects();

  Set<CharSequence> charSequences();

  Map<Integer, Object> integerObjectMap();

  Map<Integer, Provider<Object>> integerProviderOfObjectMap();

  @SomeQualifier Map<Integer, Object> qualifiedIntegerObjectMap();

  @SomeQualifier int uniquePrimitive();

  Set<Integer> primitiveSet();

  Map<Integer, Integer> primitiveValueMap();
}
