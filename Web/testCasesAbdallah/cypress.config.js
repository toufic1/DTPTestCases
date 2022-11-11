const { defineConfig } = require("cypress");

module.exports = defineConfig({

  "reporter": "cypress-multi-reporters",
          "reporterOptions": {
              "reporterEnabled": "mochawesome",
              "mochawesomeReporterOptions": {
                  "reportDir": "cypress/reports/mocha",
                  "screenshotOnRunFailure": true,
                  "quite": true,
                  "overwrite": false,
                  "html": false,
                  "json": true
              }
            
          },
          "screenshotsFolder": "cypress/reports/mochareports/screenshots",
 

  
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
      
    },
    
   

    specPattern: 'cypress/integration/examples/*.js',
    defaultCommandTimeout: 10000,



    


    
       
  

  },


  trashAssetsBeforeRuns:false, //to not delete videos
  "screenshotOnRunFailure": true,
  //"screenshotsFolder": "cypress/reports/mochareports/assets"
  
   
    


});
