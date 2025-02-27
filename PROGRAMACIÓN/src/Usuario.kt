class Usuario {
    var nombre = ""
    var email = ""
    var password = ""
    var ID_Usuario = 0
    var eventosInscritos = ArrayList<Evento>()
    var eventosAsistidos = ArrayList<Evento>()

    constructor(
        eventosAsistidos: ArrayList<Evento>,
        eventosInscritos: ArrayList<Evento>,
        ID_Usuario: Int,
        password: String,
        email: String,
        nombre: String
    ) {
        this.eventosAsistidos = eventosAsistidos
        this.eventosInscritos = eventosInscritos
        this.ID_Usuario = ID_Usuario
        this.password = password
        this.email = email
        this.nombre = nombre
    }


    fun printEventosInscritos() {
        println("El usuario $nombre con ID:$ID_Usuario se ha inscrito en estos eventos:")
        for (i in eventosInscritos.indices) {
            println("$i) ${eventosInscritos[i]}")
        }
    }

    fun printEventosAsistidos() {
        println("El usuario $nombre con ID:$ID_Usuario ha asistido a estos eventos:")
        for (i in eventosAsistidos.indices) {
            println("$i) ${eventosAsistidos[i]}")
        }
    }

    override fun toString(): String {
        return "Usuario(nombre='$nombre', email='$email', password='$password', ID_Usuario=$ID_Usuario, eventosInscritos=$eventosInscritos, eventosAsistidos=$eventosAsistidos)"
    }

    fun devolverId(): Int {
        return ID_Usuario
    }

    private fun cancelarInscripcion(numero: Int) {
        this.eventosInscritos.removeAt(numero)
    }

    fun asistirEvento(){
        for (i in eventosInscritos.indices){
            var random = CONSTANTES.PROBABILIDAD.random()
            if (random in CONSTANTES.PROBABILIDAD_ASISTIR){
                eventosAsistidos.add(eventosInscritos[i])
            }
        }

    }
}