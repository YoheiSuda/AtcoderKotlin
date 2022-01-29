package abc233

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)

	val l = sc.nextInt()
	val r = sc.nextInt()
	val s = sc.next()

	println(problemB233(l, r, s))
}

fun problemB233(l: Int, r: Int, s: String): String {
	var startS = ""
	var endS = ""


	if (l != 1) {
		startS = s.take(l - 1)
	}

	if (r != s.length) {
		endS = s.takeLast(s.length - r)
	}

	val sTrim = s.substring(l - 1, r)

	return startS + sTrim.reversed() + endS
}