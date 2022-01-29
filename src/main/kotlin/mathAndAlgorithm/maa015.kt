package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.nextLong()
	val b = sc.nextLong()

	println(greatestCommonDiviser(a,b))
}

//ユークリッドの互除法
fun greatestCommonDiviser(a: Long, b:Long): Long {
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