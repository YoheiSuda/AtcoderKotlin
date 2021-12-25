package abc055

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val sNum = sc.nextLong()
	val cNum = sc.nextLong()

	println(problemC055(sNum,cNum))
}

fun problemC055(sNum:Long, cNum:Long): Long {
	var ans = 0L
	var sNum2 = sNum
	var cNum2 = cNum
	if (sNum2 >= (cNum2 / 2)) {
		ans = cNum2 / 2
	} else {
		ans += sNum2
		cNum2 -= sNum2 * 2
		ans += cNum2 / 4
	}
	return ans
}

