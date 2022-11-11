class insertMovement{

    constructor(){}

    getInsertWindow(){
        return cy.get(".MuiDialogContent-root")
    }

    getTitle(){
        return cy.get(".menu_close").next()
    }

    getMaximizeIcon(){
        return cy.get(".full_screen_icon")
    }

    getSaveButton(){
        return cy.get(".formModule_header").contains("Save")
    }

    getCloseButton(){
        return cy.get(".dialogBox__header__close").first()
    }

    getArrivalSection(){
        return cy.get(".moment_arrival")
    }

    getDepartureSection(){
        return cy.get(".moment_departure")
    }

    getArrivalLogo(){
        return cy.get(".arrivalGridLeft .form_inner_header i.si-flight")
    }

    getDepartureLogo(){
        return cy.get(".DepartureGridRight .form_inner_header i.si-flight")
    }

    getArrivalItem(data){
        return cy.get(`[data-cy = 'arrivalFdmFltOpsView.${data}'`)
    }

    getArrivalFlightDate(){
        return cy.get("[origin='arrivalFdmFltOpsView']")
    }

    getRegistration(){
        return cy.get(".arr_reg .searchable_dropdown")
    }

    getAircraftType(){
        return cy.get(".dep_reg .searchable_dropdown")
    }

    getArrivalVia(){
        return cy.get(".moment_arrival .viaRow .dynamicDropContainer")
    }

    getArrivalCodeShareRow(){
        return cy.get(".arrivalGridLeft .codeShareRow")
    }

    getDepartureItem(option){
        return cy.get(`[data-cy = 'departureFdmFltOpsView.${option}'`)
    }

    getDepartureDate(){
        return cy.get("[origin = 'departureFdmFltOpsView']")
    }

    getDepartureVia(){
        return cy.get(".moment_departure .viaRow .dynamicDropContainer")
    }

    getDepartureCodeShareRow(){
        return cy.get(".DepartureGridRight .codeShareRow")
    }

    getArrivalLabel(label){
        return cy.get(".moment_arrival").contains(label)
    }

    getDepartureLabel(label){
        return cy.get(".moment_departure").contains(label)
    }

    getSaveYes(){
        return cy.get(".save_yes")
    }

    getErrorMessage(){
        return cy.get("[title='Error'] div[type='error']")
    }


    fillAllDepartureMandatoryfields(nb){
        //ariplane
        this.getDepartureItem("airlineIata").click()

        this.getDepartureItem("airlineIata").find("[data-testid = 'dynamic-DropDownPopUp']")
        .contains("0B").click()

        this.getDepartureItem("number").type(nb)

        //AC
        this.getAircraftType().click()
        this.getAircraftType().find("[data-testid='dynamic-DropDownPopUp']").contains("L12").click({force:true})
        
        //category 
        this.getDepartureItem("natureCode").click()
        this.getDepartureItem("natureCode").find("[data-testid='dynamic-DropDownPopUp']").contains("AF").click()

        //Ades*
        this.getDepartureItem("originIcao").click()
        this.getDepartureItem("originIcao").find("[data-testid='dynamic-DropDownPopUp']").contains("SANI").click({force:true})
    }

    fillAllArrivalMandatoryfields(nb){
        
        //ariplane
        this.getArrivalItem("airlineIata").click()

        this.getArrivalItem("airlineIata").find("[data-testid = 'dynamic-DropDownPopUp']")
        .contains("0B").click()
        
        this.getArrivalItem("number").type(nb)

        //Adep*
        this.getArrivalItem("originIcao").click()
        this.getArrivalItem("originIcao").find("[data-testid='dynamic-DropDownPopUp']").contains("SAMA").click({force:true})
    
         //category 
        this.getArrivalItem("natureCode").click()
        this.getArrivalItem("natureCode").find("[data-testid='dynamic-DropDownPopUp']").contains("AF").click() 
    
         //AC
        this.getAircraftType().click({force:true})
        this.getAircraftType().find("[data-testid='dynamic-DropDownPopUp']").contains("L12").click({force:true})
    }

    getSearchFilter(){
        return cy.get(".search .search--input")
    }

    getItemDropDown(item){
        return cy.wrap(item).find("[data-testid = 'dynamic-DropDownPopUp']")
    }

    getItemDropDownBody(item){
        return cy.wrap(item).find('[data-testid="DynamicDropDown-popup-body"]')
    }

    getItemInput(item){
        return cy.wrap(item).find("input").first()
    }

    getErrorNotifier(item){
        return cy.wrap(item).find(".error_NotiFier")
    }

    save(){
        this.getSaveButton().click()
        this.getSaveYes().click()
    }

    fillItemDropdown(item, value){
        this.getItemDropDown(item).contains(value).click({force:true})
    }

    clearDropDownField(field){
        cy.wrap(field).click().clear()
    }
}

export {insertMovement}