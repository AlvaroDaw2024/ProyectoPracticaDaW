fun main() {
    var usuarios = ArrayList<Usuario>()
    var organizadores = ArrayList<Organizador>()

    repeat(CONSTANTES.CANTIDAD_USUARIOS.random()) {
        usuarios.add(Factoria.crearUsuario())
    }
    repeat(CONSTANTES.CANTIDAD_ORGANIZADORES.random()) {
        organizadores.add(Factoria.crearOrganizador())
    }
    println()
    println("Tenemos estos usuarios")

    for (i in usuarios.indices) {
        println(usuarios[i])
    }
    println()
    println("Y estos organizadores")

    for (i in organizadores.indices) {
        println(organizadores[i])
    }

    println()
    println("Vamos a crear eventos")

    for (i in organizadores.indices){
        var eventosAleatorios = CONSTANTES.CANTIDAD_EVENTOS.random()
        repeat(eventosAleatorios){
            var probabilidad = CONSTANTES.PROBABILIDAD.random()
            when (probabilidad){
                in CONSTANTES.PROBABILIDAD_EVENTOONLINE ->{
                    organizadores[i].crearEventoOnline()
                }
                in CONSTANTES.PROBABILIDAD_EVENTOPRESENCIAL ->{
                    organizadores[i].crearEventoPresencial()
                }
            }
        }
    }

    for (i in organizadores.indices){
        organizadores[i].printEventosOrganizados()
    }

    println("Simulacion de usuarios inscribiendose y/o asistiendo")
    println()


    for (i in usuarios.indices) {
        for (j in organizadores.indices) {
            var eventos = organizadores[j].eventosOrganizados //se que es violentar pero tengo la cabeza hecha un bombo
            for (k in eventos.indices){
                var probabilidad = CONSTANTES.PROBABILIDAD.random()
                when (probabilidad) {
                    in CONSTANTES.PROBABILIDAD_INSCRIBIRSE -> {
                        usuarios[i].inscribirseEvento(eventos[k])
                    }
                }
            }
        }
    }
    println("Y asi quedan los usuarios")
    println()
    for (i in usuarios.indices){
        usuarios[i].printEventosInscritos()
        println()
    }

    for (i in usuarios.indices){
        usuarios[i].asistirEvento()
        println()
    }
    println("Los usuarios han asistido a: ")
    println()
    for (i in usuarios.indices){
        usuarios[i].printEventosAsistidos()
        println()
    }

    println("Y para comprobar la comunicacion entre ellos:")
    println()
    for (i in organizadores.indices){
        for (j in organizadores[i].eventosOrganizados.indices){
            organizadores[i].eventosOrganizados[j].printUsuariosInscritos()
        }
    }
    println()
    for (i in organizadores.indices){
        for (j in organizadores[i].eventosOrganizados.indices){
            organizadores[i].eventosOrganizados[j].printUsuariosAsistentes()
        }
    }
}