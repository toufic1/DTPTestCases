
describe('My First Test Suite', function () {
    
     it('My First Test Case', function (){
     // test step for URL launching
     cy.visit("https://rahulshettyacademy.com/seleniumPractise/");
     cy.get('.search-keyword').type('ca')


     //parent child checking
   
     cy.get('.products').find('.product').eq(1).contains("ADD TO CART").click()

     

      //iterte and whenever you find cashews click on that button

         cy.get('.products').find('.product').each(($e1,index, $list ) => {

          const textVeg= $e1.find('h4.product-name').text()
          if(textVeg.includes('Cashews'))

          {
            cy.wrap( $e1).find('button').click()
          }
         
     })

     cy.get('.cart-icon > img').click()
     cy.contains('PROCEED TO CHECKOUT').click()
     cy.contains('Place Order').click()
})
})
