package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val s = sc.nextInt()

	println(problemMaa008(n, s))
}

fun problemMaa008(n: Int, s: Int): Int {
	var count = 0
	for (i in 1..n) {
		for (j in 1..n) {
			if ((i + j) <= s) {
				count++
			}
		}
	}
	return count
}