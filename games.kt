fun main(args : Array<String>){


    //The days and time tables of pt

    class ptdays() {
        var pttime=2
        var ptday= arrayOf("wednesday","friday")
    }
    val ptday=ptdays()
    class timetable{

        val kabbdi=ptday.ptday[1]
        val hideandseek =ptday.ptday[0]






    }
    val tt=timetable()

    //the leaders
    class members() {
        var m1 = "aadisankar"
        var m2 = "rayan shafiq"
        var m3 = "ishaan hiran"
        var m4 = "arlo manu george"
        var m5 = "shaun parakkal"
        var m6 = "aron sebastin"
    }
    val mmb=members()
    class leaders()
    {

        var kabbdileader=mmb.m1
        var hideandseekleader=mmb.m2
        var groupleader=mmb.m3
        var p1=mmb.m4
        var p2=mmb.m6
        var o=mmb.m5



    }
    val l=leaders()
    println("ptdays we have is " + ptday.pttime)
    print(" which are:")
    for (time in ptday.ptday)
    {

        println(time)
    }
    println("our leaders")
    println("kabbdi leader is "+l.kabbdileader)
    println("hide and seek leader is "+l.hideandseekleader)
    println("our group leader is "+l.groupleader)
    println("primary leaders:")
    println(l.p1)
    println(l.p2)
    println("our officer:")
    println(l.o)








}