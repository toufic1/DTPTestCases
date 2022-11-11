FROM cypress/base as test
WORKDIR '/usr/app'
COPY package.json .
RUN  npm install
COPY . .
RUN npm run test

FROM nginx 
COPY --from=test /usr/app/cypress/reports/mochareports /usr/share/nginx/html
COPY --from=test /usr/app/cypress/reports/mochareports/report.html /usr/share/nginx/html/index.html