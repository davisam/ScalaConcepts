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

import org.scalatest.FunSuite

class FizzBuzzSuite extends FunSuite {
  val numberFizz = 3
  val number = 4
  val numberBuzz = 5
  val numberFizzBuzz = 15

  test(s"$numberFizz should be Fizz") {
    assert(FizzBuzz.isFizz(numberFizz))
  }
  test(s"$numberFizz should not be Buzz") {
    assert(!FizzBuzz.isBuzz(numberFizz))
  }
  test(s"$numberFizz should not be FizzBuzz") {
    assert(!FizzBuzz.isFizzBuzz(numberFizz))
  }
  test(s"$numberBuzz should not be Fizz") {
    assert(!FizzBuzz.isFizz(numberBuzz))
  }
  test(s"$numberBuzz should be Buzz") {
    assert(FizzBuzz.isBuzz(numberBuzz))
  }
  test(s"$numberBuzz should not be FizzBuzz") {
    assert(!FizzBuzz.isFizzBuzz(numberBuzz))
  }
  test(s"$numberFizzBuzz should be Fizz") {
    assert(FizzBuzz.isFizz(numberFizzBuzz))
  }
  test(s"$numberFizzBuzz should be Buzz") {
    assert(FizzBuzz.isBuzz(numberFizzBuzz))
  }
  test(s"$numberFizzBuzz should be FizzBuzz") {
    assert(FizzBuzz.isFizzBuzz(numberFizzBuzz))
  }
  test(s"$number should not be Fizz") {
    assert(!FizzBuzz.isFizz(number))
  }
  test(s"$number should not be Buzz") {
    assert(!FizzBuzz.isBuzz(number))
  }
  test(s"$number should not be FizzBuzz") {
    assert(!FizzBuzz.isFizzBuzz(number))
  }
}
