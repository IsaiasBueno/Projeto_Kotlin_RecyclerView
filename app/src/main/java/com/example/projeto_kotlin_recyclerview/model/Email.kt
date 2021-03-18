package com.example.projeto_kotlin_recyclerview.model

data class Email (
    val user:String,
    val subject: String,
    val preview:String,
    val date:String,
    val stared:Boolean,
    val unread:Boolean,
    var selected:Boolean = false
        )

class EmailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared:Boolean = false
    var unread:Boolean = false

    fun build(): Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email (block: EmailBuilder.() -> Unit) : Email = EmailBuilder().apply(block).build()

fun fakeEmails() = MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais para você conseguir..."
        preview = "Olá Isaias, você precisa ver esse site para..."
        date = "18 mar"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Um amigo convidou você para curtir a página dele"
        preview = "Fulano convidou você para curtir a sua página"
        date = "19 mar"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "Isaias Bueno acaba de enviar um vídeo"
        preview = "Isaias Bueno enviou Kotlin|RecyclerView|Android"
        date = "20 mar"
        stared = true
        unread = true
    },
    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir..."
        preview = "Olá Isaias, você precisa ver esse site para..."
        date = "20 mar"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais para você conseguir..."
        preview = "Olá Isaias, você precisa ver esse site para..."
        date = "18 mar"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Um amigo convidou você para curtir a página dele"
        preview = "Fulano convidou você para curtir a sua página"
        date = "19 mar"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "Isaias Bueno acaba de enviar um vídeo"
        preview = "Isaias Bueno enviou Kotlin|RecyclerView|Android"
        date = "20 mar"
        stared = true
        unread = true
    },
    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir..."
        preview = "Olá Isaias, você precisa ver esse site para..."
        date = "20 mar"
        stared = false
    }
}
)




