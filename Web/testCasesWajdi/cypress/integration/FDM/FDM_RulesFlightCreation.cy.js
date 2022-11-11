/// <reference types="Cypress" />
import {FDM} from "./pages/FDM"
import {insertMovement} from "./pages/insertMovement"

describe("rules and processing for flight creation",()=>{

    it.skip('TC_066', () => { 
    });
    it.skip('TC_067', () => { 
    });
    it.skip('TC_068', () => { 
    });
    it.skip('TC_069', () => { 
    });
    it.skip('TC_070', () => { 
    });

    it("TC_071", () => {
        cy.contains("FDM").click({force:true})
        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()
            
        const im = new insertMovement() 

        const random = Math.floor(Math.random()*10000)
            
        im.fillAllArrivalMandatoryfields(random.toString())
        im.getArrivalItem("sibt").type("00:00+2932")
        im.getSaveButton().click()
        im.getSaveYes().click()

        im.getErrorMessage().should("contain.text","The selected date range falls outside the range of existing seasons")
    });

    it("TC_072", () => {
        cy.contains("FDM").click({force:true})
        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()
            
        const im = new insertMovement() 

        const random = Math.floor(Math.random()*10000)
            
        im.fillAllArrivalMandatoryfields(random.toString())
        im.fillAllDepartureMandatoryfields(random.toString())
        im.getArrivalItem("sibt").clear().type("02:00+5")
        im.getDepartureItem("sobt").clear().type("02:00")
        im.getSaveButton().click()
        im.getSaveYes().click()

        im.getErrorMessage()
        .should("contain.text","SOBT or EOBT for departure flight must be greater than the SIBT & EIBT of the arrival flight")
    });

    it("TC_073", () => {
        cy.contains("FDM").click({force:true})
        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()
            
        const im = new insertMovement() 

        const random = Math.floor(Math.random()*10000)
            
        im.fillAllArrivalMandatoryfields(random.toString())
        im.fillAllDepartureMandatoryfields(random.toString())
        im.getSaveButton().click()
        im.getSaveYes().click()

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()

        im.fillAllArrivalMandatoryfields(random.toString())
        im.fillAllDepartureMandatoryfields(random.toString())
        im.getSaveButton().click()
        cy.get(".info_box_body")
        .should("contain.text",`Flight 0B ${random} is already available`)
        im.getSaveYes().click()
    });
})