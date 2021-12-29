package abc063

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val s = sc.next()

	println(problemB063(s))
}

fun problemB063(s: String): String {
	var ans = "yes"

	val stringMap = mutableMapOf<Char, Int>()

	for (i in s.indices) {
		stringMap[s[i]] = stringMap.getOrDefault(s[i], 0) + 1
		if (stringMap[s[i]] == 2) {
			ans = "no"
			break
		}
	}

	return ans
}