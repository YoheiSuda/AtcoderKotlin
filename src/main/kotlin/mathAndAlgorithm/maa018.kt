package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	var count100 = 0L
	var count200 = 0L
	var count300 = 0L
	var count400 = 0L
	for (i in 0 until n) {
		when(sc.nextInt()) {
			100 -> {
				count100++
			}
			200 -> {
				count200++
			}
			300 -> {
				count300++
			}
			400 -> {
				count400++
			}
		}
	}
	println((count100 * count400) + (count200 * count300))
}