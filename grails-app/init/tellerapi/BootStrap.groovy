package tellerapi

import com.dixonaws.TellerAPI.Account
import com.dixonaws.TellerAPI.Customer
import com.dixonaws.TellerAPI.Transaction

class BootStrap {

    def init = { servletContext ->
        def transaction0 = new Transaction(
                datePosted: new Date("1/6/2017 3:11:25"),
                amount: 9482.22,
                type: "credit",
                entity: "Comerica",
                description: "Deposit"
        )

        def transaction1 = new Transaction(
                datePosted: new Date("1/6/2017 4:15:29"),
                amount: 19.99,
                type: "debit",
                entity: "Amazon.com",
                description: "Online purchase"
        )

        def transaction2 = new Transaction(
                datePosted: new Date("1/6/2017 4:27:26"),
                amount: 49.99,
                type: "debit",
                entity: "Amazon.com",
                description: "Online purchase"
        )

        def transaction3 = new Transaction(
                datePosted: new Date("1/7/2017 14:27:26"),
                amount: 22.67,
                type: "debit",
                entity: "Amazon.com",
                description: "Online purchase"
        )

        def account0=new Account(transactions: [transaction0, transaction1, transaction2, transaction3],
                type: "Checking",
                balance: 9898.31,
                accountNumber: "03750471"
        )

        def account1=new Account(
                type: "Savings",
                balance: 33898.31,
                accountNumber: "01963088"
        )

        def customer0=new Customer(accounts: [account0, account1],
                customerId: "001",
                firstName: "Mark",
                lastName: "Fontana",
                address: "3701 Hamlin Rd",
                city: "Auburn Hills",
                state: "MI",
                zip: "48236"
        )

        account0.setCustomer(customer0)

        // we don't need to save each account -- saving the customer will also save the account and transaction objects
        assert customer0.save(failOnError: true, flush: true, insert: true)
    }
    def destroy = {
    }
}
