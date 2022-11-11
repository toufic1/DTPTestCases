
/// <reference types = "Cypress"/>

class UserManagementPage {


    ClickEdit() {

    cy.get('.panel--header').contains('Edit').click({ force: true })

}


ClickPermissions() {

    cy.get('.profile_form_footer').contains('Permissions').click()
    return this

}


ClickInsertMovementPermission() {

cy.get('.permissions_panel_inner').contains('Insert Movement').click({ force: true })
return this


}

checkvisible()

{
  cy.get('.permission_selected .MuiFormControlLabel-root .MuiButtonBase-root  .MuiIconButton-label  .jss14').check()
}

uncheckVisible(){
cy.get('.permission_selected .MuiFormControlLabel-root .MuiButtonBase-root  .MuiIconButton-label  .jss14').uncheck()
}


Save(){
cy.get('.panel--header').contains('Save').click({ force: true })
    cy.get('.MuiDialogActions-root').contains('YES').click()
}

Logout(){

    cy.get('.header-menu_logOut   .sapUiIcon').click({ force: true })
    cy.get('.MuiDialogActions-root ').contains('Yes').click()
}

InsertArrivalMovementPermission(){

   return cy.get('.arival_btn')
}


InsertDepartureMovementPermission(){

  const field = cy.get('.insert_movement_arrow').parent().parent().contains('Departure')
  field.click()
  return this

}




} export default UserManagementPage