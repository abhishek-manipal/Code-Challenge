import { When, Then } from "@badeball/cypress-cucumber-preprocessor";

describe('template spec', () => {
  it('passes', () => {
    cy.visit('https://membersvic.returnit.com.au/')
    cy.contains('Welcome').should('exist')
    cy.contains('Login to CDS Vic East to continue.').should('exist')
    cy.get('form').contains('Forgot password?').click()
    cy.get("#email").type("InvalidEmailFormat")
    cy.get('form').contains('Continue').click()
    cy.contains('Email is not valid').should('exist')
    cy.contains('Back to Return-It CDS Vic East').should('exist')
    
  })
})