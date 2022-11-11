/// <reference types="Cypress" />
import {FDM} from "./pages/FDM"
import {insertMovement} from "./pages/insertMovement"

describe("turnaroundmovements",()=>{

    it.only("TC_064", () => {
        cy.contains("FDM").click({force:true})
        const fdm = new FDM()
        
        cy.wait(4000)
        fdm.ChangeArrDep("Turnaround")
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()
            
        const im = new insertMovement() 

        const random = Math.floor(Math.random()*10000)
            
        im.fillAllArrivalMandatoryfields(random.toString())
        im.fillAllDepartureMandatoryfields(random.toString())
        im.getSaveButton().click()
        im.getSaveYes().click()
        
        cy.wait(5000)
        fdm.getArrivalTurnaroundColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("exist")
        fdm.getDepartureTurnaroundColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("exist")

        fdm.ChangeArrDep("Arrival")
        fdm.getColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("exist")
        
        fdm.ChangeArrDep("Departure")
        fdm.getColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("exist")

        

    });

    it("TC_065", () => {
        cy.contains("FDM").click({force:true})
        const fdm = new FDM()
        cy.wait(4000)
        fdm.ChangeArrDep("Turnaround")
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()
        
        const random = Math.floor(Math.random()*10000)
        const im = new insertMovement() 

        im.fillAllArrivalMandatoryfields(random)
        im.fillAllDepartureMandatoryfields(random)

        im.getArrivalItem("sibt").clear()
        im.getSaveButton().click()
        im.getSaveYes().click()

        im.getErrorMessage().should("contain.text","Please fill Arrival Date")

        im.getCloseButton().click()
        cy.wait(5000)

        fdm.getArrivalTurnaroundColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("not.exist")
        fdm.getDepartureTurnaroundColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("not.exist")
        
        
        fdm.ChangeArrDep("Arrival")
        fdm.getColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("not.exist")
    });
})
