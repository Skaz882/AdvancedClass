class Employee(var name: String?, var position: PositionTitle, var salary: Boolean, var payRate: Double, var shift: Int, var startDate: String?) {
    fun display(){
        println(name.toString() + "\n " + position + "\n "+ salary + "\n "+ payRate + "\n "+ shift + "\n "+ startDate)
        /**class Employee
         * @author Sarah Kazmierczak
         * date 10/05/2020
         * @param
         * name: this describes the name of the person
         * position: this links to the PositionTitle class
         * salary: this describes whether or not the person is salaried
         * payRate: this describes the rate of pay per person
         * shift: this describes the person's shift
         * startDate: this describes the person's start date.  It isn't actually important though.
         */
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
