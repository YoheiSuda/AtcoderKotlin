package abc065

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val buttonNum = sc.nextInt()
	val buttons = (0 until buttonNum).map { sc.nextInt() }

	println(problemB065(buttonNum, buttons))
}

fun problemB065(buttonNum: Int, buttons: List<Int>): Int {
	var ans = -1
	var count = 1
	val pushedButtons = List<Int>(buttonNum) { 0 }.toMutableList()
	var currentButton = buttons[0]
	pushedButtons[0] = 1

	while (true) {
		if ((currentButton) == 2) {
			ans = count
			break
		}
		if (pushedButtons[currentButton - 1] == 1) {
			break
		} else {
			pushedButtons[currentButton - 1] = 1
			count++
		}
		currentButton = buttons[currentButton - 1]
	}

	return ans
}