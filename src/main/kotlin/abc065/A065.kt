package abc065

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val safeRange = sc.nextInt()
	val buyDate = sc.nextInt()
	val eatDate = sc.nextInt()

	println(problemA065(safeRange, buyDate, eatDate))
}

fun problemA065(safeRange: Int, buyDate: Int, eatDate: Int): String {
	val isSafe = eatDate - buyDate
	var ans = ""
	if (isSafe <= 0) {
		ans = "delicious"
	} else if(isSafe <= safeRange) {
		ans = "safe"
	} else {
		ans = "dangerous"
	}
	return ans
}