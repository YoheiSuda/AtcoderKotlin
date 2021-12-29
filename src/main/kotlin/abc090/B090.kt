package abc090

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val startNum = sc.nextInt()
	val endNum = sc.nextInt()

	println(problemB090(startNum, endNum))
}

fun problemB090(startNum: Int, endNum: Int) : Int {

	val startNum2 = ("" + startNum).take(2).toInt()
	val startNum2Reverse = ("" + startNum).take(2).reversed().toInt()
	val startNum2Last = ("" + startNum).takeLast(2).toInt()
	val startNumMid = ("" + startNum).substring(2,3).toInt()

	val endNum2 = ("" + endNum).take(2).toInt()
	val endNum2Reverse = ("" + endNum).take(2).reversed().toInt()
	val endNum2Last = ("" + endNum).takeLast(2).toInt()
	val endNumMid = ("" + endNum).substring(2,3).toInt()

	var startRemoveCount = 0
	if (startNum2Reverse < startNum2Last) {
		startRemoveCount = 1
	}

	var endRemoveCount = 0
	if (endNum2Reverse > endNum2Last) {
		endRemoveCount = 1
	}

	var currentNum2 = startNum2
	var count = 0

	while (true) {
		if (currentNum2 in startNum2..endNum2) {
			count += 10
			currentNum2 += 1
		} else {
			// 超過した分を消す処理
			count -= (startNumMid + startRemoveCount)
			count -= (9 - endNumMid + endRemoveCount)
			break
		}
	}

	return count
}