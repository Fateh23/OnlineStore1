package productClass.electriclesArticleClass

class FridgesArticle(id:Int,name:String,price:Double,art:String):ElectricArticles(id,name,price,art){
    init {
        var fridgesPrivatSizeListe:MutableList<Int> = mutableListOf(100,200,300,400,500,600)
        var fridgesFabrikSizeListe:MutableList<Int> = mutableListOf(1000,10000)
    }

}