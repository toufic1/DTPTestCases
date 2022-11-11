class deleteMovement{
    constructor(){}

    checkTitle(nb){
        cy.get(".movementDialogTitle")
        .should("contain.text","Are you sure you want to DELETE 1 Flights")

        cy.get(".rowBodt_dmovement div").eq(0).should("contain.text", nb)
    }

    confirmDelete(){
        cy.get(".si-sys-enter").click()
    }

}


export {deleteMovement}