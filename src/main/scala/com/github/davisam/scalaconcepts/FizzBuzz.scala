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

/** Classic programming example to show Fizz buzz numbers.
  *
  * Any number divisible by three is replaced by the word Fizz and any divisible by five by the word Buzz.
  *
  * Numbers divisible by both become FizzBuzz
  */
object FizzBuzz {
  private val Start = 1
  private val End = 100

  /** Calculate the list of FizzBuzz numbers
    * @param start the number to start the list
    * @param end the number to end the list
    * @return the list of Fizz buzz numbers
    */
  def apply(start: Int = this.Start, end: Int = this.End): List[Any] = {
    require(start <= end)
    List
      .range(start, end + 1)
      .map(
        (number) =>
          if (this.isFizzBuzz(number)) {
            "FizzBuzz"
          } else if (this.isFizz(number)) {
            "Fizz"
          } else if (this.isBuzz(number)) {
            "Buzz"
          } else {
            number
          }
      )
  }

  /** Check if a number is Fizz buzz
    * @param number the number to check
    * @return FizzBuzz is the number is divisible by three and five
    */
  def isFizzBuzz(number: Int): Boolean = number % 15 == 0

  /** Check if a number is Fizz
    * @param number the number to check
    * @return Fizz is the number is divisible by three
    */
  def isFizz(number: Int): Boolean = number % 3 == 0

  /** Check if a number is Buzz
    * @param number the number to check
    * @return Buzz is the number is divisible by five
    */
  def isBuzz(number: Int): Boolean = number % 5 == 0
}
