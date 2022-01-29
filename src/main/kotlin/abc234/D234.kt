package abc234

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val k = sc.nextInt()
	val pList = (0 until n).map { sc.nextInt() }
	problemD234(n, k, pList)
}

fun problemD234(n: Int, k: Int, pList: List<Int>) {

	var tmpList = mutableListOf<Int>()
	for (i in 0 until k) {
		tmpList.add(pList[i])
	}
	tmpList.sortDescending()
	var tmpListIndex = k -1

	for (i in k until n) {
		println(tmpList[tmpListIndex])
		if (pList[i] > tmpList[tmpListIndex]) {
			// pListの値が現在のlistのiばんめより大きいとき
			var index = searchIndex(pList[i], tmpList)
			if (index == -1) {
				tmpList.add(pList[i])
			} else {
				tmpList.add(index, pList[i])
			}
		} else {
			// pListの値が現在のlistのiばんめより小さいとき
			var index = searchIndex(pList[i], tmpList)
			if (index == -1) {
				tmpList.add(pList[i])
			} else {
				tmpList.add(index, pList[i])
			}
		}
	}
	println(tmpList[tmpListIndex])
}

fun searchIndex(element: Int, list: List<Int>): Int {
	var index = -1
	for (i in list.indices) {
		if (element > list[i]) {
			index = i
			break
		}
	}
	return index
}
