
import LoginPage from "../examples/pageObjects/Loginpage";

describe ('Test Suite',function(){

    it('Valid Login Test' ,function(){


        const loginpage = new LoginPage ()
        loginpage.visit()
        loginpage.FillEmail('admin@yourstore.com')
        loginpage.FillPassword('admin')
        loginpage.Submit()


    })


})