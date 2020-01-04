package jp.ne.linnefromice.magic8ball.simple.data

import kotlin.random.Random

fun selectRandomAnswer(): String {

    // init
    val answerList: MutableList<Answer> = mutableListOf()
    answerList.add(Answer("It is certain.", Status.AFFIRMATIVE))
    answerList.add(Answer("It is decidedly so.", Status.AFFIRMATIVE))
    answerList.add(Answer("Without a doubt.", Status.AFFIRMATIVE))
    answerList.add(Answer("Yes - definitely.", Status.AFFIRMATIVE))
    answerList.add(Answer("You may rely on it.", Status.AFFIRMATIVE))
    answerList.add(Answer("As I see it, yes.", Status.AFFIRMATIVE))
    answerList.add(Answer("Most likely.", Status.AFFIRMATIVE))
    answerList.add(Answer("Outlook good.", Status.AFFIRMATIVE))
    answerList.add(Answer("Yes.", Status.AFFIRMATIVE))
    answerList.add(Answer("Signs point to yes", Status.AFFIRMATIVE))
    answerList.add(Answer("Reply hazy, try again.", Status.NON_COMMITTAL))
    answerList.add(Answer("Ask again later.", Status.NON_COMMITTAL))
    answerList.add(Answer("Better not tell you now.", Status.NON_COMMITTAL))
    answerList.add(Answer("Cannot predict now.", Status.NON_COMMITTAL))
    answerList.add(Answer("Concentrate and ask again.", Status.NON_COMMITTAL))
    answerList.add(Answer("Don't count on it.", Status.NEGATIVE))
    answerList.add(Answer("My reply is no.", Status.NEGATIVE))
    answerList.add(Answer("My sources say no.", Status.NEGATIVE))
    answerList.add(Answer("Outlook not so good.", Status.NEGATIVE))
    answerList.add(Answer("Very doubtful.", Status.NEGATIVE))

    val randomInt = Random.nextInt(answerList.size)
    return answerList.get(randomInt).message;
}

data class Answer(val message: String, val status: Status)

enum class Status {
    AFFIRMATIVE, NON_COMMITTAL, NEGATIVE
}
