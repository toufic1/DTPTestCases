/// <reference types="Cypress" />
import {FDM} from "./pages/FDM"
import {userManagementPage} from './pages/userManagementPage.js'
import {insertPlannedTow} from "./pages/insertPlannedTow"

describe("insert tow", ()=>{

    it("TC_080", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("TOWING")
        userManagement.uncheckVisible()
        userManagement.saveChanges()

        //login new user
        userManagement.loginNewUser()
        
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").should("not.exist")
    });

    it("TC_81", () => {
        cy.contains("User Management").click({force:true})
        
        const userManagement = new userManagementPage()
        userManagement.selectProfile("qa_profile")
        userManagement.editProfile()
        userManagement.editPermissions()
        userManagement.selectOption("TOWING")
        userManagement.checkVisible()
        userManagement.saveChanges()

        //login new user
        userManagement.loginNewUser()
        
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").should("exist")
    });

    it("TC_82", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(4000)
        const fdm = new FDM()
        cy.get(".prime_tNexus_dropdown").click({force:true})
        cy.get(".prime_tNexus_dropdown").find(".p-dropdown-panel")
        .contains("Aircraft Tows").should("be.visible")
    });

    it("TC_83",()=>{
        cy.contains("FDM").click({force:true})
        cy.wait(4000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").should("be.visible")
        fdm.getTopLeftIconOption("Cancel Tow").should("be.visible")
        fdm.getTopLeftIconOption("Delete Tow").should("be.visible")
    })

    it("TC_84", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(4000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()
        ipt.getTitle().should("be.visible")
        ipt.getSave().should("be.visible")
        ipt.getClose().should("be.visible")
    });

    it("TC_85", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(4000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()
        ipt.getClose().click()
        ipt.getTitle().should("not.exist")
    });

    it("TC_86", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(4000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()
        ipt.getItem("registration").should("be.visible")
        ipt.getItem("sobt").should("be.visible")
        ipt.getItem("sibt").should("be.visible")
        ipt.getItem("departureStand").should("be.visible")
        ipt.getItem("arrivalStand").should("be.visible")
    });

    it("TC_087", () => {

        cy.contains("FDM").click({force:true})
        cy.wait(4000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()
        ipt.getLabel("Registration").should("contain.text","\*")
        ipt.getLabel("SIBT").should("contain.text","\*")
        ipt.getLabel("SOBT").should("contain.text","\*")
        ipt.getLabel("Departure Stand").should("contain.text","\*")
        ipt.getLabel("Arrival Stand").should("contain.text","\*")
    });

    it("TC_088", ()=>{
        cy.contains("FDM").click({force:true})
        cy.wait(2000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()

        ipt.getItem("registration").click()
        ipt.getItem("registration").find("[data-testid= 'dynamic-DropDownPopUp']").within(()=>{
            cy.root().contains("REGISTRATIONS").should('be.visible')
            cy.root().contains("ICAO").should('be.visible')
            cy.root().contains("IATA").should('be.visible')
        })
        ipt.getItem("registration").find(".ChevronButton").click()


        ipt.getItem("sibt").type("02:00")
        ipt.getItem("sobt").type("02:00")
        ipt.getItem("departureStand").click().find("[data-testid= 'dynamic-DropDownPopUp']").contains("test").click()
        ipt.getItem("arrivalStand").click().find("[data-testid= 'dynamic-DropDownPopUp']").contains("test").click()

        ipt.getSave().click()
        ipt.getSaveYes().click()

        ipt.getErrorMessage().should("contain.text","missing:Registration")
    })

    it("TC_089",()=>{
        cy.contains("FDM").click({force:true})
        cy.wait(2000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()

        ipt.getItem("registration").click()
        ipt.getItem("registration").find("[data-testid= 'dynamic-DropDownPopUp']")
        .contains("00178").click({force:true})

        ipt.getItem("registration").find("input").first().should("have.value","00178")
    })

    it("TC_090", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(1000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()
        ipt.fillAllMandatoryFields()
        ipt.getItem("sibt").clear()
        ipt.getSave().click()
        ipt.getSaveYes().click()
        ipt.getErrorMessage().should("contain.text","missing:SIBT")
    });

    it.skip("TC_91", () => {
    });

    it("TC_92", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(1000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()
        ipt.fillAllMandatoryFields()
        ipt.getItem("sobt").clear()
        ipt.getSave().click()
        ipt.getSaveYes().click()
        ipt.getErrorMessage().should("contain.text","missing:SOBT")
    });

    it.skip("TC_093", () => {
    });

    it("TC_094", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(2000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()

        ipt.getItem("departureStand").click().find("[data-testid= 'dynamic-DropDownPopUp']").within(()=>{
            cy.root().contains("CODE").should('be.visible')
            cy.root().contains("LABEL").should('be.visible')
        })
        ipt.getItem("departureStand").find(".ChevronButton").click()


        ipt.getItem("sibt").type("02:00")
        ipt.getItem("sobt").type("02:00")
        ipt.getItem("registration").click().find("[data-testid= 'dynamic-DropDownPopUp']").contains("00178").click({force:true})
        ipt.getItem("arrivalStand").click().find("[data-testid= 'dynamic-DropDownPopUp']").contains("test").click()

        ipt.getSave().click()
        ipt.getSaveYes().click()

        ipt.getErrorMessage().should("contain.text","missing:Departure Stand")
    });

    it("TC_095", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(2000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()

        ipt.getItem("departureStand").click().find("[data-testid= 'dynamic-DropDownPopUp']")
        .contains("test").click()

        ipt.getItem("departureStand").find("input").first().should("have.value","test")
    });

    it("TC_096", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(2000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()

        ipt.getItem("arrivalStand").click().find("[data-testid= 'dynamic-DropDownPopUp']").within(()=>{
            cy.root().contains("CODE").should('be.visible')
            cy.root().contains("LABEL").should('be.visible')
        })
        ipt.getItem("arrivalStand").find(".ChevronButton").click()


        ipt.getItem("sibt").type("02:00")
        ipt.getItem("sobt").type("02:00")
        ipt.getItem("registration").click().find("[data-testid= 'dynamic-DropDownPopUp']").contains("00178").click({force:true})
        ipt.getItem("departureStand").click().find("[data-testid= 'dynamic-DropDownPopUp']").contains("test").click()

        ipt.getSave().click()
        ipt.getSaveYes().click()

        ipt.getErrorMessage().should("contain.text","missing:Arrival Stand")
    });

    it("TC_097", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(2000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()
        
        const ipt = new insertPlannedTow()

        ipt.getItem("arrivalStand").click().find("[data-testid= 'dynamic-DropDownPopUp']")
        .contains("test").click()

        ipt.getItem("arrivalStand").find("input").first().should("have.value","test")
    });

    it.only("TC_098", () => {

        cy.contains("FDM").click({force:true})
        cy.wait(2000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()

        const ipt = new insertPlannedTow()
        ipt.fillAllMandatoryFields()
        
        ipt.getItem("registration").find("input").then((e)=>{
            const reg = e.attr("value")
            ipt.getSave().click()
            ipt.getSaveYes().click()
            cy.wait(4000)

            ipt.getSearchFilter().type(reg)
            ipt.getColumn("registration").contains(reg).should("be.visible")
        })
    });

    it("TC_099", () => {
        cy.contains("FDM").click({force:true})
        cy.wait(2000)
        const fdm = new FDM()
        fdm.ChangeArrDep("Aircraft Tows")
        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Planned Tow").click()

        const ipt = new insertPlannedTow()
        ipt.fillAllMandatoryFields()
        ipt.getItem("registration").find("input").then((e)=>{
            
            const reg = e.attr("value")
            
            ipt.getSave().click()
            ipt.getSaveYes().click()
            cy.wait(4000)

            ipt.getSearchFilter().type(reg)
            ipt.getColumn("registration").contains(reg).click({force:true})
            fdm.getTopLeftIcon().click()
            fdm.getTopLeftIconOption("Delete").click()

            ipt.getDeleteMessage().should("contain.text","Are you sure want to delete this tow record?")
            ipt.getDeleteReg().should("have.text",reg)
            ipt.getDeleteYes().click({force:true})

            fdm.ChangeArrDep("Arrival")
            fdm.ChangeArrDep("Aircraft Tows")
            ipt.getSearchFilter().type(reg)
            ipt.getColumn("registration").contains(reg).should("not.exist")
        })
    });
})