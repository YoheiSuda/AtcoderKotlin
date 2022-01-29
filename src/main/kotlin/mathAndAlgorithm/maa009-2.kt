package mathAndAlgorithm

import java.util.*

//todo: bit全探索パターンで解いてみる

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val s = sc.nextInt()
	val aList = (0 until n).map { sc.nextInt() }

	println(problemMaa009v2(n, s, aList))
}

fun problemMaa009v2(n: Int, s: Int, aList: List<Int>): String {
	var ans = "No"
	val loopN = Math.pow(2.0, n.toDouble())
	loop@ for (i in 0 until loopN.toLong()) {
		var sum = 0
		val iToString2 = i.toString(2).reversed()
		for (j in iToString2.indices) {
			if (iToString2[j] == '1') {
				sum += aList[j]
				if (sum == s) {
					ans = "Yes"
					break@loop
				}
			}
		}
	}
	return ans
}