/// <reference types="Cypress" />
import {FDM} from "./pages/FDM"
import {insertMovement} from "./pages/insertMovement"

describe("insert movments" , ()=>{
    
    const fdm = new FDM()
    const im = new insertMovement()
    
    beforeEach(()=>{
        cy.contains("FDM").click({force:true})
        fdm.clickTopLeftIconOption("Insert Movement")
    })

    it("TC_013", () => {
        im.getTitle().should("have.text","Insert Movement")
        im.getSaveButton().should("be.visible")
        im.getCloseButton().should("be.visible")
        im.getArrivalSection().should("be.visible")
        im.getDepartureSection().should("be.visible")
        im.getArrivalLogo().should("be.visible")
        im.getDepartureLogo().should("be.visible")

        im.getMaximizeIcon().should("be.visible")
    })

    it("TC_014", ()=>{
        im.getMaximizeIcon().click()
    })

    it("TC_015",()=>{
        im.getCloseButton().click({force:true})
        im.getInsertWindow().should("not.exist")
    })

    it("TC_016", () => {
        // arrival date
        im.getArrivalFlightDate().should("be.visible")

        //registration
        im.getRegistration().should("be.visible")
        
        //aircraft 
        im.getAircraftType().should("be.visible")

        //status
        im.getArrivalItem("status").should("be.visible")
        
        //Adep*
        im.getArrivalItem("originIcao").should("be.visible")
        
        //category 
        im.getArrivalItem("natureCode").should("be.visible")
        
        //vector
        im.getArrivalItem("vector").should("be.visible")

        //serive
        im.getArrivalItem("serviceType").should("be.visible")

        // sibt
        im.getArrivalItem('sibt').should("be.visible")
        
        // eibt
        im.getArrivalItem("eibt").should("be.visible")

        //terminal
        im.getArrivalItem("terminal").should("be.visible")

        //number
        im.getArrivalItem("number").should("be.visible")
        
        //suffix
        im.getArrivalItem("suffix").should("be.visible")

        //call sign
        im.getArrivalItem("callSgn").should("be.visible")

        //airplane
        im.getArrivalItem("airlineIata").should("be.visible")
        
        // via
        im.getArrivalVia().should("be.visible")
        
        //code share row
        im.getArrivalCodeShareRow().should("be.visible")

    })

    it("TC_017", () => {
        //status
        im.getDepartureItem("status").should("be.visible")
        
        //Ades*
        im.getDepartureItem("originIcao").should("be.visible")
        
        //category 
        im.getDepartureItem("natureCode").should("be.visible")
        
        //vector
        im.getDepartureItem("vector").should("be.visible")

        //serive
        im.getDepartureItem("serviceType").should("be.visible")

        // sobt
        im.getDepartureItem('sobt').should("be.visible")
        
        // eobt
        im.getDepartureItem("eobt").should("be.visible")

        //terminal
        im.getDepartureItem("terminal").should("be.visible")

        //number
        im.getDepartureItem("number").should("be.visible")
        
        //suffix
        im.getDepartureItem("suffix").should("be.visible")

        //call sign
        im.getDepartureItem("callSgn").should("be.visible")

         //aircraft 
        im.getAircraftType().should("be.visible")

        //registration
        im.getRegistration().should("be.visible")

        // departure date
        im.getDepartureDate().should("be.visible")

        //via
        im.getDepartureVia().should("be.visible")
        
        //code shares
        im.getDepartureCodeShareRow().should("be.visible")

        //airplan
        im.getDepartureItem("airlineIata").should("be.visible")
    })

    it("TC_018", () => {
        
        im.getArrivalLabel("ADEP").should("contain.text","\*")
        im.getArrivalLabel("Category").should("contain.text","\*")
        im.getArrivalLabel("SIBT").should("contain.text","\*")

        im.getDepartureLabel("ADES").should("contain.text","\*")
        im.getDepartureLabel("Category").should("contain.text","\*")
        im.getDepartureLabel("SOBT").should("contain.text","\*")    
    })

    it("TC_019",()=>{
        
        //number
        im.getArrivalItem("number").should("be.visible")
        
        //suffix
        im.getArrivalItem("suffix").should("be.visible")

        im.getArrivalItem("airlineIata").should("be.visible").click()
        .then((e)=>{

            im.getItemDropDown(e).within(()=>{
                
                cy.root().contains("IATA").should("be.visible")
                cy.root().contains("ICAO").should("be.visible")
                cy.root().contains("NAME").should("be.visible")
            })
        })
    
        //Departure

        //number
        im.getDepartureItem("number").should("be.visible")
        
        //suffix
        im.getDepartureItem("suffix").should("be.visible")
        
        im.getDepartureItem("airlineIata").should("be.visible").click()
        .then((e)=>{

            im.getItemDropDown(e).within(()=>{
                
                cy.root().contains("IATA").should("be.visible")
                cy.root().contains("ICAO").should("be.visible")
                cy.root().contains("NAME").should("be.visible")
            })
        })
        
    })

    it("TC_020",()=>{

        im.getArrivalItem("airlineIata").click().then((e)=>{
            im.getItemDropDown(e).contains("0B").click()
            im.getItemInput(e).should("have.value","0B")
        })
        
    })

    it("TC_021", () => {

        im.getArrivalItem("airlineIata").click().then((e)=>{
            im.getItemDropDown(e).contains("0B").click()
        })

         //number
        im.getArrivalItem("number").then((number)=>{
            
            im.getArrivalItemInput(number).type("abc")
            
            im.getErrorNotifier(number).should("be.visible")
            
            im.getArrivalItemInput(number).clear()
            im.getArrivalItemInput(number).type("123")

            im.getErrorNotifier(number).should("not.exist")

            im.getArrivalItemInput(number).should("have.value","123")
        })

    })

    it("TC_022", () => {

        im.getArrivalItem("airlineIata").click().then((e)=>{
            im.getItemDropDown(e).contains("0B").click()
        })

        //suffix
        im.getArrivalItem("suffix").then((suffix)=>{

            im.getItemInput(suffix).type("abc")
            im.getErrorNotifier(suffix).should("be.visible")
            im.getItemInput(suffix).clear()
            im.getItemInput(suffix).type("a")
            im.getErrorNotifier(suffix).find(".error_NotiFier").should("not.exist")
        })
    })

    it("TC_023", () => {

        const random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random.toString())
        im.fillAllDepartureMandatoryfields(random.toString())
        im.save()
        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("be.visible")
    })

    it("TC_024", ()=>{

        im.getArrivalCodeShareRow().click().then((e)=>{
            im.getItemDropDownBody(e).find(".si-add").click()
            im.getItemDropDownBody(e).find(".si-delete").click()
            im.getItemDropDownBody(e).find(".si-less").should("be.visible")
        })
        
        im.getArrivalItem("codeShares[0].flightNumber").should("be.visible").type("123")
        im.getArrivalItem("codeShares[0].flightSuffix").should("be.visible").type("A")

        im.getArrivalItem("codeShares[0].airline").should("be.visible").click()
                .then((e)=> im.getItemDropDown(e).contains("0B").click() )

        im.getArrivalCodeShareRow().find(".dynamicDropContainer .NonEditable").should("have.text", "1")
    })

    it("TC_025", () => {


        im.getArrivalCodeShareRow().click().then((e)=>{

        im.getItemDropDownBody(e).find(".si-delete").click()
        
        for (let i = 0; i < 3; i++) {
        
            im.getItemDropDownBody(e).find(".si-add").click()

            im.getArrivalItem(`codeShares[${i}].flightNumber`).parent().parent().find("i.si-less")
            .should("be.visible")

            im.getArrivalItem(`codeShares[${i}].flightNumber`).should("be.visible").type("123")
    
            im.getArrivalItem(`codeShares[${i}].flightSuffix`).should("be.visible").type("A")
    
            im.getArrivalItem(`codeShares[${i}].airline`).should("be.visible").click()
                .then((e)=> im.getItemDropDown(e).contains("0B").click())
        }
        })

        im.getArrivalCodeShareRow().find(".dynamicDropContainer .NonEditable").should("have.text", "3")

    })

    it("TC_026", () => {

        im.getArrivalCodeShareRow().click()
        
        im.getArrivalCodeShareRow().find('[data-testid="DynamicDropDown-popup-body"]')
        .find(".si-add").click()

        im.getArrivalCodeShareRow().find('[data-testid="DynamicDropDown-popup-body"]')
        .find(".si-delete").click()

        im.getArrivalItem("codeShares[0].flightNumber").should("be.visible")
        im.getArrivalCodeShareRow().find(".dynamicDropContainer .NonEditable").should("have.text", "1")

        im.getArrivalCodeShareRow().find('[data-testid="DynamicDropDown-popup-body"]')
        .find(".si-less").click()

        im.getArrivalItem("codeShares[0].flightNumber").should("not.exist")
        im.getArrivalCodeShareRow().find(".dynamicDropContainer .NonEditable").should("have.text", "0")
    })

    it("TC_027",()=>{
        im.getArrivalItem("callSgn").then((e)=> im.getItemInput(e).type("123").should("have.value","123"))
    })

    it("TC_028", () => {  
        // sibt
        im.getArrivalItem('sibt').then((e)=>{
            e.attr("value","14:25")
        })

        //Adep*
        im.getArrivalItem("originIcao").click()
        im.getArrivalItem("originIcao").find("[data-testid='dynamic-DropDownPopUp']")
        .contains("SAMA").click()

        //category 
        im.getArrivalItem("natureCode").click()
        im.getArrivalItem("natureCode").find("[data-testid='dynamic-DropDownPopUp']")
        .contains("AF").click()
    
        //registration
        im.getRegistration().click()
        im.getRegistration().find("[data-testid='dynamic-DropDownPopUp']")
        .contains("0005").click({force:true})
        
        im.save()

        im.getErrorMessage().should("contain.text","Please fill Call Sign or Flight Number for the arrival")
    })

    it("TC_029", () => {
        im.getArrivalFlightDate().then((e)=>{
            
            const displayedDate = e.text().replace("Arrival *","").split(".")
            var currentDate = new Date()
            
            assert.equal (parseInt(displayedDate[0]),currentDate.getDate(),"displayed day is not current day")
            assert.equal (parseInt(displayedDate[1]),currentDate.getMonth() + 1,"displayed month is not current month")
            assert.equal (parseInt(displayedDate[2]),currentDate.getFullYear(),"displayed year is not current year")
        })
    })

    it("TC_030", () => {

        // sibt
        im.getArrivalItem('sibt').then((e)=>{
            e.attr("value","14:25")
        })
        
        //ariplane
        im.getArrivalItem("airlineIata").click()

        im.getArrivalItem("airlineIata").find("[data-testid = 'dynamic-DropDownPopUp']")
        .contains("0B").click()
        
        im.getArrivalItem("number").type("123")

        //category 
        im.getArrivalItem("natureCode").click()
        im.getArrivalItem("natureCode").find("[data-testid='dynamic-DropDownPopUp']").contains("AF").click()
        
        //registration
        im.getRegistration().click()
        im.getRegistration().find("[data-testid='dynamic-DropDownPopUp']").contains("0005").click({force:true})
        
        im.getSaveButton().click()
        im.getSaveYes().click()

        im.getErrorMessage().should("contain.text","Please fill ADEP for the arrival")
    })

    it("TC_031", () => {         
        im.getArrivalVia().click()
        im.getArrivalVia().find("[data-testid='DynamicDropDown-popup-body']").as("dropdown")
        cy.get("@dropdown").find(".si-add").click()
        
        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].sibt'] ").should("be.visible")
        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].sobt'] ").should("be.visible")
        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].eibt'] ").should("be.visible")
        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].eobt'] ").should("be.visible")
        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].aldt'] ").should("be.visible")
        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].aobt'] ").should("be.visible")
        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].aibt'] ").should("be.visible")
        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].atot'] ").should("be.visible")

        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].viaIcao']").should("be.visible")
    })

    it("TC_032", () => {
        im.getArrivalVia().click()
        im.getArrivalVia().find("[data-testid='DynamicDropDown-popup-body']").as("dropdown")
        cy.get("@dropdown").find(".si-add").click()
        
        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].sibt'] ").then((e)=>{
            e.attr("value","00:00+17")
        })

        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].viaIcao']").click()
        
        cy.get("@dropdown").find(".dropdown_tBody").contains("SAMA").click({force:true})

        cy.get("@dropdown").find(".si-navigation-up-arrow").first().click()

        im.getArrivalVia().find(".NonEditable").should("have.text","1")
    })

    it("TC_033", () => {
        im.getArrivalVia().click()
        im.getArrivalVia().find("[data-testid='DynamicDropDown-popup-body']").as("dropdown")
        .then(()=>{
            const values = ["SAMA","SADS","SADZ"]
            for (let i = 0; i < 3; i++) {
                
                cy.get("@dropdown").find(".si-add").click()

                cy.get("@dropdown").find(`[data-cy = 'arrivalFdmFltOpsView.vias[${i}].sibt']`)
                    .type("02:17")
    
                cy.get("@dropdown").find(`[data-cy = 'arrivalFdmFltOpsView.vias[${i}].viaIcao']`).click()
            
                cy.get("@dropdown").find(`[data-cy = 'arrivalFdmFltOpsView.vias[${i}].viaIcao']`)
                    .find(".dropdown_tBody").contains(values[i]).click({force:true})
            }
        })
        
        cy.get("@dropdown").find(".si-navigation-up-arrow").first().click()

        im.getArrivalVia().find(".NonEditable").should("have.text","3")
    
    })

    it("TC_034", () => {
        im.getArrivalVia().click()
        im.getArrivalVia().find("[data-testid='DynamicDropDown-popup-body']").as("dropdown")
        cy.get("@dropdown").find(".si-add").click()
        
        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].sibt'] ").then((e)=>{
            e.attr("value","00:00+17")
        })

        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].viaIcao']").click()
        
        cy.get("@dropdown").find(".dropdown_tBody").contains("SAMA").click({force:true})

        cy.get("@dropdown").find(".si-delete").click()
        cy.get("@dropdown").find(".si-less").click()

        cy.get("@dropdown").find("[data-cy = 'arrivalFdmFltOpsView.vias[0].viaIcao']").should("not.exist")
        cy.get("@dropdown").find(".si-navigation-up-arrow").first().click()
        im.getArrivalVia().find(".NonEditable").should("have.text","0")

    })
    
    it("TC_035", () => {
        const random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random.toString())
        im.fillAllDepartureMandatoryfields(random.toString())
        im.save()
        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("be.visible")
    });

    it("TC_036", () => {
        im.getArrivalItem("status").click().then((e)=>{
            im.getItemDropDown(e).within(()=>{
                cy.root().contains("Diverted").should("be.visible")
                cy.root().contains("Cancelled").should("be.visible")
                cy.root().contains("Non Operational").should("be.visible")
                cy.root().contains("Operational").should("be.visible")
                cy.root().contains("Scheduled").should("be.visible")
            })
        })

        const random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random.toString())
        im.fillAllDepartureMandatoryfields(random.toString())
        im.save()
        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("be.visible")
    });

    it("TC_037", () => {
        im.getArrivalItem("status").click().then((e)=>{
            im.getItemDropDown(e).contains("DV").click()
            im.getItemInput(e).should("have.value","DV")
        })
    })

    it("TC_038", () => {
        im.getArrivalItem("serviceType").click().then((e)=>{
            im.getItemDropDown(e).within(()=>{
                cy.root().contains("CODE").should("be.visible")
                cy.root().contains("Name").should("be.visible")
            })
        })
        
        const random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random.toString())
        im.fillAllDepartureMandatoryfields(random.toString())
        im.save()
        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("be.visible")
    })

    it("TC_039", () => {
        im.getArrivalItem("serviceType").click()
        im.getArrivalItem("serviceType").find("[data-testid = 'dynamic-DropDownPopUp']")
            .contains("A").click()

        im.getArrivalItem("serviceType").find("input").first().should("have.value","A")
    })

    it("TC_040", () => {
        im.getArrivalItem("natureCode").click().then((e)=>{
            im.getItemDropDown(e).within(()=>{
                cy.root().contains("CODE").should("be.visible")
                cy.root().contains("Name").should("be.visible")
            })       
        })
        
        // fill all mandatory fields except category
        const random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random)
        
        //clear categroy
        im.getArrivalItem("natureCode").then((e)=>im.clearDropDownField(e))

        im.save()

        im.getErrorMessage().should("contain.text","Please fill Category for the arrival")

    });

    it("TC_041", () => {
        im.getArrivalItem("natureCode").click().then((e)=>{
        im.getItemDropDown(e).contains("AF").click() 
        im.getItemInput(e).should("have.value","AF")})
    });

    it("TC_042", () => {
        im.getArrivalItem("vector").click().then((e)=>{
            im.getItemDropDown(e).within(()=>{
                cy.root().contains("CODE").should("be.visible")
                cy.root().contains("IATA").should("be.visible")
                cy.root().contains("Name").should("be.visible")
            })})
    });

    it("TC_043", () => {
        im.getArrivalItem("vector").click().then((e)=>{
            im.getItemDropDown(e).contains("DXB").click()
            im.getItemInput(e).should("have.value","D")})
    });

    it("TC_044", () => {
        im.getArrivalItem("terminal").click().then((e)=>{
            im.getItemDropDown(e).within(()=>{
                cy.root().contains("LABEL").should("be.visible")
                cy.root().contains("Name").should("be.visible")
            })})
    });

    it("TC_045", ()=>{
        im.getArrivalItem("terminal").click().then((e)=>{
            im.fillItemDropdown(e,"T1")
            im.getItemInput(e).should("have.value","T1")})
    })

    it("TC_046", () => {
        const random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random)

        //clear sibt
        im.getArrivalItem('sibt').clear()
        im.save()
        im.getErrorMessage().should("contain.text","Please fill Arrival Date")
    });

    it("TC_047", () => {
        im.getArrivalItem('sibt').clear().type("02:00")
    
        const currentDate = new Date()
        //check arrival time
        im.getArrivalFlightDate().then((e)=>{
            
            const displayedDate = e.text().replace("Arrival *","").split(".")
            
            assert.equal (parseInt(displayedDate[0]),currentDate.getDate(),"displayed day is not current day")
            assert.equal (parseInt(displayedDate[1]),currentDate.getMonth() + 1,"displayed month is not current month")
            assert.equal (parseInt(displayedDate[2]),currentDate.getFullYear(),"displayed year is not current year")
        })

        //future date
        im.getArrivalItem('sibt').clear().type("02:00+1")

         //check arrival time
        im.getArrivalFlightDate().then((e)=>{
            
            const displayedDate = e.text().replace("Arrival *","").split(".")
            
            let tomorrow =  new Date()
            tomorrow.setDate(currentDate.getDate() + 1)
            
            assert.equal (parseInt(displayedDate[0]),tomorrow.getDate(),"displayed day is not current day")
            assert.equal (parseInt(displayedDate[1]),tomorrow.getMonth() + 1,"displayed month is not current month")
            assert.equal (parseInt(displayedDate[2]),tomorrow.getFullYear(),"displayed year is not current year")
        })

        //previous date
        im.getArrivalItem('sibt').clear().type("02:00-1")

         //check arrival time
        im.getArrivalFlightDate().then((e)=>{
            
            const displayedDate = e.text().replace("Arrival *","").split(".")

            let yesterday =  new Date()
            yesterday.setDate(currentDate.getDate() - 1)
            
            assert.equal (parseInt(displayedDate[0]),yesterday.getDate(),"displayed day is not current day")
            assert.equal (parseInt(displayedDate[1]),yesterday.getMonth() + 1,"displayed month is not current month")
            assert.equal (parseInt(displayedDate[2]),yesterday.getFullYear(),"displayed year is not current year")
        })
    });

    it("TC_048", () => {

        const random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random.toString())
        im.save()
        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("be.visible")
    })

    it("TC_049", () => {
        im.getArrivalItem('eibt').clear().type("02:00")

        const today = new Date()

        let random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random.toString())
        im.save()
        cy.wait(4000)

        fdm.getColumn("eibt").last().then((e)=>{
            
            const displayedDate = e.text().split("/")        
    
            assert.equal(parseInt(displayedDate[1]),today.getDate(),"displayed day is not current day")
            assert.equal(displayedDate[0]," 02:00")
        })

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()

        //future date
        im.getArrivalItem('eibt').clear().type("02:00+1")

        random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random.toString())
        im.save()
        cy.wait(4000)

        fdm.getColumn("eibt").last().then((e)=>{
            const displayedDate = e.text().split("/")        
            
            let tomorrow =  new Date()
            tomorrow.setDate(today.getDate() + 1)
            
            assert.equal(parseInt(displayedDate[1]),tomorrow.getDate(),"displayed day is not current day")
            assert.equal(displayedDate[0]," 02:00")
        })

        fdm.getTopLeftIcon().click()
        fdm.getTopLeftIconOption("Insert Movement").click()
        //previous date
        im.getArrivalItem('eibt').clear().type("02:00-1")

        random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random.toString())
        im.save()
        cy.wait(4000)

        fdm.getColumn("eibt").last().then((e)=>{
            
            const displayedDate = e.text().split("/")        
            let yesterday =  new Date()
            yesterday.setDate(today.getDate() - 1)

            assert.equal(parseInt(displayedDate[1]),yesterday.getDate(),"displayed day is not current day")
            assert.equal(displayedDate[0]," 02:00")
        })
    });

    it("TC_050", () => {
        im.getRegistration().click().then((e)=>im.getItemDropDown(e).should("be.visible"))
        const random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random.toString())
        im.save()
        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("be.visible")
    })

    it("TC_051", () => {
        im.getRegistration().click().then((e)=>{
            im.fillItemDropdown(e,"0005")
            im.getItemInput(e).should("have.value","0005")
        })
    });

    it("TC_052", () => {
        const random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random)
        im.getAircraftType().then((e)=>im.clearDropDownField(e))
        im.save()
        im.getErrorMessage().should("contain.text","Please select the aircraft type")
    });

    it("TC_053", () => {
        im.getAircraftType().click()
        im.getAircraftType().then((e)=>{
            im.fillItemDropdown("L12")
            im.getItemInput(e).should("have.value","L12")
        })
    });

    it("TC_054" , ()=>{
        const random = Math.floor(Math.random()*10000)
        im.fillAllDepartureMandatoryfields(random)
        im.getDepartureItem("originIcao").then((e)=>im.clearDropDownField(e))
        im.save()
        im.getErrorMessage().should("contain.text","Please fill ADES for the Departure")

        //Ades*
        im.getDepartureItem("originIcao").click().then((e)=>{
            im.fillItemDropdown(e,"SANI")
            im.getItemInput(e).should("have.value","SANI")
        })
    })

    it("TC_055", () => {
        const random = Math.floor(Math.random()*10000)
        im.fillAllDepartureMandatoryfields(random)
        //clear sibt
        im.getDepartureItem('sobt').clear()
        im.save().click()
        im.getErrorMessage().should("contain.text","Please fill Departure date")
    });

    it("TC_056", () => {
        im.getDepartureItem('sobt').clear().type("02:00")

        //check arrival time
        im.getDepartureDate().then((e)=>{
            
            const displayedDate = e.text().replace("Departure *","").split(".")
            
            var currentDate = new Date()
            
            assert.equal (parseInt(displayedDate[0]),currentDate.getDate(),"displayed day is not current day")

            assert.equal (parseInt(displayedDate[1]),currentDate.getMonth() + 1,"displayed month is not current month")

            assert.equal (parseInt(displayedDate[2]),currentDate.getFullYear(),"displayed year is not current year")

        })

        //future date
        im.getDepartureItem('sobt').clear()
        im.getDepartureItem('sobt').type("02:00+1")

         //check arrival time
        im.getDepartureDate().then((e)=>{
            
            const displayedDate = e.text().replace("Departure *","").split(".")
            
            const today = new Date()
            let tomorrow =  new Date()
            tomorrow.setDate(today.getDate() + 1)
            
            assert.equal (parseInt(displayedDate[0]),tomorrow.getDate(),"displayed day is not current day")

            assert.equal (parseInt(displayedDate[1]),tomorrow.getMonth() + 1,"displayed month is not current month")

            assert.equal (parseInt(displayedDate[2]),tomorrow.getFullYear(),"displayed year is not current year")

        })
        //previous date
        im.getDepartureItem('sobt').clear()
        im.getDepartureItem('sobt').type("02:00-1")
        
        //check arrival time
        im.getDepartureDate().then((e)=>{
            
            const displayedDate = e.text().replace("Departure *","").split(".")
            
            const today = new Date()
            let yesterday =  new Date()
            yesterday.setDate(today.getDate() - 1)
            
            assert.equal (parseInt(displayedDate[0]),yesterday.getDate(),"displayed day is not current day")

            assert.equal (parseInt(displayedDate[1]),yesterday.getMonth() + 1,"displayed month is not current month")

            assert.equal (parseInt(displayedDate[2]),yesterday.getFullYear(),"displayed year is not current year")

        })
    });

    it("TC_057", () => {
        const random = Math.floor(Math.random()*10000)
        im.fillAllDepartureMandatoryfields(random.toString())
        im.save()  
        fdm.ChangeArrDep("Departure")
        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("be.visible")
    });

    it.skip("TC_058",()=>{
    })

    it("TC_059", () => {
        //utc
        
        im.getCloseButton().click()
        
        fdm.clickUTCOrLocal("UTC")
        
        fdm.getTopLeftIcon().click()
        
        fdm.getTopLeftIconOption("Insert Movement").click()

        im.getArrivalItem("eibt").type("02:00")
        
        let random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random)
        
        im.save()
        cy.wait(4000)

        im.getSearchFilter().type(random)
        fdm.getColumn("eibt").last().should("contain.text","02:00")


        //local

        cy.wait(3000)      
        
        fdm.clickUTCOrLocal("Local")
        fdm.getTopLeftIcon().click()
        
        fdm.getTopLeftIconOption("Insert Movement").click()

        im.getArrivalItem("eibt").type("08:00")        
        
        random = Math.floor(Math.random()*10000)
        im.fillAllArrivalMandatoryfields(random)
        im.save()
        cy.wait(4000)

        im.getSearchFilter().clear()
        im.getSearchFilter().type(random)
        fdm.getColumn("eibt").last().should("contain.text","08:00")
    });

    it("TC_060", () => {
        const random = Math.floor(Math.random()*10000)    
        im.fillAllArrivalMandatoryfields(random.toString())
        im.save()
        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("be.visible")
    });

    it("TC_061",()=>{
        const random = Math.floor(Math.random()*10000)
        im.fillAllDepartureMandatoryfields(random.toString())
        im.save()
        fdm.ChangeArrDep("Departure")
        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("be.visible")
    })

    it("TC_062", () => {
        const random = Math.floor(Math.random()*10000)
            
        im.fillAllArrivalMandatoryfields(random.toString())
        im.fillAllDepartureMandatoryfields(random.toString())
        im.save()
        
        cy.wait(5000)
        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("exist")
        
        fdm.ChangeArrDep("Departure")
        fdm.getColumn("flightNo").contains(random).should("exist")

        fdm.ChangeArrDep("Turnaround")
        fdm.getArrivalTurnaroundColumn("flightNo").contains(random).should("exist")
        fdm.getDepartureTurnaroundColumn("flightNo").contains(random).should("exist")
    });

    it("TC_063", () => {        
        const random = Math.floor(Math.random()*10000)

        im.fillAllArrivalMandatoryfields(random)
        im.fillAllDepartureMandatoryfields(random)

        im.getArrivalItem("sibt").clear()
        im.save()

        im.getErrorMessage().should("contain.text","Please fill Arrival Date")

        im.getCloseButton().click()
        cy.wait(5000)

        im.getSearchFilter().type(random)
        fdm.getColumn("flightNo").contains(random).should("not.exist")

        fdm.ChangeArrDep("Turnaround")

        fdm.getArrivalTurnaroundColumn("flightNo").contains(random).should("not.exist")
        fdm.getDepartureTurnaroundColumn("flightNo").contains(random).should("not.exist")
    });
})