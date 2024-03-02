package solid

class PaymentManager {
    fun processingOrder(order: Order){
        println("processing order ${order.name}")
    }
    fun processPayment(order: Order,payment: Payment){
        println("${order.name} \n ${order.price}" )
        when(payment.type){
            "VISA" -> println("Processing VISA payments...")
            "paypal" -> println("Processing paypal payments...")
            "master card" -> println("Processing Master card payments...")
        }
    }
    fun sendEmailNotIfLocation(customer: Customer, massage: String){
            println("${customer.email} + with massage $massage")
    }
}