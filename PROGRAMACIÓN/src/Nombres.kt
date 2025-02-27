enum class Nombres {
    ALBERTO,
    BEATRIZ,
    CARLOS,
    DANIELA,
    EDUARDO,
    FERNANDA,
    GABRIEL,
    HELENA,
    IGNACIO,
    JULIA,
    KAREN,
    LUIS,
    MARTINA,
    NATALIA,
    OSCAR,
    PATRICIA,
    QUINTÍN,
    RAFAEL,
    SOFÍA,
    TOMÁS,
    URIEL,
    VICTORIA,
    WALTER,
    XIMENA,
    YOLANDA,
    ZOILO;

    companion object {
        fun nombreAleatorio(): String {
            return values().random().toString()
        }
    }
}