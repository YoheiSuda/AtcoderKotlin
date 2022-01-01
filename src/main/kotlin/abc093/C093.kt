package abc093

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.nextInt()
	val b = sc.nextInt()
	val c  = sc.nextInt()

	println(problemC093(a, b, c))
}

fun problemC093(a: Int, b: Int, c: Int): Int {
	var tmpA = a
	var tmpB = b
	var tmpC = c
	var sumCount = 0
	if ((a % 2 == 0 && b % 2 == 0 && c % 2 == 0) || (a % 2 != 0 && b % 2 != 0 && c % 2 != 0)) {

	} else {
		if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)) {
			tmpA += 1
			tmpB += 1
			sumCount++
		} else if ((a % 2 == 0 && c % 2 == 0) || (a % 2 != 0 && c % 2 != 0)) {
			tmpA += 1
			tmpC += 1
			sumCount++
		} else if ((b % 2 == 0 && c % 2 == 0) || (b % 2 != 0 && c % 2 != 0)) {
			tmpB += 1
			tmpC += 1
			sumCount++
		}
	}

	// 一番でかいやつを調べる
	if (tmpA >= tmpB && tmpA >= tmpC) {
		sumCount += ((tmpA - tmpB) + (tmpA - tmpC)) / 2
	} else if (tmpB >= tmpA && tmpB >= tmpC) {
		sumCount += ((tmpB - tmpA) + (tmpB - tmpC)) / 2
	} else if (tmpC >= tmpA && tmpC >= tmpB) {
		sumCount += ((tmpC - tmpA) + (tmpC - tmpB)) / 2
	}

//	println(tmpA)
//	println(tmpB)
//	println(tmpC)

	return sumCount
}