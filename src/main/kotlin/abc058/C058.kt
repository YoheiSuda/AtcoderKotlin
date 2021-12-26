package abc058

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val strNum = sc.nextInt()
	val strList = ArrayList<List<String>>()
	for (i in 1..strNum) {
		strList.add(sc.next().split("").filter { it != "" }.sorted())
	}
	println(problemC058(strList))
}

fun problemC058(strList: ArrayList<List<String>>): String {
	var ans = ""
	var tmpAns = mutableListOf<String>()
	var tmpStr= strList[0].toMutableList()
	var isStrContain = false
	if (strList.size == 1) {
		tmpStr.forEach {
			ans += it
		}
	} else {
		for (i in 1 until strList.size) {
			strList[i].forEach {
				if (tmpStr.contains(it)) {
					tmpAns.add(it)
					tmpStr.remove(it)
					isStrContain = true
				}
			}
			if (isStrContain && i == (strList.size - 1)) {
				tmpAns.forEach {
					ans += it
				}
			} else {
				isStrContain = false
			}
			tmpStr = tmpAns.toMutableList()
			tmpAns.clear()
		}
	}

	return ans
}
