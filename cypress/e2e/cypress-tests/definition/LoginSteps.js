import { And, Then, When } from '@badeball/cypress-cucumber-preprocessor';

When('I login using registered credentials', () => {
    cy.get("#username").type('abhishek.mishra.sydney@gmail.com')
    cy.get("#password").type('Navigate#1')
    cy.get('form').contains('Continue').click()
});

And('I clear the username and password forms', () => {
    cy.get("#username").clear()
    cy.get("#password").clear()
});

Then('I am logged into dashboard successfully', () => {
    cy.visit('https://membersvic.returnit.com.au/dashboard')
});


    
    