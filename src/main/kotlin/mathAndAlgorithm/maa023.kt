package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val b = (0 until n).map { sc.nextInt().toDouble() }
	val r = (0 until n).map { sc.nextInt().toDouble() }

	var ans: Double = (b.sum() / n) + (r.sum() / n)
	println(ans)
}