class Organizador {
    var nombre=""
    var email=""
    var telefono=0
    var ID_Organizador=0
    var eventosOrganizados = ArrayList<Evento>()

    constructor(
        nombre: String,
        email: String,
        telefono: Int,
        ID_Organizador: Int,
        eventosOrganizados: ArrayList<Evento>
    ) {
        this.nombre = nombre
        this.email = email
        this.telefono = telefono
        this.ID_Organizador = ID_Organizador
        this.eventosOrganizados = eventosOrganizados
    }


    private fun crearEventoOnline():Online{
        var Categoria:ArrayList<Categoria> = ArrayList<Categoria>()
        var inscritos=ArrayList<Usuario>()
        var asistentes=ArrayList<Usuario>()
        var IdEvento:Int=0
        var nombre:String=""
        var fecha:String=""
        var ubicacion:String=""
        var tipo="Online"

    }
    private fun crearEventoPresencial():Presencial{

    }
}