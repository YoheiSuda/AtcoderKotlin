package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()

	val xyList = (0 until n).map { sc.nextLong() to sc.nextLong() }
	var currentLength = vectorToLength(xyList[1], xyList[0])

	for (i in 1 until n) {
		for (j in i + 1 until n) {
			val compareLength = vectorToLength(xyList[j], xyList[i])
			currentLength = Math.min(currentLength, compareLength)
		}
	}
	println(currentLength)
}

fun vectorToLength(currentXY: Pair<Long, Long>, prevXY: Pair<Long, Long>): Double {
	val currentVector = currentXY.first - prevXY.first to currentXY.second - prevXY.second
	return Math.sqrt(Math.pow(currentVector.first.toDouble(), 2.0) + Math.pow(currentVector.second.toDouble(), 2.0))
}