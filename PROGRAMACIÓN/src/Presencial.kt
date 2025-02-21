class Presencial:Evento {
    var direccion=""

    constructor(direccion: String) : super() {
        this.direccion = direccion
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
        direccion: String
    ) : super(tipo, ubicacion, fecha, nombre, IdEvento, asistentes, inscritos, Categoria) {
        this.direccion = direccion
    }
}