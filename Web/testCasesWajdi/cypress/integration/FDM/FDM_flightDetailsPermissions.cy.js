/// <reference types="Cypress" />
import {FDM} from "./pages/FDM"
import { userManagementPage } from  "./pages/userManagementPage" 

describe("flight details permissions", ()=>{


    it("TC_105", () => {
        cy.contains("User Management").click({force:true})
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.getFlightDetails().click({force:true})
        userManagement.checkOption(".edit_cBox")
        userManagement.saveChanges()

        userManagement.loginNewUser()

        const fdm = new FDM()
        cy.get(".ag-center-cols-container > div").eq(1).dblclick({force:true})

        cy.get(".fdm__module_box").contains("Edit").should("be.visible")
        
    });

    it("TC_106", () => {
        cy.contains("User Management").click({force:true})
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.getFlightDetails().click({force:true})
        userManagement.uncheckOption(".edit_cBox")
        userManagement.saveChanges()

        userManagement.loginNewUser()

        const fdm = new FDM()
        cy.get(".ag-center-cols-container > div").eq(1).dblclick({force:true})

        cy.get(".fdm__module_box").contains("Edit").should("not.exist")
        
    });
})