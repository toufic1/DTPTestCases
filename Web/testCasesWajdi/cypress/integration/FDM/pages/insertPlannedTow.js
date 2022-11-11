class insertPlannedTow{
    constructor(){}

    getSave(){
        return cy.get(".btn-green")
    }
    getSaveYes(){
        return cy.get(".save_yes")
    }

    getClose(){
        return cy.get(".dialogBox__header__close")
    }

    getTitle(){
        return cy.get(".hvfwQm").contains("Insert Planned Tow")
    }

    getItem(item){
        return cy.get(`[data-cy = '${item}'`)
    }

    getLabel(label){
        return cy.get(".towViewWrapper").contains(label)
    }

    getErrorMessage(){
        return cy.get('[type = "error"] div[type = "error"]')
    }

    fillAllMandatoryFields(){
        const alphabet = ["a","b","c","d","e","f","g","h","i","k","l","m","n"]

        this.getItem("sibt").type("02:00")
        this.getItem("sobt").type("02:00")
        this.getItem("departureStand").click().find("[data-testid= 'dynamic-DropDownPopUp']").contains("A08").click()
        this.getItem("arrivalStand").click().find("[data-testid= 'dynamic-DropDownPopUp']").contains("B01").click()
        
        
        const rn = Math.floor(Math.random()*13)

        this.getItem("registration").click().find("input").first().type(alphabet[rn])

        this.getItem("registration").find("[data-testid= 'dynamic-DropDownPopUp']")
            .find(".dropdown_bodtTr").eq(rn).click({force:true})
    }


    getColumn(column){
        return cy.get(".ag-center-cols-container").find(`[col-id = '${column}']`)
    }

    getDeleteMessage(){
        return cy.get(".movementDialogTitle h2")
    }

    getDeleteReg(){
        return cy.get(".rowBodt_dmovement span").first()
    }
    
    getDeleteYes(){
        return cy.get(".movementDialogFooter .btn-green")
    }

    getSearchFilter(){
        return cy.get(".filter--search--input").eq("2")
    }
}

export {insertPlannedTow}