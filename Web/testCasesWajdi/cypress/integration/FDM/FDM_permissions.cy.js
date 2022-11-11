/// <reference types="Cypress" />

import {userManagementPage} from './pages/userManagementPage.js'
import {FDM} from './pages/FDM.js'

describe("permissions test",()=>{

    it("TC_003", ()=>{

        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("Insert Movement")
        userManagement.uncheckOption()
        userManagement.saveChanges()

        //login new user
        userManagement.loginNewUser()
        
        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").should("not.exist")
    })


    it("TC_004", () => {

        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("Insert Movement")
        userManagement.checkOption()
        userManagement.saveChanges()
        
        userManagement.loginNewUser()

        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").should("exist")
    })

    it("TC_005", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("Arival")
        userManagement.uncheckOption()
        userManagement.saveChanges()
        
        userManagement.loginNewUser()

        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()
        fdm.getArivalHeader().should("have.attr","disabled")
    })
    
    it("TC_006", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("Arival")
        userManagement.checkOption()
        userManagement.saveChanges()
        
        userManagement.loginNewUser()

        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()
        fdm.getArivalHeader().should("not.have.attr","disabled")
    });

    it("TC_007", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.getDeparture().click({force:true})
        userManagement.uncheckOption()
        userManagement.saveChanges()

        userManagement.loginNewUser()

        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click({force:true})
        fdm.getDepartureHeader().should("have.attr","disabled")
    });

    it("TC_008", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.getDeparture().click({force:true})
        userManagement.checkOption()
        userManagement.saveChanges()

        userManagement.loginNewUser()

        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click({force:true})
        fdm.getDepartureHeader().should("not.have.attr","disabled")
    });

    it("TC_009",()=>{
        cy.contains("User Management").click({force:true})
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("Arival")

        userManagement.getVia().then((e)=>{
            userManagement.clickIfelmHasTitle(e,"Make Disable")
        })

        userManagement.getAdep().then((e)=>{
            userManagement.clickIfelmHasTitle(e,"Make Disable")
        })

        userManagement.saveChanges()
        userManagement.loginNewUser()

        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click({force:true})
        fdm.getArrivalAdep().should("not.exist")
        fdm.getArrivalVia().should("not.exist")
    })


    it("TC010",()=>{  
        cy.contains("User Management").click({force:true})
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("Arival")
        userManagement.getVia().then((e)=>{
            userManagement.clickIfelmHasTitle(e,"Make Enable")
        })
        userManagement.getAdep().then((e)=>{
            userManagement.clickIfelmHasTitle(e,"Make Enable")
        })

        userManagement.saveChanges()
        userManagement.loginNewUser()
        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click({force:true})
        fdm.getArrivalAdep().should("exist")
        fdm.getArrivalVia().should("exist")
    })

    it("TC011", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.getDeparture().click({force:true})

        userManagement.getVia().then((e)=>{
            userManagement.clickIfelmHasTitle(e,"Make Disable")
        })

        userManagement.getAdes().then((e)=>{
            userManagement.clickIfelmHasTitle(e,"Make Disable")
        })

        userManagement.saveChanges()
        userManagement.loginNewUser()


        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click({force:true})
        fdm.getDepartureAdes().should("not.exist")
        fdm.getDepartureVia().should("not.exist")
    })

    it("TC012", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.getDeparture().click({force:true})  
        
        userManagement.getVia().then((e)=>{
            userManagement.clickIfelmHasTitle(e,"Make Enable")
        })

        userManagement.getAdes().then((e)=>{
            userManagement.clickIfelmHasTitle(e,"Make Enable")
        })

        userManagement.saveChanges()
        userManagement.loginNewUser()
        
        const fdm = new FDM()
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click({force:true})
        fdm.getDepartureVia().should("exist")
        fdm.getDepartureAdes().should("exist")
    })
    


})

