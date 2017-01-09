package tellerapi

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/api/customers"(resources:'Customer')
        "/api/accounts"(resources:'Account')
        "/api/transactions"(resources:'Transaction')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
