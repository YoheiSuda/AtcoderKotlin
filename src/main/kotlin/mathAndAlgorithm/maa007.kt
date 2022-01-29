package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val x = sc.nextInt()
	val y = sc.nextInt()
	println(problemMaa007(n, x, y))
}

fun problemMaa007(n: Int, x: Int, y: Int): Int {
	var count = 0
	for (i in 1..n) {
		if (i % x == 0 || i % y == 0) {
			count++
		}
	}
	return count
}