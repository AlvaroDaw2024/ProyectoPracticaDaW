class CONSTANTES {
    companion object{
        val SIMULACION=100
        val ASCII=33..126
        val passwordDigitos=8..16
        val NUMERO_RANDOM = 1..100

        //Telefonos
        val TAMANIOTELEFONO=8
        val NUMEROTELEFONO=1..9
        val NUMEROTLFESPANIOL= listOf(6,9)

        //Eventos
        val ONLINE = "Online"
        val PRESENCIAL = "Presencial"
        val EVENTOFALLIDO = 1..5



        //Probabilidades
        val PROBABILIDAD_ASISTIR = 1..75
        val PROBABILIDAD_NO_ASISTIR = 76..100
        val PROBABILIDAD_EVENTOONLINE=1..50
        val PROBABILIDAD_EVENTOPRESENCIAL=51..100
    }
}