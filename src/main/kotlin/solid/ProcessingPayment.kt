package solid

class ProcessingPayment {
    fun processPayment(order: Order,payment: Payment){
        println("${order.name} \n ${order.price}" )
        when(payment.type){
            "VISA" -> println("Processing VISA payments...")
            "paypal" -> println("Processing paypal payments...")
            "master card" -> println("Processing Master card payments...")
        }
    }
}