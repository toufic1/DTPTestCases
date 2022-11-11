class FDM{

    constructor(){  
    }

    getTopLeftIcon(){
        return cy.get("button .MuiIconButton-label")
    }

    getTopLeftIconOption(option){
        return cy.get(".Grid_extended_menu").contains(option)
    }

    clickTopLeftIconOption(option){
        this.getTopLeftIcon().click()
        this.getTopLeftIconOption(option).click()
    }

    getArivalHeader(){
        return cy.get(".arrivalGridLeft .form_inner_header")
    }

    getDepartureHeader(){
        return cy.get(".DepartureGridRight .form_inner_header")
    }

    getArrivalAdep(){
        return cy.get(".moment_arrival").contains("ADEP*")
    }

    getArrivalVia(){
        return cy.get(".moment_arrival").contains("VIA")
    }

    getDepartureAdes(){
        return cy.get(".moment_departure").contains("ADES*")
    }

    getDepartureVia(){
        return cy.get(".moment_departure").contains("VIA")
    }

    getNBOfMovement(){
        return cy.get(".ag-group-child-count")
    }

    clickUTCOrLocal(zone){
        cy.get(".time-now--main").then((e)=>{
            if(!(e.text().includes(zone))){
                cy.wrap(e).click()
            }
        })
    }

    ChangeArrDep(type){
        cy.wait(4000)
        cy.get(".prime_tNexus_dropdown").click({force:true})
        cy.get(".prime_tNexus_dropdown").find(".p-dropdown-panel").contains(type).click({force:true})
    }


    getDepartureTurnaroundColumn(colid){
        return cy.get(".departureGrid .ag-center-cols-container").find(`[col-id='${colid}']`)
    }

    getArrivalTurnaroundColumn(colid){
        return cy.get(".arrivalGrid .ag-center-cols-container").find(`[col-id='${colid}']`)
    }

    getColumn(colid){
        return  cy.get(".ag-center-cols-container > div").find(`[col-id='${colid}']`)
    }

    deleteAllmovements(){
        cy.get(".ag-center-cols-container > div").each((e,index,ls) => {
            
            if (index < 2) return

            cy.wrap(e).click({force:true})
            this.getTopLeftIcon().click()
            this.getTopLeftIconOption("Delete Movement").click()
            cy.get(".btn-green").click()
            cy.wait(2000)
        })
    }
}

export{FDM}