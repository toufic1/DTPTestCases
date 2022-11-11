class userManagementPage{
    
    constructor(){   
    }
    
    selectProfile(profile){
        cy.get(".ag-center-cols-container .ag-row").contains(profile).click({force:true})
    }

    editProfile(){
        cy.get(".user--header").contains("Edit").click({force:true})
    }

    editPermissions(){
        cy.get(".profile_form_footer").contains("Permissions").click({force:true})
    }


    selectOption(option){
        cy.get(".permissions_panel_wrapper").contains(option).click({force:true})
    }

    uncheckOption(option){
        cy.get(".Permissions-checkbox-wrapper input[type='checkbox']").uncheck({force:true})
    }

    checkOption(option){
        cy.get(".Permissions-checkbox-wrapper input[type='checkbox']").check({force:true})
    }

    getDeparture(){
        return cy.get(".insert_movement_arrow").parent().parent().contains("Departure")
    }

    getFlightDetails(){
        return cy.get(".flight_details_arrow").eq(1).next()
    }

    saveChanges(){
        cy.get(".user--header ").contains("Save").click({force:true})
        cy.get(".info_box_footer").contains("YES").click({force:true})
        cy.wait(6000)
    }

    goTo(url){
        cy.visit(url)
    }

    getAdep(){
        return cy.get(".adep\\*_chk")
    }

    getVia(){
        return cy.get(".via_chk")
    }

    getAdes(){
        return cy.get(".ades\\*_chk")
    }

    loginNewUser(){

        cy.login("qauser2","QAuser2@123").then(()=>{
            cy.visit("http://185.114.89.129:31080/fdm",{
                
                onBeforeLoad:(window)=>{
                    window.localStorage.setItem("principal",
                    JSON.stringify({"key":"DXB","token":Cypress.env("access_token"),
                    "isLoggedIn":true,"masterDataIsLoaded":false,
                    "expireNotificationShowed":false,"csrf":null}))
                }
            })
        })
    }
    checkVisible(){
        cy.get(".Permissions-checkbox-wrapper").find(".visible_cBox input").check()
    }
    uncheckVisible(){
        cy.get(".Permissions-checkbox-wrapper").find(".visible_cBox input").uncheck()
    }

    checkOption(option){
        cy.get(".Permissions-checkbox-wrapper").find(`${option} input`).check()
    }
    
    uncheckOption(option){
        cy.get(".Permissions-checkbox-wrapper").find(`${option} input`).uncheck()
    }

    clickIfelmHasTitle(e, title){
        if(e.attr("title") == title){
            cy.wrap(e).click({force:true})
        }
    }
}

export {userManagementPage}