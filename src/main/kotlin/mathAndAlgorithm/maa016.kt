package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val a = (0 until n).map { sc.nextLong() }

	var answer = greatestCommonDiviser2(a[0], a[1])
	for (i in 2 until n) {
		answer = greatestCommonDiviser2(answer, a[i])
	}
	println(answer)
}

//ユークリッドの互除法
fun greatestCommonDiviser2(a: Long, b:Long): Long {
	var num1 = a
	var num2 = b
	var numFlg = true

	var ans = 0L

	while (numFlg) {
		if (num1 >= num2) {
			num1 %= num2
		} else {
			num2 %= num1
		}

		if (num1 == 0L) {
			ans = num2
			numFlg = false
		} else if (num2 == 0L) {
			ans = num1
			numFlg = false
		}
	}

	return ans
}