package mathAndAlgorithm

import java.util.*

fun main() {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()

	val hList = (0 until n).map { sc.nextLong() }
	
	val dp = mutableListOf<Long>()
	
	for (i in 0 until n) {
		if (i == 0) dp.add(0)
		if (i == 1) dp.add(Math.abs(hList[i - 1] - hList[i]))
		if (i >= 2) {
			dp.add(Math.min(
				dp[i - 1] + Math.abs(hList[i - 1] - hList[i]),
				dp[i - 2] + Math.abs(hList[i - 2] - hList[i])
			))
		}
	}
	
	println(dp[n - 1])
}
