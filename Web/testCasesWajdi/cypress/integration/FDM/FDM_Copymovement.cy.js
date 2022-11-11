/// <reference types="Cypress" />
import {FDM} from "./pages/FDM"
import {insertMovement} from "./pages/insertMovement"
import {copyMovement} from "./pages/copyMovement"

describe("copy movement",()=>{

    it("TC_074", () => {
        
        cy.contains("FDM").click({force:true})

        const fdm = new FDM()
        
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()

        const im = new insertMovement() 

        const random = Math.floor(Math.random()*10000)
        
        im.fillAllArrivalMandatoryfields(random.toString())
        im.getSaveButton().click()
        im.getSaveYes().click()

        cy.wait(4000)
        fdm.getColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).click({force:true})
        
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Copy Movement").click()

        const cm = new copyMovement()
        cm.checkInsertWizard()
        cm.checkArrivalDetails(random.toString())
        im.getArrivalItem("sibt").type("+1")
        im.getArrivalItem("number").clear().type((random+1).toString())

        cm.saveAndClose()
        cy.wait(4000)
        fdm.getColumn("flightNo").contains(new RegExp(`0B ${random+1}`,"g")).should("exist")
    });

    it("TC_075", () => {
        cy.contains("FDM").click({force:true})

        const fdm = new FDM()
        
        cy.wait(4000)
        fdm.ChangeArrDep("Departure")
        // fdm.deleteAllmovements()

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()

        const im = new insertMovement() 

        const random = Math.floor(Math.random()*10000)
        
        im.fillAllDepartureMandatoryfields(random.toString())
        im.getSaveButton().click()
        im.getSaveYes().click()

        cy.wait(4000)
        fdm.getColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).click({force:true})
        
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Copy Movement").click()

        const cm = new copyMovement()
        cm.checkInsertWizard()
        cm.checkDepartureDetails(random.toString())
        im.getDepartureItem("sobt").type("+1")
        im.getDepartureItem("number").clear().type((random+1).toString())

        cm.saveAndClose()
        cy.wait(4000)
        fdm.getColumn("flightNo").contains(new RegExp(`0B ${random+1}`,"g")).should("exist")
    });

    it("TC_076", () => {
        cy.contains("FDM").click({force:true})

        const fdm = new FDM()
        
        cy.wait(4000)
        fdm.ChangeArrDep("Turnaround")
        // fdm.deleteAllmovements()

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()

        const im = new insertMovement() 

        const random = Math.floor(Math.random()*10000)
        
        im.fillAllArrivalMandatoryfields(random.toString())
        im.fillAllDepartureMandatoryfields(random.toString())
        im.getSaveButton().click()
        im.getSaveYes().click()

        cy.wait(4000)
        fdm.getArrivalTurnaroundColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).click({force:true})
        
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Copy Movement").click()

        const cm = new copyMovement()
        cm.checkInsertWizard()
        cm.checkArrivalDetails(random.toString())
        cm.checkDepartureDetails(random.toString())

        im.getDepartureItem("sobt").type("+1")
        im.getDepartureItem("number").clear().type((random+1).toString())

        im.getArrivalItem("sibt").type("+1")
        im.getArrivalItem("number").clear().type((random+1).toString())

        cm.saveAndClose()
        cy.wait(4000)
        fdm.getArrivalTurnaroundColumn("flightNo").contains(new RegExp(`0B ${random+1}`,"g")).should("exist")
        fdm.getDepartureTurnaroundColumn("flightNo").contains(new RegExp(`0B ${random+1}`,"g")).should("exist")
    });
})