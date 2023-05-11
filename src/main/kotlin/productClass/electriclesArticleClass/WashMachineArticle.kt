package productClass.electriclesArticleClass

class TvArticle(id:Int,name:String,price:Double,art:String):ElectricArticles(id, name, price, art){
    var marke= mutableListOf<String>("LG","Samsung","Sony","Toshiba","Medion")
}