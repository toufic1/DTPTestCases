
describe('My First Test Suite', function () {
    
     it('My third Test Case', function (){
     // test step for URL launching
     cy.visit("https://rahulshettyacademy.com/AutomationPractice/");
     cy.wait(2000)
     cy.get('#checkBoxOption1').check().should('be.checked').and('have.value','option1')
     cy.get('#checkBoxOption1').uncheck().should('not.be.checked')//uncheck the first checkbox
     cy.get('input[type="checkbox"]').check(['option2','option3'])//check multiple checkbox

     //static dropdown
     cy.get('select').select('option2').should('have.value','option2')

      //dynamic dropdown
     cy.get('#autocomplete').type('ind')
     cy.get('.ui-menu-item div').each(($element,index,$list) => {

          if($element.text()== "India"){
               cy.wrap($element).click()
          }
     })

     cy.get('#autocomplete').should('have.value','India')//assertion to check if India is properly selected


     cy.get('#displayed-text').should('be.visible')//verify if edit box is visible or not
     cy.get('#hide-textbox').click()
     cy.get('#displayed-text').should('not.be.visible')
     cy.get('#show-textbox').click()
     cy.get('#displayed-text').should('be.visible')


     //radio buttons
     cy.get('[value="radio2"]').check().should('be.checked')





  
})

})
