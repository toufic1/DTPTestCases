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

    saveChanges(){
        cy.get(".user--header ").contains("Save").click({force:true})
        cy.get(".info_box_footer").contains("YES").click({force:true})
        cy.wait(6000)
    }

    selectOption(option){
        cy.get(".permissions_panel_wrapper").contains(option).click({force:true})
    }
    
    loginNewUser(){

        cy.login("qauser2","QAuser2@123").then(()=>{
            cy.visit("http://185.114.89.129:31080/",{
                
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
}

export {userManagementPage}