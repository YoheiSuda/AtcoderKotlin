package abc066

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val s = sc.next()
	println(problemB066(s))
}

fun problemB066(s: String): Int {
	var tmpS = s
	var ans = 0
	while (true) {
		tmpS = tmpS.dropLast(2)
		var tmpSSize = tmpS.length
		var tmpS1 = tmpS.take(tmpSSize / 2)
		var tmpS2 = tmpS.takeLast(tmpSSize / 2)
		if (tmpS1 == tmpS2) {
			ans = tmpSSize
			break
		}
	}

	return ans
}