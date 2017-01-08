package com.dixonaws.TellerAPI

import java.sql.Timestamp

class Transaction {
    Float amount
    Date datePosted
    String type     // debit or credit
    String entity
    Account account
    String description

    static belongsTo=[account:Account]

    static constraints = {
    }

    public String toString() {
        return( amount + " (" + entity + ", " + account.toString() + ")")
    }
}
