
describe('My First Test Suite', function () {
    
     it('My First Test Case', function (){
     // test step for URL launching
     cy.visit("https://rahulshettyacademy.com/seleniumPractise/");
     cy.get('.search-keyword').type('ca')

     cy.get('.product:visible').should('have.length',4)
     //parent child checking
     cy.get('.products').find('.product').should('have.length',4)
     cy.get('.products').find('.product').eq(1).contains("ADD TO CART").click()

     

      //iterte and whenever you find cashews click on that button

         cy.get('.products').find('.product').each(($e1,index, $list ) => {

          const textVeg= $e1.find('h4.product-name').text()
          if(textVeg.includes('Cashews'))

          {
            cy.wrap( $e1).find('button').click()
          }
         
     })
})
})
