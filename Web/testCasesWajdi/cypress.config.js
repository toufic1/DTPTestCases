const { defineConfig } = require("cypress");

module.exports = defineConfig({
  "reporter": "cypress-multi-reporters",
  "reporterOptions": {
    "reporterEnabled": "mochawesome",
    "mochawesomeReporterOptions": {
      "reportDir": "cypress/reports/mocha",
      "quite": true,
      "overwrite": false,
      "html": false,
      "json": true
    }
  },
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },

    specPattern:"cypress/integration/*/*.cy.js",
    defaultCommandTimeout: 8000,
    trashAssetsBeforeRuns:false,
    retries: {
      "runMode": 1,
      "openMode": 0
    },
    "screenshotOnRunFailure": true,
    "screenshotsFolder": "cypress/reports/mochareports/assets"
  },
});
