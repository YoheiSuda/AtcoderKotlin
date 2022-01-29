package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)

	val n = sc.nextInt()

	for (i in 2..n) {
		if (isPrime(i)) {
			if (i >= 3) {
				print(" ")
			}
			print(i)
		}
	}
	println("")
}

fun isPrime(num: Int): Boolean {
	if (num < 2) return false
	if (num == 2) return true
	if (num % 2 == 0) return false

	val sqrtNum = Math.sqrt(num.toDouble()).toInt()
	for (i in 3..sqrtNum step 2) {
		if (num % i == 0) return false
	}
	return true
}