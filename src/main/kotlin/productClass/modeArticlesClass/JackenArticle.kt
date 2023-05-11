package productClass.modeArticlesClass


class JackenArticle(id: Int, name: String, price: Double, art: String, menge: Int) : ModeArticle(id, name, price, art, menge, stuff = "") {
    var size: String = ""


    constructor(id: Int, name: String, price: Double, art: String, menge: Int, size: String, stuff: String) : this(id, name, price, art, menge) {
        this.size = size
    }


}


