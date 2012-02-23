package com.chriswk.insane.fibonacci

import spock.lang.*

class FibonacciSpec extends Specification {

	def "fibonacci numbers"() {
		setup:
		def fibo = new Fibonacci()
		
		expect:
		fibN == fibo.fibonacci(n)

		where:
		n | fibN
		1 | 0
		2 | 1
		3 | 1
		4 | 2
		5 | 3
		6 | 5
		7 | 8
		8 | 13
		9 | 21
		25 | 46368
		30 | 514229 
	}
	
}