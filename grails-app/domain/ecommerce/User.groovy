package ecommerce

class User {

    String userName
    String password
    String role
    String emailAddress


    static constraints = {
        userName(blank: false,nullable: false,minSize: 4)
        password(blank: false,nullable: false,minSize: 4)
        role(inList: ['ADMIN','SUPER_ADMIN','APPLICATION','USER'])
        emailAddress(email: true)
    }
}
