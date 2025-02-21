open class Evento {
    var Categoria:ArrayList<Categoria> = ArrayList<Categoria>()
    var inscritos=ArrayList<Usuario>()
    var asistentes=ArrayList<Usuario>()
    var IdEvento:Int=0
    var nombre:String=""
    var fecha:String=""
    var ubicacion:String=""

    constructor(){}
    constructor(
        Categoria: ArrayList<Categoria>,
        inscritos: ArrayList<Usuario>,
        asistentes: ArrayList<Usuario>,
        IdEvento: Int,
        nombre: String,
        fecha: String,
        ubicacion: String
    ) {
        this.Categoria = Categoria
        this.inscritos = inscritos
        this.asistentes = asistentes
        this.IdEvento = IdEvento
        this.nombre = nombre
        this.fecha = fecha
        this.ubicacion = ubicacion
    }
}