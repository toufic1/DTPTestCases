/// <reference types="Cypress" />
import {FDM} from "./pages/FDM"
import { insertMovement } from "./pages/insertMovement";
import {deleteMovement} from "./pages/deleteMovement"

describe("delete movement",()=>{

    it("TC_077", () => {
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
        fdm.getTopLeftIconOption("Delete Movement").click()

        const dm = new deleteMovement()
        dm.checkTitle(random.toString())
        dm.confirmDelete()

        fdm.getColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("not.exist")
    });

    it("TC_078", () => {
        cy.contains("FDM").click({force:true})

        const fdm = new FDM()

        cy.wait(4000)
        fdm.ChangeArrDep("Departure")
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
        fdm.getTopLeftIconOption("Delete Movement").click()

        const dm = new deleteMovement()
        dm.checkTitle(random.toString())
        dm.confirmDelete()

        fdm.getColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("not.exist")  
    });

    it("TC_079", () => {
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

        cy.wait(4000)
        fdm.getColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).click({force:true})
        
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Delete Movement").click()

        const dm = new deleteMovement()
        dm.checkTitle(random.toString())
        dm.confirmDelete()  
        fdm.getArrivalTurnaroundColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("not.exist")
        fdm.getDepartureTurnaroundColumn("flightNo").contains(new RegExp(`0B ${random}`,"g")).should("not.exist")
    });
})