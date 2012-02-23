package com.chriswk.insane

import org.scalatest.FunSpec

class BowlingSpec extends FunSpec {
    
    describe("A Bowling Game") {

        it("should score a game with no rolls as zero") {
            val b = new Bowling
            assert(b.score === 0)
        }

        it("should score a game of all ones as 20") {
            val b = new Bowling
            for(i <- 1 to 20) {
                b.roll(1)
            }
            assert(b.score === 20)
        }
    }
}
