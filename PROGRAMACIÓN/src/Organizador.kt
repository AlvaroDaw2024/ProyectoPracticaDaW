import java.time.LocalDate

class Organizador {
    var nombre = ""
    var email = ""
    var telefono = 0
    var ID_Organizador = 0
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


    private fun crearEventoOnline(): Online { //Las hago private para que solo pueda utilizarlas los organizadores
        var categoria: ArrayList<Categoria> = ArrayList<Categoria>()
        categoria.add(Categoria.devolverCategoria())
        var inscritos = ArrayList<Usuario>()
        var asistentes = ArrayList<Usuario>()
        var idEvento: Int = Evento.devolverId()
        var nombre: String = NombreEvento.devolverNombreEventoAleatorio()
        var fecha: LocalDate = Factoria.generarFechaFuturaAleatoria()
        var ubicacion: String = CONSTANTES.ONLINE
        var tipo = CONSTANTES.ONLINE
        var paginaweb = Webs.webAleatoria()
        return Online(categoria,inscritos,asistentes,idEvento,nombre,fecha,ubicacion,tipo,paginaweb)
    }

    private fun crearEventoPresencial(): Presencial {
        var categoria: ArrayList<Categoria> = ArrayList<Categoria>()
        categoria.add(Categoria.devolverCategoria())
        var inscritos = ArrayList<Usuario>()
        var asistentes = ArrayList<Usuario>()
        var idEvento: Int = Evento.devolverId()
        var nombre: String = NombreEvento.devolverNombreEventoAleatorio()
        var fecha: LocalDate = Factoria.generarFechaFuturaAleatoria()
        var ubicacion: String = Ubicacion.ubicacionAleatoria()
        var tipo = CONSTANTES.PRESENCIAL
        var direccion = Ubicacion.ubicacionAleatoria()
        return Presencial(categoria,inscritos,asistentes,idEvento,nombre,fecha,ubicacion,tipo,direccion)
    }

    fun printEventosOrganizados(){
        println("El organizador $nombre con ID:$ID_Organizador ha creado estos eventos:")
        for (i in eventosOrganizados.indices){
            eventosOrganizados[i].toString()
        }
    }

    override fun toString(): String {
        return "Organizador(nombre='$nombre', email='$email', telefono=$telefono, ID_Organizador=$ID_Organizador, eventosOrganizados=$eventosOrganizados)"
    }

    fun devolverId():Int{
        return ID_Organizador
    }

}