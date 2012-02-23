package com.chriswk.insane
class Frame {
    private nextFrame
    private rolls = []

    public Frame() {}
    public Frame(Frame nextFrame) {
        this.nextFrame = nextFrame
    }

    public isIncomplete() { !isComplete() }
    public nextFrame() { nextFrame }

    public add(roll) {rolls << roll }

    public score() {
        if (rolls.size == 0) {
            return 0
        } 
        if(isStrike()) {
            roll(1) + sumOfNextTwoRolls()
        } else if(isSpare()) {
            roll(1) + roll(2) + nextRoll()
        } else {
            roll(1) + roll(2)
        }
    }

     private sumOfNextTwoRolls() {
        if(isLast()) {
            roll(2) + roll(3)
        } else {
            if(nextFrame.isStrike() && !nextFrame.isLast()) {
                nextFrame.roll(1) + nextFrame.nextFrame.roll(1)
            } else {
                nextFrame.roll(1) + nextFrame.roll(2)
            }
        }
    }
    private nextRoll() {
        if (isLast()) {
            return roll(3)
        } else {
            return nextFrame.roll(1)
        }
    }
    private isComplete()
    {
        if(isLast()) {
            (hasTwoRolls() && !isStrike() && !isSpare()) || hasThreeRolls()
        } else {
            (hasOneRoll() && isStrike()) || hasTwoRolls()
        }
    }
    private roll(n) { rolls[n-1] }
    private isStrike(){ roll(1) == 10 }
    private isSpare(){ (roll(1) + roll(2)) == 10 }  
    private isLast(){ nextFrame == null }
    private hasOneRoll(){ rolls.size == 1 }
    private hasTwoRolls(){ rolls.size == 2 }
    private hasThreeRolls(){ rolls.size == 3 }
}