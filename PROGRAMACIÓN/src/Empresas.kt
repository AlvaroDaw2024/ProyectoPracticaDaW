enum class Empresas(val nombre: String) {

    EVENTBRITE("Eventbrite"),
    CVENT("Cvent"),
    BIZZABO("Bizzabo"),
    SPLASH("Splash"),
    MEETUP("Meetup"),
    GREENPEACE("Greenpeace"),
    ECOEVENTOS("EcoEventos"),
    SUSTAINABLE_SOLUTIONS("Sustainable Solutions"),
    VERDEVENTOS("VerdeEventos"),
    ECO_INNOVATIONS("Eco Innovations");

    companion object {
        fun empresaAleatoria(): String {
            return values().random().nombre
        }
    }
}
