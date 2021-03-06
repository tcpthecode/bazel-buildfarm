// Copyright 2017 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buildfarm.instance.memory;

import build.buildfarm.instance.Instance.MatchListener;
import com.google.common.collect.SetMultimap;

public class Worker {
  private final SetMultimap<String, String> provisions;
  private final MatchListener listener;

  public Worker(SetMultimap<String, String> provisions, MatchListener listener) {
    this.provisions = provisions;
    this.listener = listener;
  }

  public SetMultimap<String, String> getProvisions() {
    return provisions;
  }

  public MatchListener getListener() {
    return listener;
  }
}
