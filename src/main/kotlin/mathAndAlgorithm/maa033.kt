package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val axy = sc.nextLong() to sc.nextLong()
	val bxy = sc.nextLong() to sc.nextLong()
	val cxy = sc.nextLong() to sc.nextLong()

	val ba = axy.first - bxy.first to axy.second - bxy.second
	val bc = cxy.first - bxy.first to cxy.second - bxy.second
	val ca = axy.first - cxy.first to axy.second - cxy.second
	val cb = bxy.first - cxy.first to bxy.second - cxy.second

	var ans = 0.0
	var pattern = 2

	if (ba.first * bc.first + ba.second * bc.second < 0) {
		pattern = 1
	}
	if (ca.first * cb.first + ca.second * cb.second < 0) {
		pattern = 3
	}

	when (pattern) {
		1 -> {
			ans = Math.sqrt(Math.pow(ba.first.toDouble(), 2.0) + Math.pow(ba.second.toDouble(), 2.0))
		}
		2 -> {
			val parallelogram = Math.abs((ba.first * bc.second) - (ba.second * bc.first))

			val bcLength = Math.sqrt(Math.pow(bc.first.toDouble(), 2.0) + Math.pow(bc.second.toDouble(), 2.0))
			ans = parallelogram / bcLength
		}
		3 -> {
			ans = Math.sqrt(Math.pow(ca.first.toDouble(), 2.0) + Math.pow(ca.second.toDouble(), 2.0))
		}
	}

	println(ans)
}