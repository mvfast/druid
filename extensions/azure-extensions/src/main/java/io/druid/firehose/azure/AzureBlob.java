/*
 * Druid - a distributed column store.
 * Copyright 2012 - 2015 Metamarkets Group Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.druid.firehose.azure;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;


public class AzureBlob {
  @JsonProperty
  @NotNull
  private String container = null;

  @JsonProperty
  @NotNull
  private String path = null;

  public AzureBlob() {
  }

  public AzureBlob(String container, String path) {
    this.container = container;
    this.path = path;
  }

  public String getContainer() {
    return container;
  }

  public String getPath() {
    return path;
  }
}
