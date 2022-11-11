describe('My third Test Suite', function() 
{
 
it('My third test case',function() {
 
cy.visit("http://qaclickacademy.com/practice.php")
cy.get('#alertbtn').click()
cy.get('[value="Confirm"]').click()

//window:alert
cy.on('window:alert',(str)=>
{
    //Mocha
    expect(str).to.equal('Hello , share this practice page and share your knowledge')
})
 
cy.on('window:confirm',(str)=>
{
    //Mocha
    expect(str).to.equal('Hello , Are you sure you want to confirm?')
})

// handling child
cy.get('#opentab').invoke('removeAttr', 'target').click()

cy.url().should('include','rahul')
 
cy.go('back')
 
})


})