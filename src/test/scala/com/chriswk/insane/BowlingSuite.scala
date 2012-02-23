package com.chriswk.insane

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class BowlingSpec extends FlatSpec with ShouldMatchers {
    
    "A bowling game" should "score an empty game as 0" in {
        val game = new Bowling
        game.score should equal (0)
    }
    
}
