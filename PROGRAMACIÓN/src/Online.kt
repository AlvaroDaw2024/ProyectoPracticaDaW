class Online:Evento {
    var paginaweb=""

    constructor(paginaweb: String) : super() {
        this.paginaweb = paginaweb
    }

    constructor(
        tipo: String,
        ubicacion: String,
        fecha: String,
        nombre: String,
        IdEvento: Int,
        asistentes: ArrayList<Usuario>,
        inscritos: ArrayList<Usuario>,
        Categoria: ArrayList<Categoria>,
        paginaweb: String
    ) : super(tipo, ubicacion, fecha, nombre, IdEvento, asistentes, inscritos, Categoria) {
        this.paginaweb = paginaweb
    }
}