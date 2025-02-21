import java.time.LocalDate

class Presencial:Evento {
    var direccion=""

    constructor(direccion: String) : super() {
        this.direccion = direccion
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
        direccion: String
    ) : super(Categoria, inscritos, asistentes, IdEvento, nombre, fecha, ubicacion, tipo) {
        this.direccion = direccion
    }
}