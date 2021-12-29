package abc064

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val personN = sc.nextInt()
	val rates = mutableListOf<Int>()

	for (i in 0 until personN) {
		rates.add(sc.nextInt())
	}

	println(problemC064(rates))
}

fun problemC064(rates: List<Int>): String {
	//以下の数値未満ならその色のレート
	val rateColors = mutableListOf<Int>(0,0,0,0,0,0,0,0)

	// 色が出てきた数
	var colorCount = 0
	var minColorCount = 0

	val tmpRates = rates.sorted()

	for (i in tmpRates.indices) {
		if (tmpRates[i] < 3200) {
			val currentRate = tmpRates[i] / 400
			if (rateColors[currentRate] == 0) {
				rateColors[currentRate] += 1
				colorCount++
			}
		} else {
			if (minColorCount == 0) {
				minColorCount = if (colorCount == 0) {
					1
				} else {
					colorCount
				}
			}

			colorCount++
		}
	}

	if (minColorCount == 0) {
		minColorCount = if (colorCount == 0) {
			1
		} else {
			colorCount
		}
	}

	return "$minColorCount $colorCount"
}