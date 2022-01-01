package abc136

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val str = sc.next()
	println(problemD136(str))
}

fun problemD136(str: String): String {
	val countList = List<Int>(str.length) { 0 }.toMutableList()
	val s = str + "R"
	var sIndex = 0
	var rCount = 0
	var lCount = 0
	var eIndex = 0
	while (true) {
		if (sIndex == s.length)  {
			break
		}

		if (rCount == 0) {
			rCount += 1
			sIndex += 1
		} else if (lCount == 0 && s[sIndex] == s[sIndex - 1]) {
			rCount += 1
			sIndex += 1
		} else if (lCount == 0) {
			lCount += 1
			sIndex += 1
		} else if (s[sIndex] == s[sIndex - 1]) {
			lCount += 1
			sIndex += 1
		} else {
//			println(rCount)
//			println(lCount)
//			println(sIndex)
			var add1 = 0
			var add2 = 0

			// rlの出現回数の和が偶数の場合は半分にして入れれば良い
			if ((rCount + lCount) % 2 == 0) {
				var tmpAdd = (rCount + lCount) / 2
				add1 = tmpAdd
				add2 = tmpAdd
			} else {
				if(rCount % 2 == 0) {
					add1 = (rCount + lCount) / 2
					add2 = (rCount + lCount) / 2 + 1
				} else {
					add1 = (rCount + lCount) / 2 + 1
					add2 = (rCount + lCount) / 2
				}
			}

			countList[eIndex + rCount - 1] = add1
			countList[eIndex + rCount] = add2

			rCount = 1
			lCount = 0
			eIndex = sIndex
			sIndex += 1
		}
	}

	var ans = countList.joinToString(" ")
	return ans
}