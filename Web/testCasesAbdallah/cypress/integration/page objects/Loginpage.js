

/// <reference types = "Cypress"/>

class LoginPage

{


visit (){

    cy.visit("http://185.114.89.129:31080/fdm")

}

FillUsername(value){

const field = cy.get('.mui_input_group  [name=username]')
field.type(value)
return this

}

FillPassword(value){

    const field = cy.get('[name="password"]')
    field.type(value)
    return this
    
    }


FillClient(value){

        const field = cy.get('[name="client"]')
        field.type(value)
        return this
        
        }


    Submit()
    {

        const button = cy.get('[type="submit"]')
        button.click()
    }



}

 export default LoginPage