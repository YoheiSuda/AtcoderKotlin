package abc093

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val s = sc.next()

	println(problemA093(s))
}

fun problemA093(s: String): String {
	var ans = "Yes"
	var aCount = 0
	var bCount = 0
	var cCount = 0

	for (i in s.indices) {
		if (s[i] == 'a' && aCount == 0) {
			aCount++
		} else if (s[i] == 'b' && bCount == 0) {
			bCount++
		} else if (s[i] == 'c' && cCount == 0) {
			cCount++
		} else {
			ans = "No"
			break
		}
	}
	return ans
}