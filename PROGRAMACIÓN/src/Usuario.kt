class Usuario {
    var nombre=""
    var email=""
    var password=""
    var ID_Usuario=0
    var eventosAsistidos=ArrayList<Evento>()

    constructor(nombre: String, email: String, password: String, ID_Usuario: Int, eventosAsistidos: ArrayList<Evento>) {
        this.nombre = nombre
        this.email = email
        this.password = password
        this.ID_Usuario = ID_Usuario
        this.eventosAsistidos = eventosAsistidos
    }
}