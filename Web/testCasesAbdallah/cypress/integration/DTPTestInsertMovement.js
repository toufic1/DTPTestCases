

import LoginPage from "./pageObjects/Loginpage";
import HomePage from "./pageObjects/homePage";
import FDMPage from "./pageObjects/FDMPage";
import InsertMovementPage from "./pageObjects/insertMovementPage";




describe('My third Test Suite', function () {


    beforeEach('My third test case', function () {

        const login = new LoginPage()
        login.visit()
        login.FillUsername('qauser')
        login.FillPassword('QAuser@123')
        login.FillClient('DXB')
        login.Submit()
    })






    it('TC_013', function () {
        cy.contains('FDM').click({ force: true })
        cy.getMovementIcon().click()
        cy.getInsertMovement().click({force:true})
        cy.get('.MuiDialog-container ').should('exist')
        cy.contains('Save').should('be.visible')
        cy.get('.dialogBox__header__close  ').should('be.visible')
        cy.get('.arrivalGridLeft  .kSpiNY').should('be.visible')
        cy.get('.fdmDepartureGrid__header  .si-flight').should('be.visible')
        cy.get('.full_screen_icon').should('be.visible')  //full screen icon is not visibe -->test fail

    })



    it('TC_014', function () {
        cy.contains('FDM').click({ force: true })
        cy.get('.fdm--toolbar  .MuiButtonBase-root ').click()
        cy.get('.Grid_extended_menu').contains('Insert Movement').click({force:true}) 
        cy.get('.full_screen_icon').should('be.visible')  //full screen icon is not visibe -->test fail

    })



    it('TC_015', function () {
        cy.contains('FDM').click({ force: true })
        cy.get('.fdm--toolbar  .MuiButtonBase-root ').click()
        cy.getInsertMovement().click({force:true})
        cy.get('.close').click({force:true})
        cy.get('.MuiDialog-container ').should('not.exist')


    })

    

    it('TC_016', function () {
         
        const homepage = new HomePage()
        homepage.clickFDM()
        

        const fdmpage = new FDMPage()
        fdmpage.ClickMovementIcon()

        const insertmvmtpage = new InsertMovementPage()
        cy.getInsertMovement().click()

    
        
    //cy.get(".sc-gSAPjG").contains('Arrival').should('be.visible')
    insertmvmtpage.ArrRegistrationField().should('be.visible')
    insertmvmtpage.ArrFlightNumberField().should('be.visible')
    insertmvmtpage.ArrAdepField().should('be.visible')
    insertmvmtpage.ArrStatusField().should('be.visible')
    insertmvmtpage.ArrCallSignField().should('be.visible')
    insertmvmtpage.ArrSIBTField().should('be.visible')
    insertmvmtpage.ArrEIBTField().should('be.visible')
    insertmvmtpage.ArrCategoryField().should('be.visible')
    insertmvmtpage.ArrServiceField().should('be.visible')
    insertmvmtpage.ArrTerminalField().should('be.visible')
    insertmvmtpage.ArrVectorField().should('be.visible')
   
       

    })


    it('TC_017', function () {

        //cy.contains('FDM').click({ force: true })
        //cy.get('.fdm--toolbar  .MuiButtonBase-root ').click()
        //cy.get('.Grid_extended_menu').contains('Insert Movement').click()

        const homepage = new HomePage()
        const fdmpage = new FDMPage()
        const insertmvmtpage = new InsertMovementPage()

        homepage.clickFDM()
        fdmpage.ClickMovementIcon()
        cy.getInsertMovement().click()
        insertmvmtpage.depVIAField().should('be.visible')
        insertmvmtpage.depACTypeField().should('be.visible')
        insertmvmtpage.depFlightNumberField().should('be.visible')
        insertmvmtpage.depCallSignField().should('be.visible')
        insertmvmtpage.depCategoryField().should('be.visible')
        insertmvmtpage.depCallSignField().should('be.visible')
        insertmvmtpage.depTerminalField().should('be.visible')
        insertmvmtpage.depServiceField().should('be.visible')
        insertmvmtpage.depVectorField().should('be.visible')
        insertmvmtpage.depsobtField().should('be.visible')
        insertmvmtpage.depeobtField().should('be.visible')
        insertmvmtpage.depADESField().should('be.visible')

        

      
        
      
       

        
    })


    it('TC_018', function () {


        const homepage = new HomePage()
        const fdmpage = new FDMPage()
        const insertmvmtpage = new InsertMovementPage()
        homepage.clickFDM()
        fdmpage.ClickMovementIcon()
        cy.getInsertMovement().click()

    cy.get('.moment_arrival').contains('ADEP*').should('contain.text', '\*')
    cy.get('.moment_arrival ').contains('Category*').should('contain.text', '\*')
    cy.get('.moment_arrival ').contains('SIBT*').should('contain.text', '\*')
    cy.get('.moment_departure').contains('ADES*').should('contain.text', '\*')
    cy.get('.moment_departure').contains('SOBT*').should('contain.text', '\*')
    cy.get('.moment_departure').contains('Category*').should('contain.text', '\*')

    })


    it('TC_019', function () {

        const homepage = new HomePage()
        const fdmpage = new FDMPage()
        const insertmvmtpage = new InsertMovementPage()
        homepage.clickFDM()
        fdmpage.ClickMovementIcon()
        cy.getInsertMovement().click()

        //*****************************arrival***********************************
        insertmvmtpage.ArrFlightNumberField().click()
        insertmvmtpage.ArrFlightNumberField().contains('IATA').should('be.visible')
        insertmvmtpage.ArrFlightNumberField().contains('ICAO').should('be.visible')
        insertmvmtpage.ArrFlightNumberField().contains('NAME').should('be.visible')

        insertmvmtpage.ArrnumberField().should('exist')
        insertmvmtpage.ArrSuffixField().should('exist')



        //*********************departure*******************

        insertmvmtpage.depFlightNumberField().click()
        insertmvmtpage.depFlightNumberField().contains('IATA').should('be.visible')
        insertmvmtpage.depFlightNumberField().contains('ICAO').should('be.visible')
        insertmvmtpage.depFlightNumberField().contains('NAME').should('be.visible')

        insertmvmtpage.depnumberField().should('exist')
    
        insertmvmtpage.depSuffixField().should('exist')

        })



        it('TC_020', function () {
            const homepage = new HomePage()
            const fdmpage = new FDMPage()
            const insertmvmtpage = new InsertMovementPage()
            homepage.clickFDM()
            fdmpage.ClickMovementIcon()
            cy.getInsertMovement().click()
            insertmvmtpage.ArrFlightNumberField().click()
            cy.contains('Blue Air').click()
            insertmvmtpage.ArrFlightNumberField().find('input').first().should('have.value','0B')

        
        })


        it('TC_021', function () {

            const homepage = new HomePage()
            const fdmpage = new FDMPage()
            const insertmvmtpage = new InsertMovementPage()
            homepage.clickFDM()
            fdmpage.ClickMovementIcon()
            cy.getInsertMovement().click()
            insertmvmtpage.ArrnumberField().type('A')
            cy.get('.error_NotiFier').invoke('show').click().should('have.text','!Must be a number')
            

})



    it('TC_022', function () {

  
        const homepage = new HomePage()
        const fdmpage = new FDMPage()
        const insertmvmtpage = new InsertMovementPage()
        homepage.clickFDM()
        fdmpage.ClickMovementIcon()
        cy.getInsertMovement().click()

    insertmvmtpage.ArrFlightNumberField().click()
    insertmvmtpage.ArrSuffixField().type('jj', {force:true})
    cy.get('.error_NotiFier').invoke('show').click().should('have.text','!Must be 1 characters or less')
    insertmvmtpage.ArrSuffixField().clear()
    insertmvmtpage.ArrSuffixField().type('j')
    insertmvmtpage.ArrSuffixField().should('be.visible')
    
})


it('TC_024', function () {

    const homepage = new HomePage()
    const fdmpage = new FDMPage()
    const insertmvmtpage = new InsertMovementPage()
    homepage.clickFDM()
    fdmpage.ClickMovementIcon()
    cy.getInsertMovement().click()
    insertmvmtpage.ArrCodeSharesArrowClick()
    cy.get('[data-testid="DynamicDropDown-popup-body"] .si-add' ).click()
    cy.get('[data-cy="arrivalFdmFltOpsView.codeShares[0].airline"]').should('be.visible')
    cy.get('[data-cy="arrivalFdmFltOpsView.codeShares[0].airline"] .dropdown_ChevronButton .si-navigation-down-arrow').click()
    cy.get('.arrivalGridLeft .DynamicDropDown_body .dropdown_td').contains('Blue Air').click() 
    cy.get('.DynamicDropDown_body  [data-cy="arrivalFdmFltOpsView.codeShares[0].flightNumber"]  .headerInput').should('be.visible')
    cy.get('.DynamicDropDown_body  [data-cy="arrivalFdmFltOpsView.codeShares[0].flightNumber"]  .headerInput').type(1)
    cy.get('.DynamicDropDown_body  [data-cy="arrivalFdmFltOpsView.codeShares[0].flightSuffix"]  .headerInput').should('be.visible')
    cy.get('.DynamicDropDown_body  [data-cy="arrivalFdmFltOpsView.codeShares[0].flightSuffix"]  .headerInput').type('j')
    cy.get('.si-delete').should('be.visible')
    cy.get('.fdmArrivalGrid__header  .codeShareRow  .iotJaA').should('have.text','1')
})





it('TC_025', function () {

    cy.contains('FDM').click({ force: true }) //FDM
    cy.get('.fdm--toolbar  .MuiButtonBase-root ').click() // Movement icon on the left
    cy.get('.Grid_extended_menu').contains('Insert Movement').click()
    cy.get('.arrivalGridLeft  .sc-jSMfEi [style="cursor: pointer;"]').click()
    
    .then (() =>

    {

    for(let i=0 ; i <3 ; i++){

        cy.get('.si-add').click()
        cy.get(`[data-cy="arrivalFdmFltOpsView.codeShares[${i}].airline"]`)
        cy.get('.fdmArrivalGrid__header  .codeShareRow  .iotJaA').should('have.text',i+1)
        //cy.get('[style="font-size: 12px; color: rgb(54, 79, 105); padding-left: 10px; line-height: 20px;"]').should('have.text',i+1)
    }

    
    

})

    
})


it('TC_026', function () {

    const homepage = new HomePage()
    const fdmpage = new FDMPage()
    const insertmvmtpage = new InsertMovementPage()
    homepage.clickFDM()
    fdmpage.ClickMovementIcon()
    cy.getInsertMovement().click()
    cy.get('.arrivalGridLeft  .sc-jSMfEi [style="cursor: pointer;"]').click()
    cy.get('.si-add').click()
    cy.get('.si-delete').click()
    cy.get('.si-less').click()
    cy.get('.fdmArrivalGrid__header  .codeShareRow  .iotJaA').should('have.text',0)

})



it('TC_027', function () {

    const homepage = new HomePage()
    const fdmpage = new FDMPage()
    const insertmvmtpage = new InsertMovementPage()
    homepage.clickFDM()
    fdmpage.ClickMovementIcon()
    cy.getInsertMovement().click()
    insertmvmtpage.ArrCallSignField().type('Chicago').should('be.visible')
   
})


it('TC_028', function () {

    const homepage = new HomePage()
    const fdmpage = new FDMPage()
    const insertmvmtpage = new InsertMovementPage()
    homepage.clickFDM()
    fdmpage.ClickMovementIcon()
    cy.getInsertMovement().click()

    insertmvmtpage.ArrCategoryField().click().contains('Ambulance Flight').click()
    insertmvmtpage.ArrAdepField().click().contains('Matanza').click({force:true})
    insertmvmtpage.depACTypeField().click().contains('BE58').click()
    insertmvmtpage.depADESField().click().contains('Mendoza').click({force:true})
    insertmvmtpage.depCategoryField().contains('Aerogulf').click({force:true})
    insertmvmtpage.Save()
    //Error message
    cy.get('.sc-fbPSWO').should('contain.text','Please fill Call Sign or Flight Number for the arrival')

})



it('TC_030', function () {

    const homepage = new HomePage()
    const fdmpage = new FDMPage()
    const insertmvmtpage = new InsertMovementPage()
    homepage.clickFDM()
    fdmpage.ClickMovementIcon()
    cy.getInsertMovement().click()
    
    insertmvmtpage.ArrFlightNumberField().click().contains('Blue Air').click() 
    insertmvmtpage.ArrnumberField().type(1)
    insertmvmtpage.ArrCategoryField().click().contains('Ambulance Flight').click()
    insertmvmtpage.depACTypeField().click().contains('BE58').click({force:true})
    insertmvmtpage.Save()
    cy.getError().contains('Please fill ADEP for the arrival')
   
    
})



it('TC_031', function () {
    const homepage = new HomePage()
    const fdmpage = new FDMPage()
    const insertmvmtpage = new InsertMovementPage()
    homepage.clickFDM()
    fdmpage.ClickMovementIcon()
    cy.getInsertMovement().click()
    
    cy.get('.moment_arrival .viaRow .si-navigation-down-arrow').click() //ViaArrow

    cy.get('.si-add ').click()
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].viaIcao"]').should('be.visible') 
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].sibt"]').should('be.visible')
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].eibt"]').should('be.visible')
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].aldt"]').should('be.visible')
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].aibt"]').should('be.visible')
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].sobt"]').should('be.visible')
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].eobt"]').should('be.visible')
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].aobt"]').should('be.visible')
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].atot"]').should('be.visible')
    cy.get('.si-delete').should('be.visible')

})



it('TC_032', function () {
    cy.contains('FDM').click({ force: true }) //FDM
    cy.get('.fdm--toolbar  .MuiButtonBase-root ').click() // Movement icon on the left
    cy.get('.Grid_extended_menu').contains('Insert Movement').click() //InsertMovementClick
    cy.get('.moment_arrival .viaRow .si-navigation-down-arrow').click() //ViaArrow
    cy.get('.si-add ').click()
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].sibt"]').type('11:22')
    cy.get('[data-cy="arrivalFdmFltOpsView.vias[0].viaIcao"]').click() 
    cy.contains('Matanza').click({force:true})
    cy.get('.moment_arrival .movementInputDropdown .sc-jOhDuK').should('have.text','1' )
   
})



it('TC_033', function () {

    
    cy.contains('FDM').click({ force: true }) //FDM
    cy.get('.fdm--toolbar  .MuiButtonBase-root ').click() // Movement icon on the left
    cy.get('.Grid_extended_menu').contains('Insert Movement').click() //InsertMovementClick
    cy.get('.moment_arrival .viaRow .si-navigation-down-arrow').click() //ViaArrow

    .then (() =>

    {

    for(let i=0 ; i <2 ; i++){

        cy.get('.si-add').click({force:true})
        cy.get(`[data-cy="arrivalFdmFltOpsView.vias[${i}].viaIcao"]`).click()
        cy.contains('Matanza').click({force:true})
        cy.get('.moment_arrival > .container_grid > .MuiGrid-root > [data-testid="Dynamic-dropdown"] > .sc-jSMfEi > .sc-jOhDuK').should('have.text',i+1)
        cy.get('.moment_arrival .viaRow .si-navigation-down-arrow').click()
       
        //cy.get(`[data-cy="arrivalFdmFltOpsView.codeShares[${i}].airline"]`)
        //cy.get('[style="font-size: 12px; color: rgb(54, 79, 105); padding-left: 10px; line-height: 20px;"]').should('have.text',i+1)
    }

    cy.get('.sc-lbxAil  .si-navigation-up-arrow ').click()
    

})
})


it('TC_034', function () {

    
    cy.contains('FDM').click({ force: true }) //FDM
    cy.get('.fdm--toolbar  .MuiButtonBase-root ').click() // Movement icon on the left
    cy.get('.Grid_extended_menu').contains('Insert Movement').click() //InsertMovementClick
    cy.get('.moment_arrival .viaRow .si-navigation-down-arrow').click() //ViaArrow

    .then (() =>

    {

    for(let i=0 ; i <2 ; i++){

        cy.get('.si-add').click({force:true})
        cy.get(`[data-cy="arrivalFdmFltOpsView.vias[${i}].viaIcao"]`).click()
        cy.contains('Matanza').click({force:true})
        cy.get('.moment_arrival > .container_grid > .MuiGrid-root > [data-testid="Dynamic-dropdown"] > .sc-jSMfEi > .sc-jOhDuK').should('have.text',i+1)
        cy.get('.moment_arrival .viaRow .si-navigation-down-arrow').click()
        

    }

    cy.get('.si-delete').click()
    cy.get(':nth-child(1) > .sc-jdAMXn > .sc-iNWwEs > .si-less').click()
    cy.get('[style="position: absolute; right: 5px;"]  .si-navigation-up-arrow').click()
    cy.get('.moment_arrival > .container_grid > .MuiGrid-root > [data-testid="Dynamic-dropdown"] > .sc-jSMfEi > .sc-jOhDuK').should('have.text',1)
        

    

})


})


it('TC_035', function () {

    
      const homepage = new HomePage()
    const fdmpage = new FDMPage()
    const insertmvmtpage = new InsertMovementPage()
    homepage.clickFDM()
    fdmpage.ClickMovementIcon()
    cy.getInsertMovement().click()

    insertmvmtpage.ArrFlightNumberField().click().contains('Blue Air').click()
    insertmvmtpage.ArrnumberField().type(1233)
    insertmvmtpage.ArrAdepField().click().contains('Matanza').click({force:true})
    insertmvmtpage.ArrCategoryField().contains('Ambulance Flight').click({force:true})
    insertmvmtpage.ArrCallSignField().type('a')
    insertmvmtpage.depACTypeField().click().contains('BE12').click({force:true})
    insertmvmtpage.Save()
    cy.wait(10000)
    cy.get('[col-id="flightNo"]').contains(1233).should('exist') ////????

})


it('TC_039', function () {

    
    const homepage = new HomePage()
    const fdmpage = new FDMPage()
    const insertmvmtpage = new InsertMovementPage()
    homepage.clickFDM()
    fdmpage.ClickMovementIcon()
    cy.getInsertMovement().click()

    insertmvmtpage.ArrServiceField().click().contains('Passenger Only').click({force:true})
    cy.get('[data-cy="arrivalFdmFltOpsView.serviceType"] .wJZZU').should('have.value','C')

})


it.only('TC_040', function () {

    
    const homepage = new HomePage()
    const fdmpage = new FDMPage()
    const insertmvmtpage = new InsertMovementPage()
    homepage.clickFDM()
    fdmpage.ClickMovementIcon()
    cy.getInsertMovement().click()

   insertmvmtpage.ArrCategoryField().click().contains('CODE').should('be.visible')
   insertmvmtpage.ArrCategoryField().click().contains('Name').should('be.visible')
   insertmvmtpage.ArrFlightNumberField().click().contains('Blue Air').click()
   
   insertmvmtpage.ArrnumberField().type(123)
   insertmvmtpage.ArrAdepField().click().contains('Matanza').click({force:true})
   insertmvmtpage.depACTypeField().click().contains('BE12').click({force:true})
   insertmvmtpage.Save()
   cy.getError().contains('Please fill Category for the arrival')
   
  
})



})