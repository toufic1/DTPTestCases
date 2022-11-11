describe('My third Test Suite', function() 
{
 
it('My third test case',function() {
 
cy.visit("http://185.114.89.129:31080/");

cy.get('.mui_input_group  [name=username]').type('qauser')
cy.get('.mui_input_group  [name=password]').type('QAuser@123')
cy.get('.mui_input_group  [name=client]').type('DXB')
cy.get(':nth-child(3) > .login_form_btn').click()


cy.contains('FDM').click({force: true})
cy.get('.MuiIconButton-label > .sapUiIcon').click()
cy.get('.MuiTypography-root').contains('Insert Movement').click()
cy.get('.dialogBox__header__close').should('be.visible')
cy.get('.dialogBox__header__close').click()

//full screen Icone

cy.get('.full_screen_icon').should('be.visible')

//should be close









})
})