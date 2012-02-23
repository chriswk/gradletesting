package com.chriswk.insane

import org.scalatest.FunSpec

class BowlingSpec extends FunSpec {
    
    describe("A Bowling Game") {

        it("should score a game with no rolls as zero") {
            val b = new Bowling
            assert(b.score() === 0)
        }
    }
}
