/// <reference types = "Cypress"/>

class FDMPage 

{

    ClickMovementIcon()
    
    {

    const field = cy.get('.fdm--toolbar  .MuiButtonBase-root')
    field.click()
    return this

    }


    GetMovementIcon()

    {
        return cy.get('.fdm--toolbar  .MuiButtonBase-root')
        
        
    }

    InsertMovement(){

      return cy.get('.Grid_extended_menu').contains('Insert Movement')
    }

     CopyMovement(){

   return  cy.get('.Grid_extended_menu').contains('Copy Movement')}

   DeleteMovement(){

  return  cy.get('.Grid_extended_menu').contains('Delete Selected Movement (s)')

   }

   ArrivalMovementScreen(){


    return cy.get('.arrivalGridLeft  .form_inner_header')
    
    }

    InsertArrivalMovementPermission(){

   const field = cy.get('.insert_movement_arrow').parent().parent().contains('Departure')
   field.click()
   return this
  }

    


}

export default FDMPage