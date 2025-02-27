enum class Emails(val email: String) {
    CORREO_1("usuario@gmail.com"),
    CORREO_2("usuario@yahoo.com"),
    CORREO_3("usuario@outlook.com"),
    CORREO_4("usuario@hotmail.com"),
    CORREO_5("usuario@live.com"),
    CORREO_6("usuario@icloud.com"),
    CORREO_7("usuario@protonmail.com"),
    CORREO_8("usuario@gmx.com"),
    CORREO_9("usuario@zoho.com"),
    CORREO_10("usuario@aol.com");

    companion object {
        fun emailAleatorio(): String = values().random().email
    }
}


