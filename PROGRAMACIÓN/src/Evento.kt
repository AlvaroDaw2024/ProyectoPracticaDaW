import java.time.LocalDate

open class Evento {
    var Categoria:ArrayList<Categoria> = ArrayList<Categoria>()
    var inscritos=ArrayList<Usuario>()
    var asistentes=ArrayList<Usuario>()
    var IdEvento:Int=0
    var nombre:String=""
    var fecha:LocalDate? = null
    var ubicacion:String=""
    var tipo=""

    companion object{
        private var contadorIds=1
        fun devolverId():Int{
            return contadorIds++
        }
    }

    constructor(){}
    constructor(
        Categoria: ArrayList<Categoria>,
        inscritos: ArrayList<Usuario>,
        asistentes: ArrayList<Usuario>,
        IdEvento: Int,
        nombre: String,
        fecha: LocalDate?,
        ubicacion: String,
        tipo: String
    ) {
        this.Categoria = Categoria
        this.inscritos = inscritos
        this.asistentes = asistentes
        this.IdEvento = IdEvento
        this.nombre = nombre
        this.fecha = fecha
        this.ubicacion = ubicacion
        this.tipo = tipo
    }

    override fun toString(): String {
        return "Evento(Categoria=$Categoria, IdEvento=$IdEvento, nombre='$nombre', fecha=$fecha, ubicacion='$ubicacion', tipo='$tipo')"
    }

    fun devolverId():Int{
        return IdEvento
    }

    fun inscribirUsuario(usuario: Usuario){
        inscritos.add(usuario)
    }
    fun asistenciaUsuario(usuario: Usuario){
        asistentes.add(usuario)
    }

    fun printUsuariosInscritos(){
        println("El evento $nombre con ID:$IdEvento tiene estos usuarios inscritos: ")
        for (i in inscritos.indices) {
            println("${i+1}) ${inscritos[i]}")
        }
    }

    fun printUsuariosAsistentes(){
        println("Al evento $nombre con ID:$IdEvento finalmente asistieron estos usuarios: ")
        for (i in asistentes.indices) {
            println("${i+1}) ${asistentes[i]}")
        }
    }


}