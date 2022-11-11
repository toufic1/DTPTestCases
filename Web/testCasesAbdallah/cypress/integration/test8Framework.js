describe('My first Test Suite', function() 
{

    before(function() {

        //run once before all tests in the block
        cy.fixture('example').then(function (data)

        {

            this.data = data
        })
    })



 
it('My 7th test case',function() {
 
cy.visit("https://rahulshettyacademy.com/angularpractice/");

cy.get('form.ng-untouched > :nth-child(1)').type(this.data.name)
cy.get('select').select(this.data.gender)

cy.get(':nth-child(4) > .ng-pristine').should('have.value',this.data.name)
cy.get('#inlineRadio3').should('be.disabled')
cy.get(':nth-child(2) > .nav-link').click()
cy.selectProduct('Blackberry')



})
})
