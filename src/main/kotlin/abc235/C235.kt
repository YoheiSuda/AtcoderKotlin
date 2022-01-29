package abc235

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val q = sc.nextInt()

	// a[i]の数の出現回数のマップ
	val countHash = mutableMapOf<Long, Int>()
	// a[i]のindexのマップ
	val indexHash = mutableMapOf<Long,MutableList<Int>>()
	for (i in 0 until n) {
		val a = sc.nextLong()
		countHash[a] = countHash.getOrDefault(a, 0) + 1
		indexHash[a] = indexHash.getOrDefault(a, mutableListOf())
		indexHash[a]?.add(i)
	}

	val qList = (0 until q).map { sc.nextLong() to sc.nextInt() }

	problemC235(n, q, countHash, indexHash, qList)
}

fun problemC235(n: Int, q: Int, countHash: MutableMap<Long, Int>, indexHash: MutableMap<Long, MutableList<Int>>, qList: List<Pair<Long,Int>>) {
	for (i in 0 until q) {
		// x[i]が存在しているか？
		if (countHash.containsKey(qList[i].first)) {
			// k[i]こめのx[i]が存在しているか？
			if (indexHash[qList[i].first]!!.size >= (qList[i].second)) {
				println(indexHash[qList[i].first]!![qList[i].second - 1] + 1)
			} else {
				println(-1)
			}
		} else {
			println(-1)
		}
	}
}