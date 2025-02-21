enum class Categoria {
    TALLER,
    ACTIVIDAD,
    CONFERENCIA;
companion object{
    fun devolverCategoria():Categoria{
        return Categoria.values().random()
    }
}

}