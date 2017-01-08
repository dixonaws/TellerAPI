package com.dixonaws.TellerAPI

class Account {

    static constraints = {
    }

    static belongsTo=[customer:Customer]
    static hasMany=[transactions:Transaction]

    String accountNumber
    String type
    Customer customer
    Float balance

    public String toString() {
        return( accountNumber + " (" + customer.toString() + " - " + type + ")" )

    }
}
