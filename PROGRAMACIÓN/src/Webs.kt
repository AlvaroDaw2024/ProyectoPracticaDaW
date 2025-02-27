enum class Webs(val link: String) {
    GREENPEACE("https://www.greenpeace.org/"),
    TREEHUGGER("https://www.treehugger.com/"),
    SUSTAINABLE_CITIES("https://www.sustainablecitiescollective.com/"),
    ECO_ALTERNATIVA("https://www.ecoalternativa.com/"),
    ECOBUSINESS("https://www.ecobusiness.com/"),
    THE_GUARDIAN_ENVIRONMENT("https://www.theguardian.com/environment"),
    ECOWATCH("https://www.ecowatch.com/"),
    ENVIRONMENTAL_NEWS("https://www.enn.com/"),
    SUSTAINABLE_BRANDS("https://sustainablebrands.com/"),
    GREENBIZ("https://www.greenbiz.com/"),
    PLANETA_SOSTENIBLE("https://www.planetassostenible.com/"),
    ECOPORTAL("https://www.ecoportal.net/"),
    ECONVENTOS("https://www.ecoinventos.com/");

    companion object {
        fun webAleatoria(): String {
            return values().random().link
        }
    }
}
