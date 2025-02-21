import java.time.LocalDate
import kotlin.random.*

class Factoria {
    companion object {
        private var ID_Usuario = 1
        var ID_Evento = 1
        private var ID_Organizador = 1

        private fun crearUsuario(): Usuario {
            val nombre: String = Nombres.nombreAleatorio()
            val email = Emails.emailAleatorio()
            val password = passwordAleatoria()
            val ID_Usuario = ID_Usuario++
            val eventosAsistidos = ArrayList<Evento>()

            return Usuario(nombre, email, password, ID_Usuario, eventosAsistidos)
        }

        private fun crearOrganizador(): Organizador {
            val nombre = Empresas.empresaAleatoria()
            val email = Emails.emailAleatorio()
            val telefono = tlfAleatorio()
            val ID_Organizador = ID_Organizador++
            val eventosOrganizados = ArrayList<Evento>()

            return Organizador(nombre, email, telefono, ID_Organizador, eventosOrganizados)
        }

        private fun passwordAleatoria(): String {
            var password = ""
            repeat(CONSTANTES.passwordDigitos.random()) {
                password = password + CONSTANTES.ASCII.random().toChar()
            }
            return password
        }

        private fun tlfAleatorio(): Int {
            var telefono = ""
            telefono = telefono + CONSTANTES.NUMEROTLFESPANIOL.random()
            repeat(CONSTANTES.TAMANIOTELEFONO) {
                telefono = telefono + CONSTANTES.NUMEROTELEFONO.random().toChar()
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


    }
}