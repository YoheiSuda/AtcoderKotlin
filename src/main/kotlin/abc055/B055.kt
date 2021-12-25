package abc055

import java.util.*

val mod055: Long = (Math.pow(10.0, 9.0) + 7).toLong()

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextLong()

	println(problemB055(n))
}

fun problemB055(n: Long): Long {
	var ans = 1L
	for (i in 1..n) {
		ans *= i
		ans %= mod055
	}

	return ans
}

/**
 * 素因数分解
 * 対象の値が1になるまで素数で順番に割っていき割った数を列挙する
 */
//fun computePrimeFactorList(n: Long): List<Long> {
//	val p = mutableListOf<Long>()
//	var primeFactor = n
//	for (i in 2..n) {
//		while (primeFactor % i == 0L) {
//			primeFactor /= i
//			p.add(i)
//		}
//	}
//	return p
//}