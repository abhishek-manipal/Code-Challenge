


describe('Login test', () => {
  it('I test the login', () => {
    cy.visit('https://membersvic.returnit.com.au/')
    cy.contains('Welcome').should('exist')
    cy.contains('Login to CDS Vic East to continue.').should('exist')
    cy.get("#username").clear()
    cy.get("#username").type('abhishek.mishra.sydney@gmail.com')
    cy.get("#password").type('Navigate#1')
    cy.get('form').contains('Continue').click()
    
  })
})



