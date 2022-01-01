package abc096

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val height = sc.nextInt()
	val width = sc.nextInt()

	val canvas = (0 until height).map { sc.next() }

	println(problemC096(height, width, canvas))
}

fun problemC096(height: Int, width: Int, canvas: List<String>) :String {
	var ans = "Yes"

	loop@ for (i in canvas.indices) {
		for (j in 0 until canvas[i].length) {
			if (canvas[i][j] == '#') {
				if ((j != width - 1 && canvas[i][j + 1] != '#') &&
					(j != 0 && canvas[i][j - 1] != '#') &&
					(i != height - 1 && canvas[i + 1][j] != '#') &&
					(i != 0 && canvas[i - 1][j] != '#')
				) {
					ans = "No"
					break@loop
				}
			}
		}
	}
	return ans
}