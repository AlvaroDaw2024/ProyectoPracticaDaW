enum class Categoria {
    TALLER,
    ACTIVIDAD,
    CONFERENCIA;

    fun devolverCategoria():Categoria{
        return Categoria.values().random()
    }
}