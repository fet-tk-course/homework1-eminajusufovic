interface Person {

    fun ageOfThePerson () : Int
    fun country () : String

}

open class Developer (val name : String, val srname : String, val age : Int, val ctry : String, val progLang : List<String>) : Person{

    override fun ageOfThePerson () : Int {
        return age
    }

    override fun country () : String {
        return ctry
    }
class BackendDeveloper (name : String, srname : String, age : Int, ctry : Int, progLang : List<String>, val backendFramework : String) : Developer (name, srname, age, ctry, progLang){

    fun printDeveloperData (){
        println("$name je backend programer koji koristi $progLang" , backendFramework)
    }
}


class FrontendDeveloper ( name : String, srname : String, age : Int, ctry : Int, progLang : List<String>, val frontendFramework : String) : Developer (name, srname, agre, ctry, progLang) {

    fun printDeveloperData(){
        println("$name je backend programer koji koristi $progLang" , frontendFramework)
    }
}

    fun brojProgramera (developers : List<Developer>) : Map<String, Int>{
        return developers.groupingBy { it }.eachCount()

    }

    fun prosjecnaStarost (developers : List<Developer>) : Map<String, Double>{
        return developers.groupingBy { it }.eachCount()


    }


    fun main() {
        val developers = listOf (
            BackendDeveloper ("Amila", listOf("Kotlin"), "Spring Boot")
            BackendDeveloper ("Ibrahim", listOf("Java"), "Spring")
            FrontendDeveloper ("Emina", listOf("Kotlin"), "React")
            FrontendDeveloper ("Mujo", listOf("JavaScript"), "Vue.js")
            FrontendDeveloper ("Edin", listOf("Kotlin"), "Ktor"))

        println("Broj programera koji koriste programski jezik")
        println("Prosjecna starost programera koji koriste programski jezik")








    }
