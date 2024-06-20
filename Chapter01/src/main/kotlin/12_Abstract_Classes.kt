/**
 * public: 어디서든 접근 가능
 * private: 동일 클래스 내에서만 접근 가능
 * protected: 동일 클래스 및 하위 클래스에서만 접근 가능
 * internal: 동일 모듈 내에서만 접근 가능
 * @author kei
 */
abstract class Moveable() {

    protected var x: Int = 0

    protected var y: Int = 0

    open fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun position() = "$x $y"
}

open class ActivePlayer(val name: String) : Moveable(), DiceRoller

class ConfusedPlayer(name: String) : ActivePlayer(name) {

    // move()는 open으로 선언됩니다
    override fun move(x: Int, y: Int) {

        this.x = y // protected로 선언됩니다

        this.y = x // protected로 선언됩니다
    }

}

fun main() {
    val player = ConfusedPlayer("Alex")
    val diceX = player.rollDice()
    val diceY = player.rollDice()

    println("Dice rolled $diceX $diceY")
    player.move(diceX, diceY)

    println("Player at ${player.position()}")
}