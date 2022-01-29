package abc068

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()

	var count = 0
	var maxCount = 0
	var maxNum = 0
	for (i in 1..n) {
		var currentNum = i
		while (true) {
			if (currentNum % 2 == 0) {
				count++
				currentNum /= 2
			} else {
				break
			}
		}
		if (count >= maxCount) {
			maxCount = count
			maxNum = i
		}
		count = 0
	}

	println(maxNum)
}