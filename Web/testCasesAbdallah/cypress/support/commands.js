// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
//
//
// -- This is a parent command --
// Cypress.Commands.add('login', (email, password) => { ... })



Cypress.Commands.add("login", () => {

    cy.visit("http://185.114.89.129:31080/");
    cy.get('.mui_input_group  [name=username]').type('qauser')
    cy.get('.mui_input_group  [name=password]').type('QAuser@123')
    cy.get('.mui_input_group  [name=client]').type('DXB')
    cy.get(':nth-child(3) > .login_form_btn').click()
    
    })



Cypress.Commands.add("getMovementIcon", () => {

    cy.get('.fdm--toolbar  .MuiButtonBase-root ')
    
    })

    Cypress.Commands.add("getInsertMovement", () => {
    cy.get('.Grid_extended_menu').contains('Insert Movement')
    })

Cypress.Commands.add("save", () => {

    

       cy.get('.fdm_tbx').contains('Save')
  
     
     
        })

Cypress.Commands.add("save_yes", () => {

      cy.get('.save_yes')

})

Cypress.Commands.add("getError", () => {

    cy.get('[type="error"]')

})


Cypress.Commands.add("Insert Movement", () => {

    cy.get('.Grid_extended_menu').contains('Insert Movement')

})







//
//
// -- This is a child command --
// Cypress.Commands.add('drag', { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add('dismiss', { prevSubject: 'optional'}, (subject, options) => { ... })
//
//
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite('visit', (originalFn, url, options) => { ... })