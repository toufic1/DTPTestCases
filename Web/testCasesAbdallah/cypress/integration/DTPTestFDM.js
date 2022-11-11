
import FDMPage from "./pageObjects/FDMPage";
import HomePage from "./pageObjects/homePage";
import LoginPage from "./pageObjects/Loginpage";

describe('FDM page Test Suite', function () {
    beforeEach('Login', function () {
        const login = new LoginPage()
        login.visit()
        login.FillUsername('qauser')
        login.FillPassword('QAuser@123')
        login.FillClient('DXB')
        login.Submit()
    
    })
    it('TC_01', function () {
        const homepage = new HomePage()
        const fdmpage = new FDMPage()
        homepage.clickFDM()
        fdmpage.GetMovementIcon().should('be.visible')
        
    })
    it.only('TC_02', function () {
        const homepage = new HomePage()
        const fdmpage = new FDMPage()
        homepage.clickFDM()
        fdmpage.ClickMovementIcon()
        fdmpage.InsertMovement().should('be.visible')
        fdmpage.CopyMovement().should('be.visible')
        fdmpage.DeleteMovement().should('be.visible')

    })

   


})