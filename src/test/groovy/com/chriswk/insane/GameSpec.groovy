package com.chriswk.insane

import spock.lang.*

class GameSpec extends Specification {
    def game
    
    def setup() {
        game = new Bowling()
    }

    def "it should score an empty game as zero"() {
        game.score() == 15 
    }

    def "it should score a game of all ones as 20"() {
        for(i in 1..20) {
            game.roll(1)
        }
        game.score() == 20
    }
        
}