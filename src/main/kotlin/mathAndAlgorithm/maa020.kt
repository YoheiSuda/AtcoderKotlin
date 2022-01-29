package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val aList = (0 until n).map { sc.nextInt() }

	var count = 0

	for (i in 0 until n) {
		for (j in i + 1 until n) {
			for (k in j + 1 until n) {
				for (l in k + 1 until n) {
					for (m in l + 1 until n) {
						if (aList[i] + aList[j] + aList[k] + aList[l] + aList[m] == 1000) {
							count++
						}
					}
				}
			}
		}
	}

	println(count)
}