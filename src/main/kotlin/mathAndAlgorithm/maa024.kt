package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val pq = (0 until n).map { sc.nextInt().toDouble() to sc.nextInt().toDouble() }
	var ans: Double = 0.0
	for (i in 0 until n) {
		ans += pq[i].second / pq[i].first
	}
	println(ans)
}