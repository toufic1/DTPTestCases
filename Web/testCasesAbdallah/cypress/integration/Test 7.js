describe('My third Test Suite', function() 
{
 
it('My third test case',function() {
 
cy.visit("https://rahulshettyacademy.com/AutomationPractice/");
cy.contains("Top").click({force:true})
cy.url().should('include','top')




})
})