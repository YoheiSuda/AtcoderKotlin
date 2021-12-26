package abc060

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val str1 = sc.next()
	val str2 = sc.next()
	val str3  = sc.next()

	println(problemA060(str1, str2, str3))
}

fun problemA060(str1: String, str2: String, str3: String): String {
	var ans = "NO"
	val str1Last = str1.takeLast(1)
	val str2First = str2.take(1)
	val str2Last = str2.takeLast(1)
	val str3First = str3.take(1)

	if (str1Last == str2First && str2Last == str3First) {
		ans = "YES"
	}
	return ans
}