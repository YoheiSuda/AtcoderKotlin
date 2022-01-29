package mathAndAlgorithm

import java.util.*

fun main() {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val w = sc.nextInt()
	val wv = (0 until n).map { sc.nextInt() to sc.nextLong() }

	println(problemMaa030(n, w, wv))
}

fun problemMaa030(n: Int, w: Int, wv: List<Pair<Int, Long>>) : Long {
	val dp = (0 until n + 1).map { MutableList<Long>(w + 1) {0} }
	for (i in 0 until n) {
		for (j in 1 until w + 1) {
			if (j == wv[i].first) {
				dp[i + 1][wv[i].first] = wv[i].second
			}
			if (dp[i][j] != 0L) {
				dp[i + 1][j] = Math.max(dp[i][j], dp[i + 1][j])
				if (j + wv[i].first <= w) {
					dp[i + 1][j + wv[i].first] = dp[i][j] + wv[i].second
				}
			}
		}
	}

	dp[n].sort()

	return dp[n][w]
}