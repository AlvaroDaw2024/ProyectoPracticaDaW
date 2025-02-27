class CONSTANTES {
    companion object{
        val SIMULACION=100
        val ASCII=33..126
        val passwordDigitos=8..16

        //Cantidades
        val CANTIDAD_USUARIOS=10..20
        val CANTIDAD_ORGANIZADORES= 4..10
        val CANTIDAD_EVENTOS = 3..6

        //Telefonos
        val TAMANIOTELEFONO=8
        val NUMEROTELEFONO=1..9
        val NUMEROTLFESPANIOL= listOf(6,9)

        //Eventos
        val ONLINE = "Online"
        val PRESENCIAL = "Presencial"




        //Probabilidades
        val PROBABILIDAD = 1..100
        val PROBABILIDAD_INSCRIBIRSE = 1..20
        val PROBABILIDAD_ASISTIR = 1..75
        val PROBABILIDAD_EVENTOONLINE=1..50
        val PROBABILIDAD_EVENTOPRESENCIAL=51..100
        val PROB_EVENTOFALLIDO = 1..5
    }
}