package abc058

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val pillarA = sc.nextInt()
	val pillarB = sc.nextInt()
	val pillarC = sc.nextInt()

	println(problemA058(pillarA, pillarB, pillarC))
}

fun problemA058(pillarA: Int, pillarB: Int, pillarC: Int): String {
	var ans = "YES"

	if ((pillarB - pillarA) != (pillarC - pillarB)) {
		ans = "NO"
	}

	return ans
}