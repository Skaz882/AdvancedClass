class Employee(var name: String?, var position: PositionTitle, var salary: Boolean, var payRate: Double, var shift: Int, var startDate: String?) {
    fun display(){
        println(name.toString() + "\n " + position + "\n "+ salary + "\n "+ payRate + "\n "+ shift + "\n "+ startDate)

    }
    fun calculate(i: Int) {
        val hours = shift + payRate
        if (shift == 2)
            payRate * 0.5
        if (shift == 3)
            payRate * .10
        if (hours > 40)
            payRate *1.5

    }
}
