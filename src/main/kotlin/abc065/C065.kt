package abc065

import java.util.*

val mod065: Long = (Math.pow(10.0, 9.0) + 7).toLong()

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val dogN = sc.nextInt()
	val monkeyN = sc.nextInt()

	println(problemC065(dogN, monkeyN))
}

fun problemC065(dogN: Int, monkeyN: Int) : Long {
	var dogFactorial = 1L
	var monkeyFactorial = 1L
	var ans = 0L

	if (dogN == monkeyN) {
		for (i in 2..dogN) {
			dogFactorial *= i
			dogFactorial %= mod065
			monkeyFactorial *= i
			monkeyFactorial %= mod065
		}
		ans = (dogFactorial * monkeyFactorial * 2 ) % mod065
	} else if (dogN == (monkeyN + 1)) {
		for (i in 2..dogN) {
			dogFactorial *= i
			dogFactorial %= mod065
			if (i <= monkeyN) {
				monkeyFactorial *= i
				monkeyFactorial %= mod065
			}
		}
		ans = (dogFactorial * monkeyFactorial) % mod065
	} else if (monkeyN == (dogN + 1)) {
		for (i in 2..monkeyN) {
			if (i <= dogN) {
				dogFactorial *= i
				dogFactorial %= mod065
			}
			monkeyFactorial *= i
			monkeyFactorial %= mod065
		}
		ans = (dogFactorial * monkeyFactorial) % mod065
	}
	return ans
}

