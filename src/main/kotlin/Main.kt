package ssoyoung

import kotlinx.coroutines.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /**
     * launch : Coroutine Builder. 코드의 나머지 부분과 동시에 새로운 코루틴을 실행하여 독립적으로 작동함
     * delay : 특별한 suspend 함수. 특정 시간동안 코루틴을 일시 중단함. 일시 중단하면 기본 스레드는 차단되지 않기 때문에 다른 코루틴에서 스레드를 이어서 사용할 수 있음.
     * runBlocking : Coroutine Builder. 코루틴은 모두 runBlocking 안에 포함되어 있지 않으면 에러가 발생
     */

    fun main() = runBlocking { // this: CoroutineScope
        launch { // launch a new coroutine and continue
            delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
            println("World!") // print after delay
        }
        println("Hello") // main coroutine continues while a previous one is delayed
    }
}