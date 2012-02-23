package com.chriswk.insane.Fibonacci

class Fibonacci {
	def fibonacci(num: Int. nxt: Int, res: Int): Int = {
		num match {
			case 0 => res
			case _ => fibonacci(num - 1, nxt + res, nxt)
		}
	} 
		
}