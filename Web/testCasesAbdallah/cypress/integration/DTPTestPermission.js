

import LoginPage from "../examples/pageObjects/Loginpage";
import FDMPage from "./pageObjects/FDMPage";
import HomePage from "./pageObjects/homePage";
import InsertMovementPage from "./pageObjects/insertMovementPage";
import UserManagementPage from "./pageObjects/userManagementPage";



describe('My third Test Suite', function() {


beforeEach('My third test case', function () {

    const loginpage = new LoginPage()

    loginpage.visit()
    loginpage.FillUsername('qauser')
    loginpage.FillPassword('QAuser@123')
    loginpage.FillClient('DXB')
    loginpage.Submit()
  
})


it('TC_03', function () {

    const homepage = new HomePage()
    const usermanagpage = new UserManagementPage()
    const login = new LoginPage()
    const fdm = new FDMPage()
    homepage.clickUserManagement()
    cy.contains('qa_profile').click({ force: true })
    usermanagpage.ClickEdit()
    usermanagpage.ClickPermissions()
    usermanagpage.ClickInsertMovementPermission()
    usermanagpage.uncheckVisible()
    usermanagpage.Save()
    cy.wait(5000)
    usermanagpage.Logout()
    login.FillUsername('qauser')
    login.FillPassword('QAuser@123')
    login.FillClient('DXB')
    login.Submit()
    cy.wait(10000)
    homepage.clickFDM()
    fdm.ClickMovementIcon() 
    fdm.InsertMovement().should('not.exist')


})


it('TC_04', function () {
 
    const homepage = new HomePage()
    const usermanagpage = new UserManagementPage()
    const login = new LoginPage()
    const fdm = new FDMPage()
    homepage.clickUserManagement()
    cy.contains('qa_profile').click({ force: true })
    usermanagpage.ClickEdit()
    usermanagpage.ClickPermissions()
    usermanagpage.ClickInsertMovementPermission()
    usermanagpage.checkvisible()
    usermanagpage.Save()
    cy.wait(5000)
    usermanagpage.Logout()
    login.FillUsername('qauser')
    login.FillPassword('QAuser@123')
    login.FillClient('DXB')
    login.Submit()
    cy.wait(10000)
    homepage.clickFDM()
    fdm.ClickMovementIcon() 
    fdm.InsertMovement().should('exist')
    
    
})


it('TC_05', function () {

    const homepage = new HomePage()
    const usermanagpage = new UserManagementPage()
    const login = new LoginPage()
    const fdm = new FDMPage()
    homepage.clickUserManagement()
    cy.contains('qa_profile').click({ force: true })
    usermanagpage.ClickEdit()
    usermanagpage.ClickPermissions()
    usermanagpage.InsertArrivalMovementPermission().click({ force: true })
    usermanagpage.uncheckVisible()
    usermanagpage.Save()
    cy.wait(5000)
    usermanagpage.Logout()
    login.FillUsername('qauser')
    login.FillPassword('QAuser@123')
    login.FillClient('DXB')
    login.Submit()
    homepage.clickFDM()
    fdm.ClickMovementIcon()
    fdm.InsertMovement().click()
    fdm.ArrivalMovementScreen().should('have.attr', 'disabled')
    
   
})



it('TC_06', function () {

    const homepage = new HomePage()
    const usermanagpage = new UserManagementPage()
    const login = new LoginPage()
    const fdm = new FDMPage()
    homepage.clickUserManagement()
    cy.contains('qa_profile').click({ force: true })
    usermanagpage.ClickEdit()
    usermanagpage.ClickPermissions()
    usermanagpage.InsertArrivalMovementPermission().click({ force: true })
    usermanagpage.checkvisible()
    usermanagpage.Save()
    cy.wait(5000)
    usermanagpage.Logout()
    login.FillUsername('qauser')
    login.FillPassword('QAuser@123')
    login.FillClient('DXB')
    login.Submit()
    homepage.clickFDM()
    fdm.ClickMovementIcon()
    fdm.InsertMovement().click()
    fdm.ArrivalMovementScreen().should('not.have.attr', 'disabled')
})

/*it.only('TC_07', function () {


    const homepage = new HomePage()
    const usermanagpage = new UserManagementPage()
    const login = new LoginPage()
    const fdm = new FDMPage()
    homepage.clickUserManagement()

    usermanagpage.ClickEdit()
    usermanagpage.ClickPermissions()
    usermanagpage.Save()
    cy.wait(5000)
    usermanagpage.Logout()
    login.FillUsername('qauser')
    login.FillPassword('QAuser@123')
    login.FillClient('DXB')
    login.Submit()
    homepage.clickFDM()
    fdm.ClickMovementIcon()
    fdm.InsertMovement().click()
    cy.get('.fdmDepartureGrid__header  .form_inner_header').should('have.attr', 'disabled') 



    
    cy.get('.insert_movement_arrow').parent().parent().contains('Departure').click({ force: true })
    usermanagpage.uncheckVisible()
    cy.get('.panel--header').contains('Save').click({ force: true })
    cy.get('.MuiDialogActions-root').contains('YES').click()
    cy.wait(5000)
    cy.get('.header-menu_logOut   .sapUiIcon').click({ force: true })
    cy.get('.MuiDialogActions-root ').contains('Yes').click()
    cy.get('.mui_input_group  [name=username]').type('qauser2')
    cy.get('.mui_input_group  [name=password]').type('QAuser2@123')
    cy.get('.mui_input_group  [name=client]').type('DXB')
    cy.get(':nth-child(3) > .login_form_btn').click()
    cy.contains('FDM').click({ force: true })
    cy.get('.fdm--toolbar  .MuiButtonBase-root ').click()
    cy.get('.Grid_extended_menu').contains('Insert Movement').click()
    cy.get('.fdmDepartureGrid__header  .form_inner_header').should('have.attr', 'disabled')*/
})


it.only('TC_08', function () {

    cy.contains('User Management').click({ force: true })
    cy.contains('qa_profile').click({ force: true })
    cy.get('.panel--header').contains('Edit').click({ force: true })
    cy.get('.profile_form_footer').contains('Permissions').click()
    cy.get('.insert_movement_arrow').parent().parent().contains('Departure').click({ force: true })
    cy.get('.permission_properties  .MuiFormControlLabel-root  .MuiButtonBase-root  .MuiIconButton-label  .jss14').check()
    cy.get('.panel--header').contains('Save').click({ force: true })
    cy.get('.MuiDialogActions-root').contains('YES').click()
    cy.wait(5000)
    cy.get('.header-menu_logOut   .sapUiIcon').click({ force: true })
    cy.get('.MuiDialogActions-root ').contains('Yes').click()
    cy.get('.mui_input_group  [name=username]').type('qauser2')
    cy.get('.mui_input_group  [name=password]').type('QAuser2@123')
    cy.get('.mui_input_group  [name=client]').type('DXB')
    cy.get(':nth-child(3) > .login_form_btn').click()
    cy.contains('FDM').click({ force: true })
    cy.get('.fdm--toolbar  .MuiButtonBase-root ').click()
    cy.get('.Grid_extended_menu').contains('Insert Movement').click()
    cy.get('.fdmDepartureGrid__header  .form_inner_header').should('not.have.attr', 'disabled')
  
})

it('TC_09', function () {

    cy.contains('User Management').click({ force: true })
    cy.contains('qa_profile').click({ force: true })
    cy.get('.panel--header').contains('Edit').click({ force: true })
    cy.get('.profile_form_footer').contains('Permissions').click()
    cy.get('.arival_btn').click({ force: true })

    cy.get('.adep\\*_chk').then((e) => {

        if (e.attr('title') == 'Make Disable') {
            cy.wrap(e).click({ force: true })
        }

    })
    cy.get('.via_chk').then((e) => {
        if (e.attr('title') == 'Make Disable') {
            cy.wrap(e).click({ force: true })
        }

        cy.get('.panel--header').contains('Save').click({ force: true })
        cy.get('.MuiDialogActions-root').contains('YES').click()
        cy.wait(5000)
        cy.get('.header-menu_logOut   .sapUiIcon').click({ force: true })
        cy.get('.MuiDialogActions-root ').contains('Yes').click()
        cy.get('.mui_input_group  [name=username]').type('qauser2')
        cy.get('.mui_input_group  [name=password]').type('QAuser2@123')
        cy.get('.mui_input_group  [name=client]').type('DXB')
        cy.get(':nth-child(3) > .login_form_btn').click()
        cy.contains('FDM').click({ force: true })
        cy.get('.fdm--toolbar  .MuiButtonBase-root ').click()
        cy.get('.Grid_extended_menu').contains('Insert Movement').click()
        cy.contains('ADEP*').should('not.exist')
        cy.contains('VIA').should('not.exist')

    })
   
})



it('TC_010', function () {

    cy.contains('User Management').click({ force: true })
    cy.contains('qa_profile').click({ force: true })
    cy.get('.panel--header').contains('Edit').click({ force: true })
    cy.get('.profile_form_footer').contains('Permissions').click()
    cy.get('.arival_btn').click({ force: true })
    cy.get('.adep\\*_chk').then((e) => {

        if (e.attr('title') == 'Make Enable') {
            cy.wrap(e).click({ force: true })
        }

    })

    cy.get('.via_chk').then((e) => {

        if (e.attr('title') == 'Make Enable') {
            cy.wrap(e).click({ force: true })
        }
        cy.get('.panel--header').contains('Save').click({ force: true })
        cy.get('.MuiDialogActions-root').contains('YES').click()
        cy.wait(5000)
        cy.get('.header-menu_logOut   .sapUiIcon').click({ force: true })
        cy.get('.MuiDialogActions-root ').contains('Yes').click()
        cy.get('.mui_input_group  [name=username]').type('qauser2')
        cy.get('.mui_input_group  [name=password]').type('QAuser2@123')
        cy.get('.mui_input_group  [name=client]').type('DXB')
        cy.get(':nth-child(3) > .login_form_btn').click()
        cy.contains('FDM').click({ force: true })
        cy.get('.fdm--toolbar  .MuiButtonBase-root ').click()
        cy.get('.Grid_extended_menu').contains('Insert Movement').click()
        cy.contains('ADEP*').should('exist')
        cy.contains('VIA').should('exist')

    })
})


it('TC_011', function () {

    cy.contains('User Management').click({ force: true })
    cy.contains('qa_profile').click({ force: true })
    cy.get('.panel--header').contains('Edit').click({ force: true })
    cy.get('.profile_form_footer').contains('Permissions').click()
    cy.get('.insert_movement_arrow').parent().parent().contains('Departure').click({ force: true })
    cy.get('.status_chk').then((e) => {

        if (e.attr('title') == 'Make Disable') {
            cy.wrap(e).click({ force: true })
        }

    })
    cy.get('.via_chk').then((e) => {

        if (e.attr('title') == 'Make Disable') {
            cy.wrap(e).click({ force: true })
        }

    })


    cy.get('.panel--header').contains('Save').click({ force: true })
    cy.get('.MuiDialogActions-root').contains('YES').click()
    cy.wait(5000)
    cy.get('.header-menu_logOut   .sapUiIcon').click({ force: true })
    cy.get('.MuiDialogActions-root ').contains('Yes').click()
    cy.get('.mui_input_group  [name=username]').type('qauser2')
    cy.get('.mui_input_group  [name=password]').type('QAuser2@123')
    cy.get('.mui_input_group  [name=client]').type('DXB')
    cy.get(':nth-child(3) > .login_form_btn').click()
    cy.contains('FDM').click({ force: true })
    cy.get('.fdm--toolbar  .MuiButtonBase-root ').click()
    cy.get('.Grid_extended_menu').contains('Insert Movement').click()
    cy.contains('ADES*').should('not.exist')
    cy.get('.MuiGrid-root  .moment_departure').contains('Status').should('not.exist')
    cy.get('.MuiGrid-root  .moment_departure').contains('VIA').should('not.exist')
    
})


it('TC_012', function () {

    cy.contains('User Management').click({ force: true })
    cy.contains('qa_profile').click({ force: true })
    cy.get('.panel--header').contains('Edit').click({ force: true })
    cy.get('.profile_form_footer').contains('Permissions').click()
    cy.get('.insert_movement_arrow').parent().parent().contains('Departure').click({ force: true })

    cy.get('.status_chk').then((e) => {

        if (e.attr('title') == 'Make Enable') {
            cy.wrap(e).click({ force: true })
        }

    })


    cy.get('.via_chk').then((e) => {

        if (e.attr('title') == 'Make Enable') {
            cy.wrap(e).click({ force: true })
        }

    })


    cy.get('.panel--header').contains('Save').click({ force: true })
    cy.get('.MuiDialogActions-root').contains('YES').click()
    cy.wait(5000)
    cy.get('.header-menu_logOut   .sapUiIcon').click({ force: true })
    cy.get('.MuiDialogActions-root ').contains('Yes').click()
    cy.get('.mui_input_group  [name=username]').type('qauser2')
    cy.get('.mui_input_group  [name=password]').type('QAuser2@123')
    cy.get('.mui_input_group  [name=client]').type('DXB')
    cy.get(':nth-child(3) > .login_form_btn').click()
    cy.contains('FDM').click({ force: true })
    cy.get('.fdm--toolbar  .MuiButtonBase-root ').click()
    cy.get('.Grid_extended_menu').contains('Insert Movement').click()
    cy.get('.MuiGrid-root  .moment_departure').contains('Status').should('exist')
    cy.get('.MuiGrid-root  .moment_departure').contains('VIA').should('exist')


})

