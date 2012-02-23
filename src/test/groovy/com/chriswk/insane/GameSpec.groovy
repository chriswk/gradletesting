package com.chriswk.insane

import spock.lang.*

class GameSpec extends Specification {
    def "it should score an empty game as zero"() {
        expect:        
        game.score() == 15

        where:
        game = new Bowling()

    }
}