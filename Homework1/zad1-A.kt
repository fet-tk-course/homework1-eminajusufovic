interface Person {

    fun ageOfThePerson () : Int
    fun country () : String

}

class Developer (val name : String, val srname : String, val age : Int, val ctry : String, val progLang : String) : Person{

    fun ageOfThePerson () : Int {
        return age
    }

    fun country () : String {
        return ctry
    }




}