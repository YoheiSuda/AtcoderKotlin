package abc064

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val r = sc.nextInt()
	val g = sc.nextInt()
	val b = sc.nextInt()

	println(problemA064(r,g,b))
}

fun problemA064(r: Int, g: Int, b: Int): String {
	var ans = "NO"
	val rgb = r * 100 + g * 10 + b
	if (rgb % 4 == 0) {
		ans = "YES"
	}

	return ans
}