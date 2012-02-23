package com.chriswk.insane

class FrameSequence {
    public FrameSequence(n) {
        def firstFrameInSequence = createSequenceOfLength(n)
        frames = getAllFramesInSequence(firstFrameInSequence)
    }    

    public populateWith(rolls) {
        populateWith(rolls.iterator())         
    }

    public score() { frames.sum{it.score()}}
    
    private getAllFramesInSequence(firstFrame) {
        def frames = [firstFrame]
        def frame = firstFrame
        while(!frame.isLast()) {
            frame = frame.nextFrame()
            frames << frame
        }
        return frames
    }
    private roll(int roll) {
        for(frame in frames) {
            if (frame.isIncomplete()) {
                frame.add(roll)
                break
            }
        }
    }
    private populateWith(Iterator rolls) {
        frames.each {
            populate(it, with(rolls))
        }
    }

    private populate(frame, rolls) {
        while (frame.isIncomplete()) {
            frame.add(rolls.next())
        }
    }

    private frames
    private static createSequenceOfLength(n){ n == 1 ? new Frame() : new Frame(createSequenceOfLength(n-1))}
    private with(rolls){rolls}
    private ofLength(n){n}
}