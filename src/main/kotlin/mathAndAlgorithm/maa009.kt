package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val s = sc.nextInt()
	val aList = (0 until n).map { sc.nextInt() }

	println(problemMaa009(n, s, aList))
}

fun problemMaa009(n: Int, s: Int, aList: List<Int>): String {
	var ans = "No"
	val dp = Array(n + 1) { Array(s + 1) { false } }
	dp[0][0] = true

	for (i in 0 until n) {
		for (j in 0..s) {
			if (j >= aList[i]) {
				dp[i + 1][j] = dp[i][j - aList[i]] or dp[i][j]
//				print(dp[i + 1][j])
//				print(" ")
			} else {
				dp[i + 1][j] = dp[i][j]
//				print(dp[i + 1][j])
//				print(" ")
			}
		}
//		println("")
	}
	if (dp[n][s]) {
		ans = "Yes"
	}
	return ans
}