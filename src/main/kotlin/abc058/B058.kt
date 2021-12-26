package abc058

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val passOdd = sc.next()
	val passEven = sc.next()

	println(problemB058(passOdd, passEven))
}

fun problemB058(passOdd:String, passEven:String): String {
	var ans = ""
	var isOddLonger = passOdd.length - passEven.length
	passOdd.forEachIndexed { index, c ->
		ans += c
		if (isOddLonger == 1) {
			if (index != passOdd.length - 1) {
				ans += passEven[index]
			}
		} else {
			ans += passEven[index]
		}
	}

	return ans
}