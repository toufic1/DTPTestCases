describe('My third Test Suite', function() 
{
 
it('My third test case',function() {
 
cy.visit("http://185.114.89.129:31080/");

cy.get('.mui_input_group  [name=username]').type('qauser')
cy.get('.mui_input_group  [name=password]').type('QAuser@123')
cy.get('.mui_input_group  [name=client]').type('DXB')
cy.get(':nth-child(3) > .login_form_btn').click()
cy.contains('FDM').click({force:true})
cy.get('.MuiIconButton-label > .sapUiIcon').should('exist')


//cy.get('select').select('option2').should('have.value','option2')

//cy.get('#my-states').select(['MA', 'VT', 'CT'])

//cy.contains('Insert Movement').should('exist')

cy.get('.MuiIconButton-label > .sapUiIcon').click()
cy.get('.MuiTypography-root').contains('Insert Movement').should('exist')
cy.get('.MuiTypography-root').contains('Copy Movement').should('exist')
cy.get('.MuiTypography-root').contains('Delete Movement').should('exist')

cy.get('.MuiTypography-root').contains('Insert Movement').click()
cy.get('.MuiButton-label').contains('Save').should('exist')
cy.get('.close').contains('Close').should('exist')



})
})