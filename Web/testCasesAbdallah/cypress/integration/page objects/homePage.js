/// <reference types = "Cypress"/>

class HomePage

{


clickFDM(){
    
    const field = cy.contains('FDM')
    field.click({ force: true })
    return this

}

clickUserManagement(){

    const field = cy.contains('User Management')
    field.click({ force: true })
    return this


}

InsertMovement(){

   return  cy.get('.Grid_extended_menu').contains('Insert Movement')
}


}

export default HomePage