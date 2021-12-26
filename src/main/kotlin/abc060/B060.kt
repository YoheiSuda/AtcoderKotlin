package abc060

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.nextInt()
	val b = sc.nextInt()
	val c = sc.nextInt()
	println(problemB060(a,b,c))
}

fun problemB060(a: Int, b: Int, c: Int) : String {
	var ans = "NO"
	val set = mutableSetOf<Int>()
	var multiply = 1
	while (true) {
		val remain = (a * multiply) % b
		if (remain == c) {
			ans = "YES"
		}
		if (set.contains(remain)) {
			break
		}
		set.add(remain)
		multiply++
 	}
	return ans
}