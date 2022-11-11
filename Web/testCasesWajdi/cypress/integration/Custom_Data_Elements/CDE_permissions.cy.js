/// <reference types="Cypress" />
import {userManagementPage} from './pages/userManagementPage.js'

describe("permissions", ()=>{

    it("TC_001", () => {
        
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("Custom Data Elements")
        userManagement.uncheckVisible()
        userManagement.saveChanges()
        
        //login new user
        userManagement.loginNewUser()
        cy.contains("Custom Data Elements").should("not.exist")
    });


    it("TC_002", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("Custom Data Elements")
        userManagement.checkVisible()
        userManagement.saveChanges()
        
        //login new user
        userManagement.loginNewUser()

        cy.contains("Custom Data Elements").should("be.visible")
    });


    it("TC_003", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("Custom Data Element Grid")
        
        cy.get("[title = 'Make Disable'],[title = 'Make Enable']")
            .each((e,count,list)=>{
                if (e.attr("title") == "Make Disable"){
                    cy.wrap(e).click({force:true})
                }
            })

        userManagement.saveChanges()
        
        //login new user
        userManagement.loginNewUser()
        cy.contains("Custom Data Elements").click({force:true})
        cy.get('[ref = "eText"]').should("not.exist")
    });

    it("TC_004", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("Custom Data Element Grid")
        
        cy.get("[title = 'Make Disable'],[title = 'Make Enable']")
            .each((e,count,list)=>{
                if (e.attr("title") == "Make Enable"){
                    cy.wrap(e).click({force:true})
                }
            })

        userManagement.saveChanges()
        
        //login new user
        userManagement.loginNewUser()
        cy.contains("Custom Data Elements").click({force:true})
        
        cy.get(".ag-header-container").contains("Field Name").should("be.visible")
        cy.get(".ag-header-container").contains("Reference Data Type").should("be.visible")
        cy.get(".ag-header-container").contains("Data Type").should("be.visible")
        cy.get(".ag-header-container").contains("Label").should("exist")
        cy.get(".ag-header-container").contains("Type").should("exist")

        cy.get(".ag-header-container").contains("Field Name").click().then(()=>{
            
            for (let i = 0; i < 9; i++) {
                cy.get("body").type("{rightarrow}")
            }
        })

        cy.get(".ag-header-container").contains("Creation Date").should("exist")
        cy.get(".ag-header-container").contains("Updated By").should("be.visible")
        cy.get(".ag-header-container").contains("Created By").should("be.visible")
        cy.get(".ag-header-container").contains("Last Update").should("be.visible")

    });
})
