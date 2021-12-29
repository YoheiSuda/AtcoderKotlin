package abc061

import java.util.*

fun main(args:Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.nextInt()
	val b = sc.nextInt()
	val c = sc.nextInt()

	println(problemA061(a,b,c))
}

fun problemA061(a: Int, b: Int, c: Int): String {
	var ans = "No"

	if (c in a..b) {
		ans = "Yes"
	}

	return ans
}