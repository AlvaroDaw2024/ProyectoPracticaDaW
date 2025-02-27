import java.time.LocalDate
import kotlin.random.*
import kotlin.system.exitProcess

class Factoria {
    companion object {
        var ID_Usuario = 1

        // var ID_Evento = 1
        var ID_Organizador = 1

        fun crearUsuario(): Usuario {
            val eventosAsistidos: ArrayList<Evento> =ArrayList()
            val eventosInscritos: ArrayList<Evento> =ArrayList()
            val ID_Usuario: Int = ID_Usuario++
            val password: String = passwordAleatoria()
            val email: String = Emails.emailAleatorio()
            val nombre: String = Nombres.nombreAleatorio()

                return Usuario(eventosAsistidos,eventosInscritos,ID_Usuario,password,email,nombre)
        }

        fun crearOrganizador(): Organizador {
            val nombre = Empresas.empresaAleatoria()
            val email = Emails.emailAleatorio()
            val telefono = tlfAleatorio()
            val ID_Organizador = ID_Organizador++
            val eventosOrganizados = ArrayList<Evento>()

            return Organizador(nombre, email, telefono, ID_Organizador, eventosOrganizados)
        }

        fun passwordAleatoria(): String {
            var password = ""
            repeat(CONSTANTES.passwordDigitos.random()) {
                password = password + CONSTANTES.ASCII.random().toChar()
            }
            return password
        }

        fun tlfAleatorio(): Int {
            var telefono = ""
            telefono += CONSTANTES.NUMEROTLFESPANIOL.random().toString()
            repeat(CONSTANTES.TAMANIOTELEFONO) {
                telefono += CONSTANTES.NUMEROTELEFONO.random().toString()
            }
            return telefono.toInt()
        }

        fun generarFechaFuturaAleatoria( //sacada del gpt
            inicio: LocalDate = LocalDate.now().plusDays(1),
            fin: LocalDate = LocalDate.now().plusYears(5)
        ): LocalDate {
            val diasEntre = inicio.toEpochDay()..fin.toEpochDay()
            return LocalDate.ofEpochDay(diasEntre.random())
        }

        fun simulacion() {



        }


    }
}