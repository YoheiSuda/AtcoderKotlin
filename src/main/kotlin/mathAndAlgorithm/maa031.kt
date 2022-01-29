package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val aList = (0 until n).map { sc.nextLong() }

	println(problemMaa031(n, aList))
}

fun problemMaa031(n: Int, aList: List<Long>): Long {
	val dp = MutableList<Long>(n) {0}
	for (i in 0 until n) {
		if (i == 0) {
			dp[i] = aList[i]
		}
		if (i == 1) {
			dp[i] = Math.max(aList[i], dp[i - 1])
		}
		if (i >= 2) {
			dp[i] = Math.max(dp[i - 2] + aList[i], dp[i - 1])
		}
	}

	return dp[n - 1]
}