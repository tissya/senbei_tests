trait Piece{
    var location
    val race : String
    def getRace:String = {return race}
}

trait location{
    val x:Integer
    val y:Integer
}