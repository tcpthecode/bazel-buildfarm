// Copyright 2020 The Bazel Authors. All rights reserved.
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

package build.buildfarm.common;

///
/// @class   CasIndexResults
/// @brief   The result of a worker de-registering itself from CAS entries.
/// @details This will remove the worker from CAS indexes, and in some cases,
///          remove the CAS key.
///
public class CasIndexResults {

  ///
  /// @field   removedHosts
  /// @brief   The number of CAS entries the worker was removed from.
  /// @details This indicates how much CAS data the shard new the worker had.
  ///
  public int removedHosts = 0;

  ///
  /// @field   removedKeys
  /// @brief   The number of CAS entries removed due to loss of worker.
  /// @details This indicates how many CAS entries were held only by the
  ///          removed worker.
  ///
  public int removedKeys = 0;

  ///
  /// @field   totalKeys
  /// @brief   The total number of keys processed.
  /// @details A fraction can be made with removed keys to see the total
  ///          percentage of CAS lost.
  ///
  public int totalKeys = 0;
}