package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Создание констант для использования в ResultActivity.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    // Создание вопросов
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_argentina,
            "Аргентина", "Австралия",
            "Армения", "Австрия", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_australia,
            "Ангола", "Австрия",
            "Австралия", "Армения", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_brazil,
            "Боливия", "Белиз",
            "Бруней", "Бразилия", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_belgium,
            "Багамы", "Бельгия",
            "Барбадос", "Белиз", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_fiji,
            "Габон", "Франция",
            "Фиджи", "Финляндия", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_germany,
            "Германия", "Грузия",
            "Греция", "Гватемала", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_denmark,
            "Доминикана", "Египет",
            "Дания", "Эфиопия", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_india,
            "Ирландия", "Иран",
            "Венгрия", "Индия", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_new_zealand,
            "Австралия", "Новая Зеландия",
            "Тувалу", "США", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_kuwait,
            "Кювейт", "Иордания",
            "Судан", "Бахрейн", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}