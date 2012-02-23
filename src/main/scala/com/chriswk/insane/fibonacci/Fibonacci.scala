package com.chriswk.insane.fibonacci

import scala.math.BigInt

class Fibonacci {
	
	def fibonacci(num : Int) = fibs take num last

	lazy val fibs : Stream[BigInt] = BigInt(0) #::
							   BigInt(1) #::
							   fibs.zip(fibs.tail).map {n => n._1 + n._2}
		
}