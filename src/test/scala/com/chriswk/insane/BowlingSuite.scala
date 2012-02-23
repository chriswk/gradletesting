package com.chriswk.insane

import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter
import org.scalatest.matchers.ShouldMatchers

class BowlingSpec extends FunSpec with ShouldMatchers with BeforeAndAfter {
    
    var game : Bowling = _

    before {
        game = new Bowling
    }

    describe("A bowling game") {
        it("should score an empty game as 0") {
            game.score should equal (0)
        }

        it("should score all 1s as 20") {
            for(i <- 1 to 20) {
                game.roll(1)
            }
            game.score should equal (20)
        }

        it("should score 9 and spare as 190") {
            for(i <- 1 to 10) {
                game.roll(9)
                game.roll(1)
            }
            game.roll(9)
            game.score should equal(199)
        }
    }


    
}
