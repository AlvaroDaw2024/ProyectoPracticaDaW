enum class Ubicacion (val direccion: String){

        MADRID_CENTER("Calle de Alcalá, 50, Madrid, España"),
        BARCELONA_TECH("Carrer de Balmes, 12, Barcelona, España"),
        VALENCIA_CITY("Avinguda de les Corts Valencianes, 33, Valencia, España"),
        SEVILLA_CONFERENCE("Calle Sierpes, 20, Sevilla, España"),
        BILBAO_INNOVATION("Gran Vía de Don Diego López de Haro, 15, Bilbao, España"),
        ZARAGOZA_EVENT("Calle del Coso, 22, Zaragoza, España"),
        GRANADA_CENTER("Calle Recogidas, 7, Granada, España"),
        MALAGA_ART("Calle Marqués de Larios, 5, Málaga, España"),
        DONOSTIA_BUSINESS("Avenida de Tolosa, 8, Donostia, España"),
        ALICANTE_COMMUNITY("Calle San Fernando, 18, Alicante, España");

        companion object {
            fun ubicacionAleatoria(): String {
                return values().random().direccion
            }
        }
    }

}