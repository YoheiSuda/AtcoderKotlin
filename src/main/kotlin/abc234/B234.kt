package abc234

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val xyList = (0 until n).map { sc.nextInt() to sc.nextInt() }

	println(problemB234(n, xyList))
}

fun problemB234(n: Int, xyList: List<Pair<Int, Int>>): Double {
	var maxDist: Double = 0.0
	var prevXy: Pair<Int,Int>
	
	for (i in 0 until (n - 1)) {
		prevXy = xyList[i]
		for (j in 1 until n) {
			if (prevXy.first == xyList[j].first) {
				// x軸上の位置が同じ場合
				maxDist = Math.max(maxDist, Math.abs(xyList[j].second - prevXy.second).toDouble())
			} else if (prevXy.second == xyList[j].second) {
				// y軸上の位置が同じ場合
				maxDist = Math.max(maxDist, Math.abs(xyList[j].first - prevXy.first).toDouble())
			} else {
				//どちらでもなければ対角線の計算
				var rectX = Math.abs(xyList[j].first - prevXy.first)
				var rectY = Math.abs(xyList[j].second - prevXy.second)
				maxDist = Math.max(maxDist, Math.sqrt(Math.pow(rectX.toDouble(), 2.0) + Math.pow(rectY.toDouble(), 2.0)))
			}

			//debug用
			//println(maxDist)

		}
	}

	return maxDist
}