package abc061

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val insertNum = sc.nextLong()

	val ansIndex = sc.nextLong()
	val dummyArr = mutableMapOf<Long,Long>()

	for (i in 1..insertNum) {
		val longA = sc.nextLong()
		val loopNum = sc.nextLong()
		dummyArr[longA] = dummyArr.getOrDefault(longA, 0)  + loopNum
	}

	val dummyArr2 = dummyArr.toSortedMap()
	var vSum = 0L
	var ans = 0L

	for ((k,v) in dummyArr2) {
		vSum += v
		if (vSum >= ansIndex) {
			ans = k
			break
		}
	}

	println(ans)
}