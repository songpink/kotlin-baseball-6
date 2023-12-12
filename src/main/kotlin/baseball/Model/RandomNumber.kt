package baseball.Model

import camp.nextstep.edu.missionutils.Randoms

class RandomNumber {
    private val computer: MutableList<Int> = mutableListOf()
    fun makeRandomNumber(){
        while (computer.size < 3) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (randomNumber !in computer) {
                computer.add(randomNumber)
            }
        }
    }
}