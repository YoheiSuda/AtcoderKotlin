//package abc236
//
//import java.util.*
//
//fun main(args: Array<String>) {
//	val sc = Scanner(System.`in`)
//	val n = sc.nextInt()
//
//	var aList = List(n * 2 - 1) { mutableListOf<Long>() }
//	for (i in 0 until n * 2) {
//		for (j in i + 1 until n * 2) {
//			aList[i].add(sc.nextLong())
//		}
//	}
//
//	println(problemD236(n, aList))
//}
//
//fun problemD236(n: Int, aList:List<List<Long>>): Long {
//	var aj = 1
//
//	var ans = 0L
//
//	for (i in 0 until n * 2 - 1) {
//		var currentvalue = aList[0][i]
//		var usedIndex = mutableListOf<Int>()
//		usedIndex.add(0)
//		usedIndex.add(aj)
//		if (i + 1 < n * 2) {
//
//			ans = barbarbar(n, aList, currentvalue, usedIndex, 0))
//		}
//		aj ++
//	}
//	return ans
//}
//
//// 再帰処理
//fun barbarbar(n: Int, aList: List<List<Long>>, prevValue: Long, usedIndex: List<Int> , index: Int): Long {
//	val tmp_index = index + 1
//
//	var ans = prevValue
//	if (tmp_index >= n * 2) {
//
//	} else if (usedIndex.contains(tmp_index)) {
//		ans = barbarbar(n, aList, prevValue, usedIndex, tmp_index)
//	} else {
//		var tmp_usedIndex = usedIndex.toMutableList()
//		for (i in 0 until (n * 2 - (tmp_index + 1))) {
//			tmp_usedIndex.add(tmp_index)
//			tmp_usedIndex.add(tmp_index + (i + 1))
//			var currentValue = aList[tmp_index][i]
//			var xorValue = currentValue.xor(prevValue)
//			ans = barbarbar(n, aList, xorValue, tmp_usedIndex, tmp_index)
//		}
//	}
//	return ans
//}
//
///*
//1,2 1,3 1,4
//4   0   1
//4   5   3
//        2
// */