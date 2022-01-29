package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val aList = (0 until n).map { sc.nextInt().toDouble() }
	val bList = (0 until n).map { sc.nextInt().toDouble() }

	var ans = 0.0
	for (i in 0 until n) {
		var a = aList[i] / 3
		var b = bList[i] / 3
		b *= 2
		ans += (a + b)
	}

	println(ans)
}