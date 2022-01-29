package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val x1 = sc.nextInt()
	val y1 = sc.nextInt()
	val r1 = sc.nextInt()
	val x2 = sc.nextInt()
	val y2 = sc.nextInt()
	val r2 = sc.nextInt()

	val d = Math.sqrt(Math.pow(x1.toDouble() - x2.toDouble(), 2.0) + Math.pow(y1.toDouble() - y2.toDouble(), 2.0))

	val ans = if (d < Math.abs(r1 - r2)) {
		1
	} else if (d == Math.abs(r1 - r2).toDouble()) {
		2
	} else if (d < r1 + r2) {
		3
	} else if (d == (r1 + r2).toDouble()) {
		4
	} else {
		5
	}

	println(ans)
}