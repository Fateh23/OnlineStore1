package productClass.electriclesArticleClass

import datenbankTv


open class DatenBankProduct(var id: Int, var name: String, var price: Double, var art: String, var menge: Int, var size: String, var subcategory: String) {
    lateinit var productId: Any

}

/*init {
        this.id = id
        this.name = name
        this.price = price
        this.art = art
        this.menge = menge
        this.size = size
    }

}


/*var datenbankTv:MutableList<DatenBankTv> = mutableListOf(
        DatenBankTv(12432,"Samsung",650.00,"Tv",20,"30_Zoll"),
        DatenBankTv(15532,"LG",550.40,"Tv",16,"32_Zoll"),
        DatenBankTv(12432,"Philipps",750.00,"Tv",10,"40_Zoll"),
        DatenBankTv(12432,"Samsung",650.00,"Tv",8,"30_Zoll"),
        DatenBankTv(12432,"Sony",850.00,"Tv",15,"40_Zoll")
        )
        */

fun printlistProduct(b: MutableList<DatenBankProduct>) {
    //for (product in b)
    b.forEachIndexed { index, product ->
        println(product.id.toString() + " " + product.name + " " +
                product.price + " " + product.art + " Menge:" + product.menge + " " + product.size)
    }
}

fun sortByName(list: List<DatenBankProduct>) {
    var listProduct: MutableList<String> = mutableListOf()
    var returnList: MutableList<DatenBankProduct> = mutableListOf()
    for (i in 0 until list.size) {
        listProduct.add(list[i].name)
    }
    var sortererList = listProduct.sorted()

    println(sortererList)

    for (sorted in listProduct) {
    }
}

fun sortByPrice(list: List<DatenBankProduct>) {
    var listProduct: MutableList<Double> = mutableListOf()
    //var returnList:MutableList<DatenBankProduct> = mutableListOf()
    for (i in 0 until list.size) {
        listProduct.add(list[i].price)
    }
    var neuList = listProduct.sorted()

    println(neuList)


}

/*
open fun sortByPrice(list:):<List>
{
var
return List
}
 */
//Implementiere mindestens zwei gefilterte Ansichten auf die Produkte (z.B. nach
//Unterkategorie).
fun gefiltertAnsicht() {

}


//Der Store erlaubt es Kunden, Produkte zu ihrem Warenkorb hinzuzufügen
fun warenkorb() {

}

//und zeigt den Gesamtpreis an.

fun gesamtPreis() {

}


*/
fun addProduct(list: List<DatenBankProduct>) {
    println("Geben Sie die Produkt-ID ein:")
    val productId = readln().toInt()

    println("Geben Sie die Marke ein:")
    val brand = readln()

    println("Geben Sie den Preis ein:")
    val price = readln().toDouble()

    println("Geben Sie die Kategorie ein:")
    val category = readln()

    println("Geben Sie die verfügbare Anzahl ein:")
    val quantity = readln().toInt()

    println("Geben Sie die Größe ein:")
    val size = readln()

    val newTvProduct = DatenBankProduct(productId, brand, price, category, quantity, size, subcategory = "")
    datenbankTv.add(newTvProduct as TvArticle)
}

fun removeProduct() {
    println("Geben Sie die Produkt-ID des zu löschenden TV-Artikels ein:")
    val productIdToDelete = readln().toInt()

    val productToDelete = datenbankTv.find { it.productId == productIdToDelete }

    if (productToDelete != null) {
        datenbankTv.remove(productToDelete)
        println("Der TV-Artikel mit der Produkt-ID $productIdToDelete wurde erfolgreich gelöscht.")
    } else {
        println("Es wurde kein TV-Artikel mit der Produkt-ID $productIdToDelete gefunden.")
    }
}




