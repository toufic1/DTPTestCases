/// <reference types ='Cypress' />
import {FDM} from "./pages/FDM.js"

describe("FDM", ()=>{    
    it('TC_001', () => {
        
        const fdm = new FDM()
        cy.contains("FDM").click({force:true})
        fdm.getTopLeftIcon().should("be.visible")
    })

    it('TC_002', () => {
        
        cy.contains("FDM").click({force:true})

        const fdm = new FDM()
        
        fdm.getTopLeftIcon().click()        
        
        fdm.getTopLeftIconOption("Insert Movement").should("be.visible")
        fdm.getTopLeftIconOption("Copy Movement").should("be.visible")
        fdm.getTopLeftIconOption("Delete Movements").should("be.visible")

    })
})