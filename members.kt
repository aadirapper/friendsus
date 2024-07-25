fun main(args : Array<String>){
    class members() {
        var m1 = "aadisankar"
        var m2 = "rayan shafiq"
        var m3 = "ishaan hiran"
        var m4 = "arlo manu george"
        var m5 = "shaun parakkal"
        var m6 = "aron sebastin"

    }
    val mmb = members()
        println("members:")
        println(mmb.m1)
        println(mmb.m2)
        println(mmb.m3)
        println(mmb.m4)
        println(mmb.m5)
        println(mmb.m6)
    class petname() {
        val petnames = arrayOf("aadi", "rayan", "ishaan", "arlo", "shaun", "aron")
    }
    val petn = petname()
    println("pet names:")
    for(a in petn.petnames) {
    println(a)

    }
    class membersnumbers(){
        var aadi = 1
        var rayan =2
        var ishaan =3
        var arlo=4
        var shaun=5
        var aron=6



    }
    val mmbno=membersnumbers()
    println("first added in group:")
    println(petn.petnames[0]+" "+mmbno.aadi)
    println(petn.petnames[1]+" "+mmbno.rayan)
    println(petn.petnames[2]+" "+mmbno.ishaan)
    println(petn.petnames[3]+" "+mmbno.arlo)
    println(petn.petnames[4]+" "+mmbno.shaun)
    println(petn.petnames[5]+" "+mmbno.aron)

}