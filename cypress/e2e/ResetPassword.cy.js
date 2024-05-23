import { When, Then } from "@badeball/cypress-cucumber-preprocessor";

describe('Forgot Password test', () => {
  it('I Reset Password for a Return-it User', () => {
    cy.visit('https://membersvic.returnit.com.au/')
    cy.contains('Welcome').should('exist')
    cy.contains('Login to CDS Vic East to continue.').should('exist')
    cy.get('form').contains('Forgot password?').click()
    cy.get("#email").type("abhishek@me.com")
    cy.get('form').contains('Continue').click()
    cy.contains('Check Your Email').should('exist')
    cy.contains('Resend email').should('exist')
  })
})