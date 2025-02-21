import java.time.LocalDate

class Online : Evento {
    var paginaweb = ""

    constructor(paginaweb: String) : super() {
        this.paginaweb = paginaweb
    }

    constructor(
        Categoria: ArrayList<Categoria>,
        inscritos: ArrayList<Usuario>,
        asistentes: ArrayList<Usuario>,
        IdEvento: Int,
        nombre: String,
        fecha: LocalDate?,
        ubicacion: String,
        tipo: String,
        paginaweb: String
    ) : super(Categoria, inscritos, asistentes, IdEvento, nombre, fecha, ubicacion, tipo) {
        this.paginaweb = paginaweb
    }
}