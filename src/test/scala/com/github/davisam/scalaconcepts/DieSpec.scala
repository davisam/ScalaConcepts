/*
 * Copyright 2018 David Arroyo Mancebo <davisam@protonmail.com>
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

package com.github.davisam.scalaconcepts

import org.scalatest.FlatSpec

class DieSpec extends FlatSpec {
  "Roll a die of six faces" should "score a number between one and six" in {
    val Faces: Int = 6
    assert(List.range(1, Faces + 1).contains(new Die(Faces).roll))
  }
}
