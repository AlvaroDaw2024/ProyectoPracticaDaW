class Organizador {
    var nombre=""
    var email=""
    var telefono=""
    var ID_Organizador=0
    var eventosOrganizados = ArrayList<Evento>()

    constructor(
        nombre: String,
        email: String,
        telefono: String,
        ID_Organizador: Int,
        eventosOrganizados: ArrayList<Evento>
    ) {
        this.nombre = nombre
        this.email = email
        this.telefono = telefono
        this.ID_Organizador = ID_Organizador
        this.eventosOrganizados = eventosOrganizados
    }
}