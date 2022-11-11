import {insertMovement} from "./insertMovement"

class copyMovement{
    constructor(){}
    
    checkInsertWizard(){
        return cy.get(".is_fdmEditable").should("be.visible")
    }

    checkArrivalDetails(nb){
        const im = new insertMovement()
        im.getArrivalItem("originIcao").find("input").should("have.value","SAMA")
        im.getArrivalItem("airlineIata").find("input").should("have.value","0B")
        im.getArrivalItem("number").find("input").should("have.value",nb)
        im.getArrivalItem("status").find("input").first().should("have.value","OP")
        im.getArrivalItem("natureCode").find("input").first().should("have.value","AF")
        im.getAircraftType().find("input").first().should("have.value","L12")
    }

    checkDepartureDetails(nb){
        const im = new insertMovement()
        im.getDepartureItem("destnIcao").find("input").should("have.value","SANI")
        im.getDepartureItem("airlineIata").find("input").should("have.value","0B")
        im.getDepartureItem("number").find("input").should("have.value",nb)
        im.getDepartureItem("status").find("input").first().should("have.value","OP")
        im.getDepartureItem("natureCode").find("input").first().should("have.value","AF")
        im.getAircraftType().find("input").first().should("have.value","L12")
    }
    saveAndClose(){
        cy.get(".btn-green").click()
        cy.get(".MuiPaper-root").contains("Yes").click()
        cy.get(".flightDetailes__close").click()
    }
}


export {copyMovement}