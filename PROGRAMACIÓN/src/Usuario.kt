class Usuario {
    var nombre=""
    var email=""
    var password=""
    var ID_Usuario=0
    var eventosInscritos=ArrayList<Evento>()
    var eventosAsistidos=ArrayList<Evento>()



    fun printEventosInscritos(){
        println("El usuario $nombre con ID:$ID_Usuario se ha inscrito en estos eventos:")
        for (i in eventosInscritos.indices){
            println("$i) ${eventosInscritos[i].toString()}")
        }
    }
    fun printEventosAsistidos(){
        println("El usuario $nombre con ID:$ID_Usuario ha asistido a estos eventos:")
        for (i in eventosAsistidos.indices){
            println("$i) ${eventosAsistidos[i].toString()}")
        }
    }

    override fun toString(): String {
        return "Usuario(nombre='$nombre', email='$email', password='$password', ID_Usuario=$ID_Usuario, eventosInscritos=$eventosInscritos, eventosAsistidos=$eventosAsistidos)"
    }

   fun devolverId():Int{
        return ID_Usuario
    }

   private fun cancelarInscripcion(numero:Int){
        this.eventosInscritos.removeAt(numero)
    }

}