package abc066

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val opN = sc.nextInt()
	val aInputs = (0 until opN).map { sc.nextLong() }
	val aList = LinkedList<Long>()

	for (i in 0 until opN) {
		//奇数回目の場合
		if ((i + 1) % 2 != 0) {
			aList.add(0, aInputs[i])
		} else {
			// 偶数回目の場合
			aList.add(aInputs[i])
		}
	}

	if (opN % 2 == 0) {
		aList.reverse()
	}

	val sb = StringBuilder()

	aList.forEach {
		sb.append("$it ")
	}
	println(sb.toString())
}