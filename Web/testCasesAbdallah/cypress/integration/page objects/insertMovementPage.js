/// <reference types = "Cypress"/>

class InsertMovementPage {


    ArrFlightNumberField() {

        const field = cy.get("[data-cy='arrivalFdmFltOpsView.airlineIata']")

        return field

        return this

    }

    //**************************Arrival Fields *************************************/

    ArrAdepField() {
        const field = cy.get("[data-cy='arrivalFdmFltOpsView.originIcao']")
        return field
        return this
    }

    ArrStatusField() {
        const field = cy.get("[data-cy='arrivalFdmFltOpsView.status']")
        return field
        return this
    }


    ArrSIBTField() {


        const field = cy.get("[data-cy='arrivalFdmFltOpsView.sibt']")
        return field
        return this

    }




    ArrEIBTField() {


        const field = cy.get("[data-cy='arrivalFdmFltOpsView.eibt']")
        return field
        return this

    }

    ArrCategoryField() {
        const field = cy.get("[data-cy='arrivalFdmFltOpsView.natureCode']")
        return field
        return this
    }



    ArrServiceField() {

        const field = cy.get("[data-cy='arrivalFdmFltOpsView.serviceType']")
        return field
        return this
    }


    ArrTerminalField() {

        const field = cy.get("[data-cy='arrivalFdmFltOpsView.terminal']")
        return field
        return this
    }



    ArrVectorField() {

        const field = cy.get("[data-cy='arrivalFdmFltOpsView.vector']")
        return field
        return this
    }

    ArrRegistrationField() {

        const field = cy.get("[data-cy='acrRegn']")
        return field
        return this
    }


    ArrCallSignField() {

        const field = cy.get("[data-cy='arrivalFdmFltOpsView.callSgn']")
        return field
        return this
    }

    ArrnumberField(){

        const field =  cy.get('[data-cy="arrivalFdmFltOpsView.number"] .headerInput')
        return field
        return this
    }

    ArrSuffixField(){

        const field =  cy.get('[data-cy="arrivalFdmFltOpsView.suffix"] .headerInput')
        return field
        return this
    }


     ArrCodeSharesArrowClick()
     {
       const field = cy.get('.fdmArrivalGrid__header .form_inner_header   .sc-jSMfEi .si-navigation-down-arrow')
       field.click()
       return this
     }

    depnumberField(){

        const field =  cy.get('[data-cy="departureFdmFltOpsView.number"] .headerInput')
        return field
        return this
    }

    depSuffixField(){

        const field =  cy.get('[data-cy="departureFdmFltOpsView.suffix"] .headerInput')
        return field
        return this
    }
    





    //**************************departure Fields *************************************/

    depFlightNumberField() {

        const field = cy.get("[data-cy='departureFdmFltOpsView.airlineIata']")

        return field

        return this

    }



    depTerminalField() {

        const field = cy.get("[data-cy='departureFdmFltOpsView.terminal']")
        return field
        return this
    }



    depVectorField() {

        const field = cy.get("[data-cy='departureFdmFltOpsView.vector']")
        return field
        return this
    }


    depCallSignField() {

        const field = cy.get("[data-cy='departureFdmFltOpsView.callSgn']")
        return field
        return this
    }


    depCategoryField() {
        const field = cy.get("[data-cy='departureFdmFltOpsView.natureCode']")
        return field
        return this
    }



    depServiceField() {

        const field = cy.get("[data-cy='departureFdmFltOpsView.serviceType']")
        return field
        return this
    }

    depeobtField() {

        const field = cy.get("[data-cy='departureFdmFltOpsView.eobt']")
        return field
        return this
    }


    depsobtField() {

        const field = cy.get("[data-cy='departureFdmFltOpsView.sobt']")
        return field
        return this
    }


    depACTypeField() {

        const field = cy.get("[data-cy='acrType']")
        return field
        return this
    }

    depVIAField() {

        const field = cy.get('.moment_departure   .sc-jSMfEi  .sc-jOhDuK')
        return field
        return this
    }

    depADESField() {

        const field = cy.get("[data-cy='departureFdmFltOpsView.originIcao']")
        return field
        return this
    }


    Save(){

    cy.get('.fdm_tbx').contains('Save').click()
    cy.get('.save_yes').click()

    }











}

export default InsertMovementPage