package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextLong()
	var ans = 1.0
	var coinCount = 1.0
	for (i in 1 until n) {
		ans += 1 / (1 - (coinCount / n))
		coinCount++
	}
	println(ans)
}