package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextLong()

	if (isPrime(n)) {
		println("Yes")
	} else {
		println("No")
	}
}

fun isPrime(num: Long): Boolean {
	if (num < 2) return false
	if (num == 2L) return true
	if (num % 2 == 0L) return false

	val sqrtNum = Math.sqrt(num.toDouble()).toInt()
	for (i in 3..sqrtNum step 2) {
		if (num % i == 0L) return false
	}
	return true
}