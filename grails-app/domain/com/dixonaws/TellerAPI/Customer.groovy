package com.dixonaws.TellerAPI

class Customer {

    static constraints = {
    }

    static hasMany=[accounts:Account]

    String firstName
    String lastName
    String address
    String city
    String state
    String zip

    public String toString() {
        return(lastName + ", " + firstName)
    }
}
