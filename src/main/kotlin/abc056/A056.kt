package abc056

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.next()
	val b = sc.next()

	println(problemA056(a,b))
}

fun problemA056(a: String, b: String): String {
	var isHonest = true
	var ans: String
	if (a == "D") {
		isHonest = false
	}

	if (isHonest) {
		ans = b
	} else {
		if (b == "H") {
			ans = "D"
		} else {
			ans = "H"
		}
	}

	return ans
}