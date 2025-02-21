open class Evento {
    var Categoria:ArrayList<Categoria> = ArrayList<Categoria>()
    var inscritos=ArrayList<Usuario>()
    var asistentes=ArrayList<Usuario>()
    var IdEvento:Int=0
    var nombre:String=""
    var fecha:String=""
    var ubicacion:String=""
    var tipo=""

    constructor(){}
    constructor(
        tipo: String,
        ubicacion: String,
        fecha: String,
        nombre: String,
        IdEvento: Int,
        asistentes: ArrayList<Usuario>,
        inscritos: ArrayList<Usuario>,
        Categoria: ArrayList<Categoria>
    ) {
        this.tipo = tipo
        this.ubicacion = ubicacion
        this.fecha = fecha
        this.nombre = nombre
        this.IdEvento = IdEvento
        this.asistentes = asistentes
        this.inscritos = inscritos
        this.Categoria = Categoria
    }


}