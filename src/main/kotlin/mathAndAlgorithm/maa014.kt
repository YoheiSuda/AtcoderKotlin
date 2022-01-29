package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextLong()

	val ans = problemMaa014(n)
	println(ans.joinToString(" "))
}

fun problemMaa014(n: Long): List<Long> {
	val resultList = computePrimeFactorList(n)
	return resultList
}

// 素因数分解
fun computePrimeFactorList(n: Long): List<Long> {
	val p = mutableListOf<Long>()
	var primeFactor = n
	for (i in 2..Math.sqrt(n.toDouble()).toLong()) {
		while (primeFactor % i == 0L) {
			p.add(i)
			primeFactor /= i
			if (primeFactor == 1L) {
				break
			}
		}
	}
	if (primeFactor != 1L) {
		p.add(primeFactor)
	}
	return p
}