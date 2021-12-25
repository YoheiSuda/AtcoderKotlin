package abc056

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val rectWidth = sc.nextInt()
	val rect1Left = sc.nextInt()
	val rect2Left = sc.nextInt()

	println(problemB056(rectWidth, rect1Left, rect2Left))
}

fun problemB056(rectWidth: Int, rect1Left: Int, rect2Left: Int): Int {
	val rect1Right = rectWidth + rect1Left
	val rect2Right = rectWidth + rect2Left

	var ans: Int
	if (rect1Right <= rect2Right) {
		if (rect1Right >= rect2Left) {
			ans = 0
		} else {
			ans = rect2Left - rect1Right
		}
	} else {
		if (rect2Right >= rect1Left) {
			ans = 0
		} else {
			ans = rect1Left - rect2Right
		}
	}

	return ans
}