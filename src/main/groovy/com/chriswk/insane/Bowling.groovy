package com.chriswk.insane

class Bowling {
    private frames
    private framesInGame
    
    public Bowling() {
        framesInGame = 10
        frames = new FrameSequence(framesInGame)
    }
    
    public Bowling(int framesInGame) {
        this.framesInGame = framesInGame
        frames = new FrameSequence(framesInGame)
    }    

    public roll(int roll) {
        frames.roll(roll)
    }
    public roll(Iterator rolls) {
        frames.populateWith(rolls)
    }

    public score() {
        frames.score()
    }
}