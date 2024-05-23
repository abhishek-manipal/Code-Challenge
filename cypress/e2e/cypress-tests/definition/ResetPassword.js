import { And, Given, Then, When } from '@badeball/cypress-cucumber-preprocessor';


Given('I go to the return-it app', () => {
    cy.visit('https://membersvic.returnit.com.au/')
    cy.contains('Welcome').should('exist')
    cy.contains('Login to CDS Vic East to continue.').should('exist')
});

When('I click on forgot password button', () => {
    cy.get('form').contains('Forgot password?').click()

});

And('provide valid email credentials', () => {
    cy.get("#email").clear()
    cy.get("#email").type("abhishek@me.com")
    cy.get('form').contains('Continue').click()
});

And('provide ivalid email credentials', () => {
    cy.get("#email").clear()
    cy.get("#email").type("InvalidEmailFormat")
    cy.get('form').contains('Continue').click()

});

Then('the reset email is sent succesfully ', () => {
    cy.contains('Check Your Email').should('exist')
    cy.contains('Resend email').should('exist')

});

Then('the Error message is shown to user', () => {
    cy.contains('Email is not valid').should('exist')
    cy.contains('Back to Return-It CDS Vic East').should('exist')

});

    
    


    

   
    
    
  
  
  