// ***********************************************************
// This example support/e2e.js is processed and
// loaded automatically before your test files.
//
// This is a great place to put global configuration and
// behavior that modifies Cypress.
//
// You can change the location of this file or turn off
// automatically serving support files with the
// 'supportFile' configuration option.
//
// You can read more here:
// https://on.cypress.io/configuration
// ***********************************************************

// Import commands.js using ES2015 syntax:
import './commands'
import addContext from "mochawesome/addContext"

beforeEach("login",()=>{
    
    cy.viewport(1400, 900)
    cy.login("qauser","QAuser@123").then(()=>{
        cy.visit("http://185.114.89.129:31080/",{
            
            onBeforeLoad:(window)=>{
                window.localStorage.setItem("principal",
                JSON.stringify({"key":"DXB","token":Cypress.env("access_token"),
                "isLoggedIn":true,"masterDataIsLoaded":false,
                "expireNotificationShowed":false,"csrf":null}))
            }
        })
    })
})


Cypress.on("test:after:run", (test, runnable) => {  
    if (test.state === "failed") {    
        const screenshot =`assets/${Cypress.spec.name}/${runnable.parent.title} -- ${test.title} (failed).png`;    
        addContext({ test }, screenshot);  
    }
    });
// Alternatively you can use CommonJS syntax:
// require('./commands')

