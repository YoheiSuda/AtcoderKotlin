package abc235

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val abc = sc.nextInt().toString()

	val bca = (abc[1].toString() + abc[2] + abc[0]).toInt()
	val cab = (abc[2].toString() + abc[0] + abc[1]).toInt()
	println(abc.toInt() + bca + cab)
}