package ss.rest.test

class Form {

    static constraints = {
    firstname_1(blank: true, nullable: true)
    lastname_1(blank: true, nullable: true)
    occupation_2(blank: true, nullable: true)
    employer_2(blank: false, nullable: true)
    printname_3(blank: true, nullable: true)
    address_3(blank: true, nullable: true)
    }

    String firstname_1
    String lastname_1
    String occupation_2
    String employer_2
    String printname_3
    String address_3
}
